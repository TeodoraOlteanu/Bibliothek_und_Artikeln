import java.util.ArrayList;
import java.util.List;

public class KundeRepository {

    public static List<Kunde> kundeRepository;

    public KundeRepository() {
        kundeRepository = new ArrayList<>();
    }

    public static List<Kunde> getKundeRepository() {
        return kundeRepository;
    }

    public static void setKundeRepository(List<Kunde> kundeRepository) {
        KundeRepository.kundeRepository = kundeRepository;
    }

    /**
     * add neues Kunde
     * @param kunde
     */
    public void addKunde(Kunde kunde)
    {
        kundeRepository.add(kunde);
    }

    /**
     * such nach den Kunden gegebes als Parameter und loscht es
     * @param kunde
     */
    public void delete_kunde(Kunde kunde)
    {
        for(int i = 0; i<kundeRepository.size(); i++)
            if(kunde.getId() == kundeRepository.get(i).getId())
            {
                kundeRepository.remove(i);
                break;
            }

    }

    /**
     * veranderung der daten von Kunde gegeben als Parameter
     * @param kunde
     */
    public void update_kunde(Kunde kunde)
    {
        for(Kunde k : kundeRepository)
        {
            if(k.getId() == kunde.getId())
            {
                k.setName(kunde.name);
                k.setGekauftenArtikel(kunde.gekauftenArtikel);
            }
        }
    }

}
