
package control;

import java.util.List;
import model.Film;
import view.FilmDisplay;

public class NameFilmCommand implements Command{

    private String name;
    private final FilmDisplay filmDisplay;
    private final List<Film> films; 
    
    public NameFilmCommand(String name, List<Film> films, FilmDisplay filmDisplay) {
        this.name = name;
        this.filmDisplay = filmDisplay;
        this.films = films;
    }        
    
    @Override
    public void execute() {
        for (int i=0;i < films.size();i++) {
            if(films.get(i).getName() == name) {
                filmDisplay.displayF(films.get(i));
            }
        } 
    }
    
}
