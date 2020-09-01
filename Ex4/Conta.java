package Ex4;

abstract class Conta{
    protected String numero;
    protected String titular;
    protected Double saldo;
    protected Double porcentagem;

    Conta(String numero, String titular, Double saldo, Double porcentagem){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.porcentagem = porcentagem;
    }

    Conta(){}

    Double rendimento(){
        return this.saldo * porcentagem;
    }
}
