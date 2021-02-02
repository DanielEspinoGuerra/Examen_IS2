
package model;

public class Film {
    
    private final String name;
    private final String genre;
    private final int rate;
    private final int year;
    private final int views;
    
    public Film(String name, String genre, int rate, int year, int views) {
        this.name = name;
        this.genre = genre;
        this.rate = rate;
        this.year = year;
        this.views = views;
    }
    
    public String getName() {
        return name;
    } 
    
    public String getGenre() {
        return genre;
    } 
    
    public int getRate() {
        return rate;
    } 
    
    public int getYear() {
        return year;
    } 
    
    public int getViews() {
        return views;
    } 

}
