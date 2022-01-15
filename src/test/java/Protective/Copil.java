package Protective;

public class Copil {
    //public = vizibil peste tot in proiect
    //private =  vizibil doar in clasa unde l-am declarat
    //protected = vizibil in clasa parinte + clasa copil indiferent daca se afla sau nu in acelasi pachet
    //defaoult = vizibil in clasa parinte + clasa copil cu conditia sa fie in acelasi pachet
    //Protected = Daca declaram un obiect este vizil in orice clasa din pachet
    //Default = Daca declaram un obiect este vizil in orice clasa din pachet
    public void metodaPublica(){
        System.out.println("public");
    }

    private void metodaPrivata(){
        System.out.println("private");
    }

    protected void metodaProtected(){
        System.out.println("protected");
    }
    void metodaDefault(){
        System.out.println("default");
    }
}
