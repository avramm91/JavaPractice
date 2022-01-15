package MostenireIncapsulare;

import org.junit.Test;

import java.util.Arrays;

public class MostenireTest {

    @Test
    public void testAudi(){

        Audi AudiA3 = new Audi("hatchback", "automat", "4x4",5,5,"rosu", Arrays.asList("Interior piele", "Volan Incalzit","Incalzire scaune", "Plafon carbon"),
                               40000, "A3");

        AudiA3.infoMasina();
        AudiA3.setCuloare("Negru");
        AudiA3.infoMasina();


        Audi AudiQ5 = new Audi("coupe","manual","4x4",5,5,"gri",Arrays.asList("Interior textil", "Incalzire oglinzi","Trapa"), 65587,"Q5");

        AudiQ5.infoMasina();
        AudiQ5.pretFinal();

//        Toyota ToyotaT3 = new Toyota("break", "automat","4x4",5,5,"albastru",Arrays.asList("Trapa", "Incalzire oglinzi", "Clima"), 80320, "T3","Diesel");
//        ToyotaT3.infoMasina();
//        ToyotaT3.pretFinal();
    }

    @Test
    public void testToyota(){

        Toyota ToyotaT3 = new Toyota("break", "automat","4x4",5,5,"albastru",Arrays.asList("Trapa", "Incalzire oglinzi", "Clima"), 80320, "T3","Diesel");
        ToyotaT3.infoMasina();
        ToyotaT3.pretFinal();
    }
}
