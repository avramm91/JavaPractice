package VariabilaMetoda;

import org.junit.Test;

public class Cursant {

    //this is a comment
    //Clasa = un sablon de variabile si metode. O clasa defineste un comportament. O clasa are mai multe variabile. Metodele sunt actiuni pe care o clasa le poate face.
    //Variabila = atributul unei clase
    //Metoda = actiunea unei clase
    //Tot timpul o clasa va avea langa nume cuvantul "class"
    //O clasa trebuie sa aiba un nume ex: "cursant"
    //O clasa trebuie sa fie publica => oricine poate sa vada clasa respectiva pt ca este publica.Mai poate fi private si protected
    //Variabila = poate fi de doua tipuri: globala sau locala
    //Variabila golbala: este vizibila peste tot in clasa noastra
    //Variabila globala STRUCTURA: public tipVariabila numeVariabila
    //Variabila locala: este vizibila doar in locul unde am scris
    //Variabila locala STRUCTURA: tipVariabila numeVariabila
    //O variabila poate sau nu sa primeasca o valoare
    //Ca sa dam o valoare unei variabile se face cu "="
    //Metode sunt de 2 tipuri: void si return
    //Metoda void STRUCTURA = public void numeMetoda(){}
    //Metoda return STRUCTURA = public tipVariabila numeMetoda(){} (sau pot adauga un get la nume)

    public String nume;
    public String prenume;
    public String adresa;
    public Integer adresaNumar;
    public Integer varsta;
    public Double kilograme;
    public Double experienta;

    @Test
    public void testAutomat(){
        inscriereCurs();
        platesteTaxa();
        calculeazaSuma();
        System.out.println(getSalar());
        System.out.println(getAdresa());
    }


    public void inscriereCurs(){
        nume="Avram";
        prenume="Madalina";
        adresa="strada Corneliu Coposu";
        adresaNumar= 1;
        varsta=30;
        kilograme=66.5;
        experienta=4.5;

        //afisam o valoare in consola
       //print = printeaza si ramane cu cursorul pe linia curenta
       //println = printeaza si dupa trece cu cursorul la linia urmatoare
        System.out.print(nume+" ");
       System.out.println(prenume);
       System.out.print(adresa+" "+adresaNumar+" ");
       System.out.println(varsta);
       System.out.println(kilograme);
       System.out.println(experienta);

    }

   public void platesteTaxa(){
       nume="Avram";
       prenume="Rares";
       //declaram si initializam o variabila locala
       float taxa=2.500f;

       System.out.printf("Cursantul cu numele: "+nume+" si prenumele: "+prenume+" a platit taxa de "+("%.3f"),taxa);

   }


    public void calculeazaSuma(){
        //declaram 3 variabile care adunate sa fie 100
        Integer val1=30;
        Integer val2=30;
        Integer val3=40;
        Integer suma=0;

        suma= val1+val2+val3;

        System.out.println("Suma celor 3 variabile este "+ suma);

    }

    public Double getSalar(){
        Double salar=1.200;
        return salar;
    }

    public String getAdresa(){
        String adresa="Corneliu Coposu nr.1";
        return adresa;
    }

}
