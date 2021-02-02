
package control;

import java.util.ArrayList;
import java.util.List;
import model.Film;
import view.CatalogueDisplay;

public class NewCommand implements Command{

    private final List<Film> films;
    private final CatalogueDisplay catalogueDisplay;
    private List<Film> filmsAux = new ArrayList<>();
    
    public NewCommand(List<Film> films, CatalogueDisplay catalogueDisplay) {
        this.films = films;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        catalogueDisplay.display(newFilm());
    }

    private List<Film> newFilm() {
        for (int i=0;i < films.size();i++) {
            if(i == 0) {
                filmsAux.add(films.get(i));
            } else if(films.get(i).getYear() > filmsAux.get(i-1).getYear()) {
                filmsAux.add(films.get(i));
                filmsAux.add(filmsAux.get(i-1));
                filmsAux.remove(filmsAux.get(i-1));
            } else {
                filmsAux.add(films.get(i));
            }
        }
        return filmsAux;
    } 
    
}
