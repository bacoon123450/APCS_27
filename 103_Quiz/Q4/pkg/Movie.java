
package pkg;

public class Movie {
	String movieName;
    double rating;
    int numRatings;
    int revenue;

    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b;
        numRatings = c;
        revenue = d;
    }
    
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Current Rating: " + rating);
        System.out.println("Amount of reviews: " + numRatings);
        System.out.println("Total Revenue: " + revenue);
        System.out.println("");

    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRatings(){
        return rating;
    }
    public int getNumRating(){
        return numRatings;
    }
    public double addRating(double a){
        rating = (((rating*numRatings)+a)/(numRatings+1));
        return rating;
    }
    public double getMovieRating(){
        return rating;
    }
    public boolean compareRatings(Movie a){
        boolean fred = (a.getMovieRating()) < rating;
        return fred;
    }
    public String revenueToString(){
        int x = 0;
        int y = 0;
        int z = 0;
        x = (int)(revenue/1000000);
        y = ((int)(revenue/1000))-(x*1000);
        z = ((int)(revenue/1))-((x*1000000)+(y*1000));
        String finalnum = x+","+y+","+z;
        return finalnum;
    }
    public Movie pirateMovie(){

     
        return this;

    }



}


