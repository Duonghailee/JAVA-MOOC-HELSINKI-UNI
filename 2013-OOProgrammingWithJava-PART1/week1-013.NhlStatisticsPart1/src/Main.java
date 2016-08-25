
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);

        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        // by penalty
       
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        // Print the statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    
    }
}
