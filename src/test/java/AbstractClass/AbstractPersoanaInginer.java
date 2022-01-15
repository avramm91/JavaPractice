package AbstractClass;

public class AbstractPersoanaInginer extends AbstractPerson {

    public String nume;
    public  String prenume;

    public AbstractPersoanaInginer(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }


    public void proiecteaza() {
        System.out.println("Inginerul proiecteaza");

    }

    public void executa() {
        System.out.println("Inginerul executa");

    }

    public void scrieCod() {

    }

    public void ruleazaTeste() {

    }
}
