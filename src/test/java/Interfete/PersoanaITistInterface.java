package Interfete;

public class PersoanaITistInterface extends PersoanaInterface implements ITist{
    public PersoanaITistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    public void scrieCod() {
        System.out.println("IT-istul scrie cod");

    }

    public void ruleazaTeste() {
        System.out.println("IT-istul ruleaza teste");

    }
}
