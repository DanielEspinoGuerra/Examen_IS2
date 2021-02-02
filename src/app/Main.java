
package app;

import control.Command;
import control.DefaultCommand;
import control.ExitCommand;
import control.GenreCommand;
import control.MostViewCommand;
import control.NameFilmCommand;
import control.NewCommand;
import control.RatedCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import model.Film;
import view.CatalogueDisplay;
import view.FilmDisplay;

public class Main {

    private List<Film> films;
    private CatalogueDisplay catalogueDisplay = new MockCatalogueDisplay();
    private FilmDisplay filmDisplay = new MockFilmDisplay();
    private MockFilmsLoader filmsLoader = new MockFilmsLoader();
    private HashMap<String,Command> commands;
    
    public static void main(String[] args) {
        new Main().execute();
    }
    
    private void execute() {
        Scanner scanner = new Scanner(System.in);
        this.films = filmsLoader.load();
        this.commands = createCommands();
        Command defaultValue = null;
        while(true) {
            commands.getOrDefault(scanner.next(), defaultValue).execute();
        }
    }
    
    private HashMap<String, Command> createCommands() {
        HashMap<String, Command> result = new HashMap<>();
        result.put("q", new ExitCommand());
        result.put("g", new GenreCommand(films, catalogueDisplay));
        result.put("m", new MostViewCommand(films, catalogueDisplay));
        result.put("n", new NewCommand(films, catalogueDisplay));
        result.put("r", new RatedCommand(films, catalogueDisplay));
        result.put("d", new DefaultCommand(filmsLoader, films, catalogueDisplay));
        result.put("harry", new NameFilmCommand("Harry", films, filmDisplay));
        result.put("hola", new NameFilmCommand("Hola", films, filmDisplay));
        result.put("adios", new NameFilmCommand("Adios", films, filmDisplay));
        result.put("G", result.get("g"));
        result.put("Q", result.get("q"));
        result.put("D", result.get("d"));
        result.put("Harry", result.get("harry"));
        result.put("Hola", result.get("hola"));
        result.put("Adios", result.get("adios"));
        result.put("R", result.get("r"));
        result.put("M", result.get("m"));
        result.put("N", result.get("n"));
        return result;
    }    
}
