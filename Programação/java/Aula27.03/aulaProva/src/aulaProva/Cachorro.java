package aulaProva;

public class Cachorro extends Animal {
    private String pedigree;

    public String getPedigree(){
        return pedigree;
    }

    public void setPedigree(String pedigree){
        this.pedigree = pedigree;
    }

    void emitirSom(){
        System.out.println("AuAu!");
    }
}
