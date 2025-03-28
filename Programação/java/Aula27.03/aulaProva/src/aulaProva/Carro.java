package aulaProva;

public class Carro extends Veiculo {
    private int kilometragem;
    private String tracao;

    public int getKilometragem(){
        return kilometragem;
    }

    public void setKilometragem(int kilometragem){
        this.kilometragem = kilometragem;
    }

    public String getTracao(){
        return tracao;
    }

    public void setTracao(String tracao){
        this.tracao = tracao;
    }

    void buzinar(){
        System.out.println("Beep Beep!");
    }
}
