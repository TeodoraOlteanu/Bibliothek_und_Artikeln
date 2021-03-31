import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BibliothekController {

    BibliothekRepository bibliothekRepository = new BibliothekRepository();

    public BibliothekRepository getBibliothekRepository() {
        return bibliothekRepository;
    }

    public void setBibliothekRepository(BibliothekRepository bibliothekRepository) {
        this.bibliothekRepository = bibliothekRepository;
    }
/**
 * sortiert Name Bucher absteigend
 *
 * @throws IOException
 **/

    public void sort() throws IOException {  // AICI DESCRESCATOR
        BibliothekRepository.bibliothekRepository.sort(Comparator.comparing(Bibliothek::getNameBuch).reversed());
        BibliothekRepository.scriere(new File("Bibliothek\\Aufgabe1\\src\\name.txt"));
    }

    /**
     * sortiert Bibliothek aufsteigend wo Name Autor mit S beginnt
     * @throws IOException
     */
    public void filtrareAutor() throws IOException {

        List<Bibliothek> filtered = new ArrayList<>();
        filtered = BibliothekRepository.bibliothekRepository.stream()
                .filter(b->b.getAutor().startsWith("S"))
                .collect(Collectors.toList());

        filtered.sort(Comparator.comparing(Bibliothek::getNameBuch));
        BibliothekRepository.scriereLista(new File("Bibliothek\\Aufgabe1\\src\\autor.txt"), filtered);


    }

    /**
     * sortiert Bibliothek absteigend nach Datum wo Name wenigtens 3 Exemplare sind
     * @throws IOException
     */
    public void filtrareExemplare() throws IOException {

        List<Bibliothek> filtered = new ArrayList<>();
        filtered = BibliothekRepository.bibliothekRepository.stream()
                .filter(b->b.getExemplare()>3)
                .collect(Collectors.toList());
        filtered.sort(Comparator.comparing(Bibliothek::getDatum).reversed());

        BibliothekRepository.scriereLista(new File("Bibliothek\\Aufgabe1\\src\\exemplare.txt"), filtered);

    }

    public int gesamtAnzahl()
    {
        int ct =0;
        for(Bibliothek b: BibliothekRepository.bibliothekRepository)
            ct++;

        return ct;
    }
}
