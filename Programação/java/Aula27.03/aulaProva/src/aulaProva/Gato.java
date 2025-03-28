package aulaProva;

public class Gato extends Animal {
    private String pedigree;

    public String getPedigree(){
        return pedigree;
    }

    public void setPedigree(String pedigree){
        this.pedigree = pedigree;
    }

    void meow(){
        System.out.println("Meow!");
    }
}
