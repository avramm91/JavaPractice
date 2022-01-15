package Polimorfism;

public class Caine extends Animal {

    public Caine(String rasa, String talie, Integer culoareBlana){
        super(rasa, talie, culoareBlana);
    }

    //Polimorfism dinamic
    @Override
    public void scoateSunet(){
        System.out.println("Cainele latra");
    }

    //cu super apelam metoda parinte, deci va printa "Animalul scoate sunet"//
    public void apeleazaMetodaPrinte(){
        super.scoateSunet();
    }

    //Polimorfismul static

    public  void cumparaProduse(){
        System.out.println("nu am cumparat nici un produs ");
    }

    public  void cumparaProduse(String produs1){
        System.out.println("Am cumparat un Produs " + produs1);
    }

    public  void cumparaProduse(Integer produs1){
        System.out.println("Am cumparat un Produs " + produs1);
    }
//Polimorfismul nu se aplica la metodele cu return, decta daca punem parametrii diferiti

    public Integer getCaine(){
        return 1;
    }

    public String getCaine(String unu){
        return "1";
    }

    //Moteoda return = ptem aplica polimorfism dinamic
    // Metoda return =  putem aplica polimorfismul static doar la nivel d e numar de parametrii
    @Override
    public Integer getPret(){
        return 10;

    }

}
