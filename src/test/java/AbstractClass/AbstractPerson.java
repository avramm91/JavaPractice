package AbstractClass;

//se pune cuvantul abstarct in fata la class

//Clasa abstracta = poate sau nu sa contine metode abstracte
//Clasa care extinde o clasa abstracta = extinde toate metodele abstracte
//clas aabstracta poate contine un constructor dar to tnu putem face un obiect. Nici din clasa clasa abstarcta nici din Interfata. Nu putem face obiect din ceva abstract.
//Metodele abstracte folosesc cuvantul abstract
//o clasa abstracta poate implementa o interfata
// o interfata nu poate extinde o clasa abstracta
//metodele sunt publice

public abstract class AbstractPerson {

    public abstract void proiecteaza();
    public abstract void executa();
    public abstract void scrieCod();
    public abstract void ruleazaTeste();
    public void afiseazaVarsta(Integer varsta){
        System.out.println("Are varsta de " + varsta);
    };


}
