package Ex3;

public class ContaPoupanca extends Conta{



    protected ContaPoupanca (String numero, String titular, Double saldo, Double porcentagem){
        super(numero, titular, saldo, porcentagem);
    }
    @Override
    Double rendimento(){
        return saldo * porcentagem;
    }
}
