package Structuri;

import org.junit.Test;

public class StructuriAlternative {

    //Doua tipuri de structuri = structuri alternative si repetitive
    //Structura alternativa = if condition then
    //                                      else
    //Nu tot timpul e neaparat nevoie sa facem un else la if
    //Putem avea orica if-uri este nevoie

    @Test
    public void testAutomat(){
        verificaNumere();
        verificaNume("Alexandru","Gheorghe");
        verificaNume("Alexandru","Alex");
        verificaNumereComplex(10,12);
        verificaNumereComplex(2,2);
        verificaNumereComplex(2,1);

    }

    //Verificam daca nr1>3
    //Cand o conditie nu e adavarata tot timpul va merge pe else

    public void verificaNumere(){
        if (5<3){
            System.out.println("Numarul 5 este mai mare ca 3");
        }
        else{
            System.out.println("Numarul 5 nu este mai mic ca 3");
        }
    }

    //Verificam daca Alexandru contine Alex

    public void verificaNume(String nume1, String nume2){

        if(nume1.contains(nume2)){
            System.out.println("Alexandru il contine pe Alex");
        }
        else{
            System.out.println("Numele Alexandru nu contine cealalta valoare "+ nume2);
        }

    }

    //Verificam daca un numar este mai mare ca altul cu mai multe cazuri

    public void verificaNumereComplex(Integer nr1,Integer nr2){
        if(nr1>nr2){
            System.out.println(nr1+" este mai mare ca " +nr2);
        }
        if(nr1<nr2){
            System.out.println(nr1+" este mai mic ca "+nr2);
        }
        if(nr1 == nr2){
            System.out.println(nr1+" este egal cu "+nr2);
        }
        if(nr1!=nr2){
            System.out.println(nr1+" este diferit de "+nr2);
        }
    }
}
