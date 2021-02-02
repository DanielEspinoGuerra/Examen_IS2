
package control;

import java.util.ArrayList;
import java.util.List;
import model.Film;
import view.CatalogueDisplay;

//Muestra cátalogo con películas con una valoración igual o superior a 8

public class RatedCommand implements Command{

    private final List<Film> films;
    private final CatalogueDisplay catalogueDisplay;
    private final List<Film> ratedFilms = new ArrayList<>();;
    
    public RatedCommand(List<Film> films, CatalogueDisplay catalogueDisplay) {
        this.films = films;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        for (int i=0;i < films.size();i++) {
            if(films.get(i).getRate() >= 8) {
                ratedFilms.add(films.get(i));
            } 
        }
        catalogueDisplay.display(ratedFilms);
    }
    
}
