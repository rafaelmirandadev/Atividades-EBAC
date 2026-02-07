package AtividadesModulo10;
import java.util.Scanner;

public class AtividadeModulo10_1 {

    public static void main(String[] args){

        //Preencha um vetor de n números com valores aleatórios advindos do console
        int[] vetor = new int[]{34,12,59,430,69,125,23};

        //Ordene este vetor
        ordenarVetor(vetor);

        //Exibir vetor ordenado
        exibirVetor(vetor);

        //Receba um nome e exiba na tela a quantidade de vogais que esse nome possui
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite um nome: ");
        String nome = sc.nextLine();

        //Contar vogais da String digitada
        contarVogais(nome);

    }

    private static void ordenarVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            for (int j = i; j < vetor.length; j++){
                if (vetor[i] > vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    private static void exibirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + " ");
        }
    }

    private static void contarVogais(String nome){
        int count = 0;
        for (char c : nome.toLowerCase().toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        System.out.println("O número de vogais presentes nesta palavra é " + count);
    }
}
