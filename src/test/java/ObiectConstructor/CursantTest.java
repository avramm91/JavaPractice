package ObiectConstructor;

import org.junit.Test;

import java.util.Arrays;

public class CursantTest {

    @Test

    public void testAutomat(){

        //primul Cursant este clasa si al doilea, cel de langa new e Constructorul
        System.out.println("---obiectul 1---");
        Cursant Madalina = new Cursant("Madalina", "Avram", 30, 2.550,'F',true, Arrays.asList("Automation", "Baze de date", "Manual"));
        Madalina.dateCursant();
        Madalina.verificaDiplomaBac();

        System.out.println("---obiectul 1 modificat nume---");
        Madalina.prenume = "Raluca";
        Madalina.dateCursant();
        Madalina.verificaDiplomaBac();

        System.out.println("---obiectul 2---");
        Cursant MariCarmen = new Cursant("MariCarmen", "Manolache", 31, 2.550, 'F',false, Arrays.asList("Manual"));
        MariCarmen.dateCursant();
        MariCarmen.verificaDiplomaBac();

        System.out.println("---obiectul 3---");
        Cursant AlexDorha = new Cursant("Dorha", "Alex", 30, 'M',true,Arrays.asList("Automation"));
        AlexDorha.dateCursant();
        AlexDorha.verificaDiplomaBac();


        System.out.println("---obiectul 4---");
        Cursant RalucaMAria = new Cursant("Avram", "Raluca", 3,'F',false,"Java Course");
        RalucaMAria.dateCursant();
        RalucaMAria.verificaDiplomaBac();

    }
}
