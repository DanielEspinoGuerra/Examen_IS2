
package app;

import java.util.List;
import model.Film;
import view.FilmDisplay;

public class MockFilmDisplay implements FilmDisplay{
    private List<Film> films;

    @Override
    public void displayF(Film film) {
        System.out.println(film.getName() + ", " + film.getGenre() 
                    + ", Valoración: " + film.getRate() + ", Año: " + film.getYear() + ", Visualizaciones " + film.getViews());
    }
}
