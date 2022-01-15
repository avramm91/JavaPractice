package Interfete;

public class PerosanaInginerITistInterface extends PersoanaInterface implements Inginer, ITist {
    public PerosanaInginerITistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    public void scrieCod() {
        System.out.println("Inginerul ITist scrie cod");

    }

    public void ruleazaTeste() {

        System.out.println("Inginerul ITist ruleza teste");

    }

    public void proiecteaza() {

        System.out.println("Inginerul ITist proiecteaza");
    }

    public void executa() {

        System.out.println("Inginerul ITist executa");

    }
}
