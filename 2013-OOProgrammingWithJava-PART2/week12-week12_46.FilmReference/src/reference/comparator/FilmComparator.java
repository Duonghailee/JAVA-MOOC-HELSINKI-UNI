/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author duonghaily
 */
public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
         this.ratings = ratings;
    }
    
    private double getAverage(Film f){
        double avg = 0;
        for(Rating r : ratings.get(f)){
            avg += r.getValue();
        }
        return avg/ratings.size();
    }

    @Override
    public int compare(Film o1, Film o2) {
        double result = getAverage(o2) - getAverage(o1);
        if(result > 0){
            return 1;
        }
        else if(result == 0){
            return 0;
        }
        else{
            return -1;
        }
        
    }
        
        
    
    
}
