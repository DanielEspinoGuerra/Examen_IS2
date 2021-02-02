
package app;

import java.util.ArrayList;
import java.util.List;
import model.Film;
import view.FilmLoader;

public class MockFilmsLoader implements FilmLoader{

    @Override
    public List<Film> load() {
        List<Film> list = new ArrayList<>();
        list.add(new Film("Harry", "Accion", 8, 2002, 40));
        list.add(new Film("Hola", "Comedia", 5, 2005, 5));
        list.add(new Film("Adios", "Terror", 9, 1998, 28));
        return list;
    }
    
}
