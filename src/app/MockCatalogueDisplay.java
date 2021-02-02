
package app;

import java.util.List;
import model.Film;
import view.CatalogueDisplay;

public class MockCatalogueDisplay implements CatalogueDisplay {

    private List<Film> films;
    
    @Override
    public void display(List<Film> films) {
        this.films = films;
        for (int i=0;i < films.size();i++) {
            System.out.println(films.get(i).getName() + ", " + films.get(i).getGenre() 
                    + ", Valoración: " + films.get(i).getRate() + ", Año: " + films.get(i).getYear() + ", Visualizaciones " + films.get(i).getViews());
        }    
    }
    
}
