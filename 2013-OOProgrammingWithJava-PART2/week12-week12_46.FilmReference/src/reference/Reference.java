/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author duonghaily
 */
public class Reference {
    private final RatingRegister ratings;
    
    
    public Reference(RatingRegister ratings){
        this.ratings = ratings;
    }
    
    public Film recommendFilm(Person person){
        Film recommend = new Film("");
        // case 1, If user have not watch anyfilm, list get by person is empty
        if(this.ratings.getPersonalRatings(person).isEmpty()){
            
            Map<Film, List<Rating>> FilmRatingList = this.ratings.filmRatings();
            FilmComparator compare = new FilmComparator(FilmRatingList);
            List<Film> films = new ArrayList<Film>();
            // add all films in keyset() to films
            for(Film f : FilmRatingList.keySet()){
                films.add(f);
            }
            Collections.sort(films, compare);
            return films.get(0);
        }
        // now consider case when there is any film  user watched:
        else{
            int similarity = 0;
            int maxRate = 0;
            Map<Film, Rating> ratingsByUser = this.ratings.getPersonalRatings(person);
            List<Person> viewers = this.ratings.reviewers();
            viewers.remove(person); // remove person from the list of reviewers
   
            for(Person p : viewers){
                // every other person has their own film and rating hashMap, respectively
                Map<Film, Rating> ratingsByOther = this.ratings.getPersonalRatings(p);
                for(Film f : ratingsByUser.keySet()){
                    if(ratingsByOther.containsKey(f)){
                        similarity = ratingsByUser.get(f).getValue() * ratingsByOther.get(f).getValue();
                        if(similarity > 0){
                            Film recommendFilm= maxRatedFilm(p);
                            if(!ratingsByUser.containsKey(recommendFilm)){// check that user have not watched recommend film
                                return recommendFilm;
                            }
                                         
                        } 

                    }
                    
                }
            }
            return null;
        }
    }
    
    private Film maxRatedFilm(Person p){
     
        Map<Film, Rating> ratingsByPerson = this.ratings.getPersonalRatings(p);
        for(Film f : ratingsByPerson.keySet()){
            int ratingValue = ratingsByPerson.get(f).getValue();
            if(ratingValue == 3 || ratingValue == 5 ){
                return f;
            } 
        }
        return null; 
    }
}
