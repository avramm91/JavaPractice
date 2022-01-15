package AbstractClass;

import org.junit.Test;

public class AbstractTest {

    @Test

    public void testAutomat(){

        AbstractPersoanaInginer Rares = new AbstractPersoanaInginer("Rares", "Avram");
        Rares.executa();
        Rares.proiecteaza();

        AbstractPersoanaITist Mada = new AbstractPersoanaITist("Madalina", "Avram");
        Mada.scrieCod();
        Mada.ruleazaTeste();
        Mada.afiseazaVarsta(30);

        AbstractInginerSiITist Ralu = new AbstractInginerSiITist("Raluca", "Avram");
        Ralu.executa();
        Ralu.scrieCod();
        Ralu.proiecteaza();
        Ralu.ruleazaTeste();

    }
}
