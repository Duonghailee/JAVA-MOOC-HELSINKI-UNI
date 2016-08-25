/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author duonghaily
 */
public class RatingRegister {
    private Map<Film, List<Rating>> ratingReg;
    private Map<Person, HashMap<Film,Rating>> ratingByPerson;
    
    public RatingRegister(){
        this.ratingReg = new HashMap<Film, List<Rating>>();
        this.ratingByPerson = new HashMap<Person, HashMap<Film,Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(!this.ratingReg.containsKey(film)){
            this.ratingReg.put(film, new ArrayList<Rating>());
        }
        this.ratingReg.get(film).add(rating);
        
    }
    
    public List<Rating> getRatings(Film film){
        return this.ratingReg.get(film);
        
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return ratingReg;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        this.addRating(film, rating);
        if(!this.ratingByPerson.containsKey(person)){
            this.ratingByPerson.put(person, new HashMap<Film,Rating>());
        }
        this.ratingByPerson.get(person).put(film, rating);
    }
    
    public Rating getRating(Person person, Film film){
       
        Rating rate = this.ratingByPerson.get(person).get(film);
        
        if(rate == null){
            return Rating.NOT_WATCHED;
        }
        else{
            return rate;
        }
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        Map<Film, Rating> ratings = new HashMap<Film, Rating>();
        for(Person p : this.ratingByPerson.keySet()){
            if(p.equals(person)){
                ratings = this.ratingByPerson.get(p);
            }
        }
        return ratings;
    }
    
    public List<Person> reviewers(){
        List<Person> viewers = new ArrayList<Person>();
        viewers.addAll(this.ratingByPerson.keySet());
        return viewers;
    }
    
    // so sanh 1 person bat ki voi cac person con lai ve phim coi,
    // 
}
