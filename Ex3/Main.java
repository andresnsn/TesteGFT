package Ex3;

public class Main {
    public static void main (String[] args){

        ContaCorrente conta1 = new ContaCorrente("555555", "Andre", 1000.0, 0.03);
        ContaPoupanca conta2 = new ContaPoupanca("666666", "Andre", 1000.0, 0.05);


        System.out.println("O rendimento da Conta Corrente é: " +conta1.rendimento());
        System.out.println("O rendimento da Conta Poupança é: " +conta2.rendimento());




    }
}
