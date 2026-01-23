import java.util.Scanner;

public class AtividadeModulo7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();

        sc.close();

        if (n1 > n2) {
            System.out.println("O maior número é " + n1);
        } else if (n1 < n2) {
            System.out.println("O maior número é " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}