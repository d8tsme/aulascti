package aulaProva;

public class Animal {
    private String raca;
    private int idade;

    public String getRaca(){
        return raca;
    }

    public void serRaca(String raca){
        this.raca = raca;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    void emitirSom(){
        System.out.println("Ai!");
    }
}
