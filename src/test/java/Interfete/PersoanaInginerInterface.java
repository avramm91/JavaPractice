package Interfete;

public class PersoanaInginerInterface extends PersoanaInterface implements Inginer {

    public PersoanaInginerInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    public void proiecteaza() {
        System.out.println("Inginerul proiecteaza");

    }

    public void executa() {
        System.out.println("Inginerul executa");

    }
}
