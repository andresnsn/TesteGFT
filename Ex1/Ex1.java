import java.util.Scanner;

public class Ex1 {

   

    public static void main (String []args){

        int n1;
        int n2;
        int i;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor inicial: ");
        n1 = input.nextInt();
        System.out.println("Digite o valor final: ");
        n2 = input.nextInt();

        for(i = n1; i <= n2; i++){
            if (i % 2 != 0) {
                System.out.println(" " +i);

            }
        }


    }

    


}