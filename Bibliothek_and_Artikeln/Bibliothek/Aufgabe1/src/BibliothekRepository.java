import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BibliothekRepository {

    public static List<Bibliothek> bibliothekRepository;

    public BibliothekRepository() {
        citire();
    }

    public List<Bibliothek> getBibliothekRepository() {
        return bibliothekRepository;
    }

    public void setBibliothekRepository(List<Bibliothek> bibliothekRepository) {
        this.bibliothekRepository = bibliothekRepository;
    }

    /**
     * read from bibliothek.txt
     * @throws IOException
     */
    public void citire()
    {
        try{
            BufferedReader in = new BufferedReader(new FileReader("Bibliothek\\Aufgabe1\\src\\bibliothek.txt"));
            String s;

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.uuuu");
            bibliothekRepository = new ArrayList<Bibliothek>(){};

            while((s = in.readLine()) != null){

                String[] var = s.split("&");

                Bibliothek bibliothek = new Bibliothek();
                bibliothek.setNameBuch(var[0]);
                bibliothek.setAutor(var[1]);
                bibliothek.setDatum(LocalDate.parse(var[2], formatter));
                bibliothek.setAnzahlKopien(Integer.parseInt(var[3]));
                bibliothek.setExemplare(Integer.parseInt(var[4]));

                bibliothekRepository.add(bibliothek);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    /**
     *  write Repo zu einem file gegeben als Parameter
     * @param file
     * @throws IOException
     */
    public static void scriere(File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for(Bibliothek b: bibliothekRepository)
            writer.write(b.getNameBuch() + "#" + b.getAutor() + "#" +
                    b.getDatum() + "#" + b.getAnzahlKopien() + "#" + b.getExemplare() + "\n");

        writer.close();
    }

    /**
     * write die gegebene Liste als Parameter in file gegeben als Parameter
     * @param file
     * @param bibliothekList
     * @throws IOException
     */
    public static void scriereLista(File file, List<Bibliothek> bibliothekList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for(Bibliothek b: bibliothekList)
            writer.write(b.getNameBuch() + "#" + b.getAutor() + "#" +
                    b.getDatum() + "#" + b.getAnzahlKopien() + "#" + b.getExemplare() + "\n");

        writer.close();
    }
}
