
package control;

import java.util.ArrayList;
import java.util.List;
import model.Film;
import view.CatalogueDisplay;

public class MostViewCommand implements Command{

    private final List<Film> films;
    private final CatalogueDisplay catalogueDisplay;
    private List<Film> filmsAux = new ArrayList<>();
    
    public MostViewCommand(List<Film> films, CatalogueDisplay catalogueDisplay) {
        this.films = films;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        catalogueDisplay.display(moreViews());
    }

    private List<Film> moreViews() {
        for (int i=0;i < films.size();i++) {
            if(i == 0) {
                filmsAux.add(films.get(i));
            } else if(films.get(i).getViews() > filmsAux.get(i-1).getViews()) {
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
