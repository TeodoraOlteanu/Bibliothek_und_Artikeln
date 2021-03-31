import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BibliothekRepository bibliothekRepository = new BibliothekRepository();
        BibliothekController bibliothekController = new BibliothekController();

        bibliothekController.sort();
        bibliothekController.filtrareAutor();
        bibliothekController.filtrareExemplare();
        System.out.println(bibliothekController.gesamtAnzahl());


    }
}
