package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {

    @Test

    public void testAutomat(){

        Caine Labrador = new Caine("Goldenretrieve", "mare",2);
                Labrador.scoateSunet();
                Labrador.apeleazaMetodaPrinte();
                Labrador.cumparaProduse();
                Labrador.cumparaProduse("lesa");
                Labrador.cumparaProduse(5);
        System.out.println(Labrador.culoareBlana);



    }
}
