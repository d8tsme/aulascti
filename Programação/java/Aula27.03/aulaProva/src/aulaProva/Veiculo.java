package aulaProva;

public class Veiculo {
    private String modelo;
    private String cor;
    private String placa;

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    void buzinar(){
        System.out.println("Saí da frente maluco!");
    }
}
