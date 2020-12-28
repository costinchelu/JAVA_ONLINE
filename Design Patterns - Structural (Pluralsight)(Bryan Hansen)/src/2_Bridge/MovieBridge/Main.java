package MovieBridge;

import MovieBridge.Abstraction.Printer;
import MovieBridge.ConcreteImplementation.HtmlFormatter;
import MovieBridge.ConcreteImplementation.PrintFormatter;
import MovieBridge.ImplementationBase.Formatter;
import MovieBridge.Model.Movie;
import MovieBridge.RefinedAbstraction.MoviePrinter;

public class Main {

    public static void main(String[] args) {

        // creating the model(data)
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        // refined abstraction
        Printer moviePrinter = new MoviePrinter(movie);

        // concrete implementation
        Formatter printFormatter = new PrintFormatter();
        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);
    }
}
/*
Designed for uncertainty
Complex but provides flexibility

 */