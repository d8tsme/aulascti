package aulaProva;

import java.util.ArrayList;

public class encapsulamento{
    public static void main(String[] args){
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("Joca", 1200.00));
        contas.add(new ContaBancaria("Jeca", 1000.00));
        contas.add(new ContaBancaria("Jica", 1100.00));

        for(ContaBancaria conta : contas){
            System.out.println("Titular: " + conta.getTitular() + "\n Saldo: " + conta.getSaldo());
        }
    }
}