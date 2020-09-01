package Ex4;

public class ContaPoupanca extends Conta implements Imposto{


    protected ContaPoupanca (String numero, String titular, Double saldo, Double porcentagem){
        super(numero, titular, saldo, porcentagem);
    }
    @Override
    Double rendimento(){
        return saldo * porcentagem;
    }

    @Override
    public Double calcularImposto() {
        return saldo * 0.10;
    }
}
