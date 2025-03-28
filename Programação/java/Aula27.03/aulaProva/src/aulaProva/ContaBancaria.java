package aulaProva;

public class ContaBancaria {
    private String titular;
    private double saldo;
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public String depositar(int qtd){
        if(qtd<=0){
            return("Valor inválido para depósito.");
        } else {
            this.saldo += qtd;
            return("Depósito realizado com sucesso!");
        }
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
