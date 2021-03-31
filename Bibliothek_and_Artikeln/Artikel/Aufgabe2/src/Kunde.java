import java.util.List;

public class Kunde {

    public int id;
    public String name;
    public List<Artikel> gekauftenArtikel;


    public Kunde(int id, String name, List<Artikel> gekauftenArtikel) {
        this.id = id;
        this.name = name;
        this.gekauftenArtikel = gekauftenArtikel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artikel> getGekauftenArtikel() {
        return gekauftenArtikel;
    }

    public void setGekauftenArtikel(List<Artikel> gekauftenArtikel) {
        this.gekauftenArtikel = gekauftenArtikel;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gekauftenArtikel=" + gekauftenArtikel +
                '}';
    }
}
