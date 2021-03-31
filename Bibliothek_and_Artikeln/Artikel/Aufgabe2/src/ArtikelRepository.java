import java.util.ArrayList;
import java.util.List;

public class ArtikelRepository {

    public static List<Artikel> artikelRepository;

    public ArtikelRepository() {
        artikelRepository = new ArrayList<>();
    }

    public static List<Artikel> getArtikelRepository() {
        return artikelRepository;
    }

    public static void setArtikelRepository(List<Artikel> artikelRepository) {
        ArtikelRepository.artikelRepository = artikelRepository;
    }

     /**
     * add neues Artikel
     * @param artikel
     */
    public void addArtikel(Artikel artikel)
    {
        artikelRepository.add(artikel);
    }

    /**
     * such nach den Artikel gegeben als Parameter und loscht es
     * @param artikel
     */
    public void delete_artikel(Artikel artikel)
    {
        for(int i = 0; i<artikelRepository.size(); i++)
            if(artikel.getId() == artikelRepository.get(i).getId())
            {
                artikelRepository.remove(i);
                break;
            }

    }

    /**
     * Veranderung der Daten von Artikel gegeben als Parameter
     * @param artikel
     */
    public void update_artikel(Artikel artikel)
    {
        for(Artikel a : artikelRepository)
        {
            if(a.getId() == artikel.getId())
            {
                a.setName(artikel.name);
                a.setKategorie(artikel.kategorie);
                a.setMenge(artikel.menge);
                a.setPreis(artikel.preis);
                a.setStatus(artikel.status);
            }
        }
    }
}
