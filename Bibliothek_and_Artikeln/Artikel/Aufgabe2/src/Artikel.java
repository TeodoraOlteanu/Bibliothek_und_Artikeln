public class Artikel {
    public int id;
    public String name;
    public String kategorie;
    public float preis;
    public int menge;
    public String status;

    public Artikel(int id, String name, String kategorie, float preis, int menge, String status) {
        this.id = id;
        this.name = name;
        this.kategorie = kategorie;
        this.preis = preis;
        this.menge = menge;
        this.status = status;
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

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kategorie='" + kategorie + '\'' +
                ", preis=" + preis +
                ", menge=" + menge +
                ", status='" + status + '\'' +
                '}';
    }
}
