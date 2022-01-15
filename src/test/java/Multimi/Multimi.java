package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {


    @Test
    public void testAutomat() {

        multimiNumereArray();
        multimiPrenumeArray();
        multimiPrenumeList();
        multimeValoriHashMap();
        multimiTariOrase();

    }

    //am declaram o multime si am adaugat spatiu in memorie
    public void multimiNumereArray() {

        Integer[] numere = new Integer[3];
        numere[0] = 5;
        numere[1] = 6;
        numere[2] = 7;

        for (Integer index = 0; index < numere.length; index++) {
            System.out.println(numere[index]);
        }

    }

    public void multimiPrenumeArray() {

        String[] prenume = new String[3];
        prenume[0] = "Madalina";
        prenume[1] = "Diana";
        prenume[2] = "Raluca";

        for (Integer index = 0; index < prenume.length; index++) {
            System.out.println(prenume[index]);
        }
    }

    public void multimiPrenumeList() {

        List<String> prenume = new ArrayList<String>();
        prenume.add("Madalina");
        prenume.add("Diana");
        prenume.add("Raluca");
        prenume.add("Simona");
//        prenume.add("Alex");

        for (Integer index = 0; index < prenume.size(); index++) {
            System.out.println(prenume.get(index));


        }
    }

    public void multimeValoriHashMap(){

        //HashMap functioneaza dupa logica de Key = Value
        //definim tipul  keyii si tipul valorii keyii. La noi ambele sunt stringuri
        //cheia este unica. Cheia poate contine mai multe valori.

        HashMap<String,String> obiecteDiferite = new HashMap<String, String>(); //aici am creat o structura de tip cheie =  valoare
        obiecteDiferite.put("Fruct","Mar");
        obiecteDiferite.put("Leguma","Morcov");
        obiecteDiferite.put("Haina","Bluza");

        //Pt fiecare cheie dintr-o multime
        for (String key: obiecteDiferite.keySet()){

            System.out.println("Cheia este: " + key);
            System.out.println("Valoare este: " + obiecteDiferite.get(key));
        }
        Object firstKey = obiecteDiferite.keySet().toArray()[0];
        Object valueForFirstKey = obiecteDiferite.get(firstKey);

        System.out.println("Prima cheie este: "+ firstKey.toString());
        System.out.println("Prima valoare este: "+ valueForFirstKey.toString());
    }


    //Hasmap mai complicat :)

    public void multimiTariOrase(){

        List<String> oraseRomania = new ArrayList<String>();

        oraseRomania.add("Cluj");

        oraseRomania.add("Iasi");

        oraseRomania.add("Bucuresti");

        List<String> oraseSpania = new ArrayList<String>();

        oraseSpania.add("Barcelona");

        oraseSpania.add("Madrid");

        oraseSpania.add("Casteldefells");

        oraseSpania.add("Valencia");

        HashMap<String,List<String>> tariOrase = new HashMap<String, List<String>>();

        tariOrase.put("Romania",oraseRomania );

        tariOrase.put("Spania",oraseSpania );

        for (String key: tariOrase.keySet()){

            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + tariOrase.get(key));
        }


    }
}
