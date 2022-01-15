package MostenireIncapsulare;

public class Masina {

    // Mostenire = conceptul  prin care o clasa mostenesta alta clasa

    // Clasa care mosteneste = clasa copil

    // Clasa care este mostenite = clasa parinte

    //In momentul o clsa mosteneste alta clasa => are acces la toate variabilele/metodele daca acestea sunt publice. Se foloseste cuvantul cheie "extends", in Java putem mosteni o singura clasa

    // Pt a INCAPSULA, punem private la tot ce e ste public

    //private= acces control. Atunci cand avem private, variabila e accesibila doar in clasa Masina, nu mai poate fi vizibila in alte clasa.
    //get-ul scoate, set-ul modifica

    private String caroserie;
    private String transmisie;
    private String tractiune;
    private Integer usi;
    private Integer locuri;

    public Masina(String caroserie, String transmisie, String tractiune, Integer usi, Integer locuri) {
        this.caroserie = caroserie;
        this.transmisie = transmisie;
        this.tractiune = tractiune;
        this.usi = usi;
        this.locuri = locuri;
    }

    public String getCaroserie() {
        return caroserie;
    }

    public void setCaroserie(String caroserie) {
        this.caroserie = caroserie;
    }

    public String getTransmisie() {
        return transmisie;
    }

    public void setTransmisie(String transmisie) {
        this.transmisie = transmisie;
    }

    public String getTractiune() {
        return tractiune;
    }

    public void setTractiune(String tractiune) {
        this.tractiune = tractiune;
    }

    public Integer getUsi() {
        return usi;
    }

    public void setUsi(Integer usi) {
        this.usi = usi;
    }

    public Integer getLocuri() {
        return locuri;
    }

    public void setLocuri(Integer locuri) {
        this.locuri = locuri;
    }
}
