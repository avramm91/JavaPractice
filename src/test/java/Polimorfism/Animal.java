package Polimorfism;

//Conceptul prin care o metoda poate avea implementari diferite

public class Animal {

    public String rasa;
    public String talie;
    public Integer culoareBlana;

    public Animal(String rasa, String talie, Integer culoareBlana) {
        this.rasa = rasa;
        this.talie = talie;
        this.culoareBlana = culoareBlana;
    }

    public void scoateSunet(){
        System.out.println("Animalu scoate sunet");
    }

    public Integer getPret(){
        return 5;
    }
}
