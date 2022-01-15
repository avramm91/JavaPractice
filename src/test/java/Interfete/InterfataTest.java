package Interfete;

import org.junit.Test;

public class InterfataTest {

    @Test

    public void testAutomat(){

        PersoanaInginerInterface Florin = new PersoanaInginerInterface("Florin","Pop");
        Florin.executa();
        Florin.proiecteaza();

        PerosanaInginerITistInterface Madalina = new PerosanaInginerITistInterface("Madalina", "Avram");
        Madalina.scrieCod();
        Madalina.ruleazaTeste();

        PerosanaInginerITistInterface Raluca = new PerosanaInginerITistInterface("Raluca", "Avram");
        Raluca.ruleazaTeste();
        Raluca.scrieCod();
        Raluca.executa();
        Raluca.proiecteaza();

    }
}
