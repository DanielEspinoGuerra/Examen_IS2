
package control;

import java.util.List;
import model.Film;
import view.CatalogueDisplay;
import view.FilmLoader;

public class DefaultCommand implements Command{

    private final FilmLoader filmLoader;
    private final List<Film> films;
    private final CatalogueDisplay catalogueDisplay;

    public DefaultCommand(FilmLoader filmLoader, List<Film> films, CatalogueDisplay catalogueDisplay) {
        this.filmLoader = filmLoader;
        this.films = films;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        catalogueDisplay.display(films);
    }
    
}
