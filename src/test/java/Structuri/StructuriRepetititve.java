package Structuri;

import org.junit.Test;

public class StructuriRepetititve {

    //Cele mai intalnite structuri repetititve: for si while

    @Test

    public void testAutomat(){
        printamNumereFor();
        printamNumereWhile();

    }

    //Printam primele 200 de numere
    //mai jos vrem numerele de la 1 la 200. For-ul are 3 conditii: valoarea de la care pornim, valloarea la care vrem sa ajungem si apooi cu cat vrem sa mearga inainte ex: +1 sau index++
    //index+1 ne zice cu cat vrem sa continue, altfel ramane intr-o bucla infinita

    public void printamNumereFor(){

        for (Integer index = 1;index <= 200;index++){

            System.out.println(index);
        }
    }

    public void printamNumereWhile(){

        Integer index = 1;
        while (index <=200){

            System.out.println(index);
            index++;
        }
    }
}
