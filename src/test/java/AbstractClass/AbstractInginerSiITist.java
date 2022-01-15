package AbstractClass;

public class AbstractInginerSiITist extends AbstractPerson {

    public String nume;
    public String prenume;

    public AbstractInginerSiITist(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void proiecteaza() {
        System.out.println("Inginer It-istul proiecteaza");

    }

    public void executa() {
        System.out.println("Inginer It-istul executa");

    }

    public void scrieCod() {
        System.out.println("Inginer It-istul scrie cod");

    }

    public void ruleazaTeste() {
        System.out.println("Inginer It-istul ruleaza teste");

    }
}
