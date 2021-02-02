
package control;

import java.util.ArrayList;
import java.util.List;
import model.Film;
import view.CatalogueDisplay;


public class GenreCommand implements Command{

    private final List<Film> films;
    private List<Film> terrorFilms = new ArrayList<>();
    private List<Film> comediaFilms = new ArrayList<>();
    private List<Film> actionFilms = new ArrayList<>();
    private final CatalogueDisplay catalogueDisplay;
    
    public GenreCommand(List<Film> films, CatalogueDisplay catalogueDisplay) {
        this.films = films;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        genre();
        System.out.println("Películas de terror: ");    //Se que los sout() no van en control, pero todavía no se me ha ocurrido la manera de mostrarlos en el display
        catalogueDisplay.display(terrorFilms);
        System.out.println("Películas de comedia: ");
        catalogueDisplay.display(comediaFilms);
        System.out.println("Películas de acción: ");
        catalogueDisplay.display(actionFilms);
    }

    private void genre() {
        for (int i=0;i < films.size();i++) {
            if(films.get(i).getGenre() == "Terror") {
                terrorFilms.add(films.get(i));
            } else if(films.get(i).getGenre() == "Comedia") {
                comediaFilms.add(films.get(i));
            } else if(films.get(i).getGenre() == "Accion") {
                actionFilms.add(films.get(i));
            }
        }
    } 
}
