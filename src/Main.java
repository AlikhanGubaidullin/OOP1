import Classes.movie;
import Classes.viewer;
import Classes.cinema;


public class Main {

    public static void main(String[] args) {
        movie titleObj = new movie();
        titleObj.setMovieTitle("Interstellar");

        movie yearObj = new movie();
        yearObj.setMovieYear(2014);

        movie genreObj = new movie();
        genreObj.setMovieGenre("ScientificFantasy");

        viewer nameObj = new viewer();
        nameObj.setviewerName("Cristiano");

        viewer IDObj = new viewer();
        IDObj.setviewerID(123);

        cinema sizeObj = new cinema();
        sizeObj.setCinemaSize("Big");

        cinema priceObj = new cinema();
        priceObj.setCinemaPrice(2500);

        cinema typeObj = new cinema();
        typeObj.setCinemaType("IMAX");

        System.out.println("Movie Title: "+titleObj.getMovieTitle() + "/ Movie Year: "+yearObj.getMovieYear() + "Movie Genre: "+genreObj.getMovieGenre());
        System.out.println("Viewer Name: "+nameObj.getViewerName() + "/ Viewer ID: " + IDObj.getviewerID() + "/ Viewer Place: " + priceObj.getCinemaPrice());
        System.out.println("Cinema Size: "+sizeObj.getCinemaSize()+ "/ Cinema price: "+priceObj.getCinemaPrice()+ "/ Cinema Type: "+typeObj.getCinemaType());
    }

}