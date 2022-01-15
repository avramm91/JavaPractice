package ObiectConstructor;

import org.junit.Test;

import java.util.List;

public class Cursant {


    //Obiect = instanta unei clase.
    //Recunoastem un obiect dupa cuvantul cheie new.
    //Putem face "n" biecte dintr-o clasa
    //Structura unui obiect:  NumeClasa NumeObiect = new NumeClasa(se va apela contructorul clasei)(dam valori pt variabile)

    //Exemplu obiect: Cursant Madalina = new Cursant()

    //Constructorul are ca rol sa initializeze variabilele unei clase
    //Intr-o clasa putem avea "n" constructori, un infinit de constructori
    //Exista 2 tipuri de constructor: cu parametrii si fara parametrii

    //Diferentierea intre constructori se face prin tipul parametrilor  sau numarul parametrilor

    //Daca nu fac eu un constructor => exista unul by default fara paramtrii

    //Structura constructor: public NumeClasa()



    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Character sex;
    public Boolean diploma;
    public List<String> cursuri;
    public String cursInteres;

//constructorul clasei Cursant
    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character sex, Boolean diploma, List<String> cursuri) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.sex = sex;
        this.diploma = diploma;
        this.cursuri = cursuri;

    }

    public Cursant(String nume, String prenume, Integer varsta, Character sex, Boolean diploma, List<String> cursuri) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.diploma = diploma;
        this.cursuri = cursuri;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character sex, Boolean diploma, String cursInteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.sex = sex;
        this.diploma = diploma;
        this.cursInteres = cursInteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character sex, Boolean diploma, String cursInteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.diploma = diploma;
        this.cursInteres = cursInteres;
    }

    //metoda din clasa Cursant
    public void dateCursant(){
        System.out.println("Datele despre cursant sunt urmatarele:" );
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(varsta);
        if (taxa != null){
            System.out.println(taxa);
        }
        System.out.println(sex);
        System.out.println(diploma);
        System.out.println("Cursurile de interes sunt urmatoarele:");
        if (cursuri != null) {

            for (Integer index = 0; index < cursuri.size(); index++) {
                System.out.println(cursuri.get(index));

            }
        }
        else {
            System.out.println(cursInteres);
        }
    }

    public void verificaDiplomaBac(){

        if (diploma){
            System.out.println("Cursantul"+ " "+ nume +" "+ prenume +" "+ "in varsta de" + " "+ varsta + " "+ "ani" + " " + "are diploma de BAC" );
        }
        else{
            System.out.println("Cursantul nu are diploma de BAC");
        }
    }



}
