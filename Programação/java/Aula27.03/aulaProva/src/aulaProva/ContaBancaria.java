package aulaProva;

public class ContaBancaria {
    private int saldo;

    public int getSaldo(){
        return saldo;
    }

    public String depositar(int qtd){
        this.saldo += qtd;
        return("Depósito realizado com sucesso!");
    }

    public String sacar(int qtd){
        if(qtd>this.saldo){
            return("Você não tem essa quantia.");
        } else if (qtd<= this.saldo){
            this.saldo -= qtd;
            return("Saque realizado com sucesso!");
        }
        return("Insira a quantidade a sacar desejada.");
    }
}
