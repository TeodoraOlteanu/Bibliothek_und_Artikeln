import java.time.LocalDate;

public class Bibliothek {
    public String nameBuch;
    public String autor;
    public LocalDate datum;
    public int anzahlKopien;
    public int exemplare;

    public Bibliothek() {
    }

    public String getNameBuch() {
        return nameBuch;
    }

    public void setNameBuch(String nameBuch) {
        this.nameBuch = nameBuch;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public int getAnzahlKopien() {
        return anzahlKopien;
    }

    public void setAnzahlKopien(int anzahlKopien) {
        this.anzahlKopien = anzahlKopien;
    }

    public int getExemplare() {
        return exemplare;
    }

    public void setExemplare(int exemplare) {
        this.exemplare = exemplare;
    }

    @Override
    public String toString() {
        return "Bibliothek{" +
                "nameBuch='" + nameBuch + '\'' +
                ", autor='" + autor + '\'' +
                ", datum=" + datum +
                ", anzahlKopien=" + anzahlKopien +
                ", exemplare=" + exemplare +
                '}';
    }
}
