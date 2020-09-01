package Ex4;

public class ContaCorrente extends Conta implements Imposto{

    
    protected ContaCorrente(String numero, String titular, Double saldo, Double porcentagem){
        super(numero, titular, saldo, porcentagem);
    }
    @Override
    Double rendimento(){
        return saldo * porcentagem;
    }

    @Override
    public Double calcularImposto() {
        return saldo * 0.25;
    }
}
