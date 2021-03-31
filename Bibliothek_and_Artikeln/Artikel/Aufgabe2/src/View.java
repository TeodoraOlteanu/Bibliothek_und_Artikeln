import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {

    KundeController kundeController = new KundeController();

    /**
     * die Moglichkeiten angeschrieben
     *
     * @return
     */
    public String options() {
        return "Choose an option: \n" +
                "1. Top \n";
    }

    /**
     * Menu angeschrieben
     *
     * @throws IOException
     */
    void menu() throws IOException {
        funktionenAufrufen();
        Scanner sc = new Scanner(System.in);
        int option = -1;
        String op = options();
        while (option != 0)
        {
            System.out.println(op);
            option = sc.nextInt();
            if (option == 1) {
                kundeController.top();
            }
        }

    }
    public void funktionenAufrufen()
    {
        KundeRepository kundeRepository = new KundeRepository();
        ArtikelRepository artikelRepository = new ArtikelRepository();

        Artikel a1 = new Artikel(1,"a1","k1",1f,1,"verfugbar");
        Artikel a2 = new Artikel(2,"a2","k2",1f,1,"nicht verfugbar");

        artikelRepository.addArtikel(a1);
        artikelRepository.addArtikel(a2);

        List<Artikel> artikelList = Arrays.asList(a1,a2);

        Kunde k1 = new Kunde(1,"kunde1",artikelList);
        Kunde k2 = new Kunde(2,"kunde2",artikelList);

        kundeRepository.addKunde(k1);
        kundeRepository.addKunde(k2);

        for(Kunde kunde : KundeRepository.kundeRepository)
            System.out.println(kunde);

        for(Artikel artikel: ArtikelRepository.artikelRepository)
            System.out.println(artikel);

    }

    /**
     * Interface wird angeschaltet
     *
     * @throws IOException
     */
    public void run() throws IOException {
        menu();
    }
}
