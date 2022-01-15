package MostenireIncapsulare;

import java.util.List;

public class Toyota extends Masina{

    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;
    private String motorizare;



    public Toyota(String caroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari, Integer pret, String model, String motorizare) {
        super(caroserie, transmisie, tractiune, usi, locuri);
        this.culoare = culoare;
        this.dotari = dotari;
        this.pret = pret;
        this.model = model;
        this.motorizare = motorizare;

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

    public String getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(String motorizare) {
        this.motorizare = motorizare;
    }

    public Integer getPret() {
        return pret;
    }

    public void pretFinal(){

        Integer pretFinal = pret;

        Integer index = 0;
        while (index <dotari.size()){

            if (dotari.get(index).equals("Trapa")){
                pretFinal = pretFinal + 2345;
            }

            if (dotari.get(index).equals("Incalzire oglinzi")){
                pretFinal = pretFinal + 567;
            }

            if (dotari.get(index).equals("Clima")){
                pretFinal = pretFinal + 5023;
            }

            index++;

        }
        System.out.println("Pretul final al Masinii Toyota model " + model + " este " + pretFinal);

    }

    public void  infoMasina(){
        System.out.println("Detaliile despre masina Toyota model " + model + " sunt urmatoarele: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "culoare='" + culoare + '\'' +
                ", dotari=" + dotari +
                ", pret=" + pret +
                ", model='" + model + '\'' +
                ", motorizare='" + motorizare + '\'' +
                ", caroserie='" + getCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                '}';
    }
}
