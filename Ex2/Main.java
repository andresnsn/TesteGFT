package Ex2;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite um nome para a pessoa: ");
        pessoa.setNome(input.nextLine());
        System.out.println("Digite um endereço: ");
        pessoa.setEndereco(input.nextLine());
        System.out.println("Digite um telefone: ");
        pessoa.setTelefone(input.nextLine());

        System.out.println("Os dados cadastrados foram:\n");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getEndereco());
        System.out.println(pessoa.getTelefone());
    }
}
