package AtividadesModulo10;
import java.util.Scanner;

public class AtividadeModulo10_2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de elementos: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento da posição " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        sc.close();

        exibirVetor(vetor);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                vetor[i] = vetor[i] * 2;
                System.out.println("Esse elemento é par. Seu valor multiplicado por 2 é " + vetor[i]);
            } else {
                vetor[i] = vetor[i] * vetor[i];
                System.out.println("Esse elemento é ímpar. Seu valor elevado a 2 é " + vetor[i]);
            }
        }

        exibirVetor(vetor);
    }

    private static void exibirVetor(int[] vetor){
        System.out.println("\nO vetor possui os seguintes valores: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
    }

}
