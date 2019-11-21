import java.util.ArrayList;


/**
 * Write a description of class ArrayListDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieDriver
{
    
    public static void main(String[] args)
    {
        Movie moana   = new Movie("Moana", "Disney", 7.6, 2016);
        Movie frozen  = new Movie("Frozen", "Disney", 7.5, 2013);
        Movie bh6     = new Movie("Big Hero 6", "Disney", 7.8, 2014);
        
        Movie spirit  = new Movie("Spirited Away", "Ghibli", 8.6, 2003);
        Movie howel   = new Movie("Howl's Moving Castle", "Ghibli", 8.2, 2005);
        Movie ponyo   = new Movie("Ponyo", "Ghibli", 7.7, 2009);
        Movie marnie  = new Movie(" When Marnie Was There", "Ghibli", 7.7, 2014);
        
        Movie april   = new Movie("April and the Extraordinary World", "Indy", 7.3, 2015);
        Movie kubo    = new Movie("Kubo and the two strings", "Indy", 7.8,  2016);
        Movie anastasia = new Movie("Anastasia", "Indy", 7.1, 1997);
        Movie spider    = new Movie("Spider-Man: Into the Spider-Verse", "Indy", 8.4, 2019);
        
       Movie[] movieArray = {moana, frozen, bh6, spirit, howel, ponyo, marnie, april, kubo, 
           anastasia, spider};
        
       
       MovieListAL movieList = new MovieListAL(movieArray);
       
       ArrayList<Movie> highestRated = movieList.findHighestRatedByStudio();
       for (Movie name : highestRated)
           System.out.println(name.getName());
       
       

        
    }
    
    
    

}
