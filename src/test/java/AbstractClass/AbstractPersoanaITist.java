package AbstractClass;

public class AbstractPersoanaITist extends AbstractPerson {
    public AbstractPersoanaITist(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public String nume;
    public String prenume;

    public void proiecteaza() {

    }

    public void executa() {

    }

    public void scrieCod() {
        System.out.println("ITistul scrie cod");

    }

    public void ruleazaTeste() {
        System.out.println("ITistul ruleaza teste");

    }
}
