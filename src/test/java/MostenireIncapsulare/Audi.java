package MostenireIncapsulare;

import java.util.List;

public class Audi extends Masina {

    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;

    public Audi(String caroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari, Integer pret, String model) {
        super(caroserie, transmisie, tractiune, usi, locuri);
        this.culoare = culoare;
        this.dotari = dotari;
        this.pret = pret;
        this.model = model;

        //super trimite la constructorul parinte



    }

    public void  infoMasina(){
        System.out.println("Detaliile despre masina Audi model " + model + " sunt urmatoarele: ");
        System.out.println(toString());
    }

    public void pretFinal(){

        Integer pretFinal = pret;

        Integer index = 0;
        while (index <dotari.size()){

            if (dotari.get(index).equals("Interior piele")){
                pretFinal = pretFinal + 1234;
            }

            if (dotari.get(index).equals("Volan Incalzit")){
                pretFinal = pretFinal + 523;
            }

            if (dotari.get(index).equals("Incalzire scaune")){
                pretFinal = pretFinal + 3254;
            }

            if (dotari.get(index).equals("Plafon carbon")){
                pretFinal = pretFinal + 2324;
            }
            index++;

        }
        System.out.println("Pretul final al Masinii Audi model " + model + " este " + pretFinal);

    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "culoare='" + getCuloare() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", model='" + getPret() + '\'' +
                ", caroserie='" + getCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                '}';
    }
}
