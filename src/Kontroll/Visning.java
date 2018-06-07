package Kontroll;

import java.util.Date;
import java.text.Collator;
import java.util.ArrayList;

public class Visning implements Comparable<Visning> {

    private int visningsNr;
    private Film film;
    private Kinosal kinosal;
    private Date dato;
    private double pris;

    private final static Collator kollator = Collator.getInstance();

    private ArrayList<Billett> billetter = new ArrayList<>();

    public Visning(int visningsNr) {
        this.visningsNr = visningsNr;
    }

    public Visning(int visningsNr, Film film, Kinosal kinosal, Date dato, double pris) {
        this.visningsNr = visningsNr;
        this.film = film;
        this.kinosal = kinosal;
        this.dato = dato;
        this.pris = pris;
    }

    /**
     * Legger til en Billett i Visning sin ArrayList over Billetter
     * @param billettkode
     * @param erBetalt
     */
    public void leggTilBillett(String billettkode, boolean erBetalt) {
        billetter.add(new Billett(billettkode, this, erBetalt));
    }

    public void leggTilBillett(Billett billett) {
        billetter.add(billett);
    }


    public int getVisningsNr() {
        return visningsNr;
    }

    public void setVisningsNr(int visningsNr) {
        this.visningsNr = visningsNr;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Kinosal getKinosal() {
        return kinosal;
    }

    public void setKinosal(Kinosal kinosal) {
        this.kinosal = kinosal;
    }

    public Date getDato() {
        return dato;
    }

    public void setDato(Date dato) {
        this.dato = dato;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public Date getStartTid() {
        return dato;
    }

    @Override
    public String toString() {
        return "Visning{" +
                "visningsNr=" + visningsNr +
                ", film=" + film.getFilmnavn() +
                ", kinosal=" + kinosal.getKinosalnavn() +
                ", dato=" + dato +
                ", pris=" + pris +
                '}';
    }

    @Override
    public int compareTo(Visning o) {
        switch (Kontroll.sortering) {
            case ALFABETISK:
                //Sortere alfabetisk
                return kollator.compare(this.film.getFilmnavn(), o.getFilm().getFilmnavn());
            case TID:
                //Sorter etter tid
                return this.dato.compareTo(o.getDato());
            case VERDI:
                if(this.visningsNr < o.getVisningsNr()) {
                    return -1;
                } else if(this.visningsNr > o.getVisningsNr()) {
                    return 1;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
    }
}
