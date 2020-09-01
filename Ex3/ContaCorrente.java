package Ex3;

public class ContaCorrente extends Conta{

    
    protected ContaCorrente(String numero, String titular, Double saldo, Double porcentagem){
        super(numero, titular, saldo, porcentagem);
    }
    @Override
    Double rendimento(){
        return saldo * porcentagem;
    }
}
