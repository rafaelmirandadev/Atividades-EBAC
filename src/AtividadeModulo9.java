import java.util.Scanner;

public class AtividadeModulo9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        System.out.println("Bem-vindo ao programa!");

        do {
            System.out.print("Digite um número para criar sua tabuada: ");
            int num = sc.nextInt();
            System.out.print("Digite o número máximo de multiplicações que você deseja visualizar: ");
            int tabuadaFinal = sc.nextInt();

            int tabuada = 1;

            while(tabuada <= tabuadaFinal){
                System.out.println(num + " x " + tabuada + " = " + num*tabuada);
                tabuada++;
            }
            tabuada = 1;

            System.out.println("\nDeseja continuar? Digite\n1 para sim\n2 para não");
            escolha = sc.nextInt();

            if (escolha == 1){
                System.out.println("\nDigite uma palavra ou frase: ");
                String frase = sc.next();
                System.out.println(frase);
            } else {
                break;
            }

            System.out.println("\nDeseja executar novamente? Digite\n1 para sim\n2 para não");
            escolha = sc.nextInt();

        } while (escolha == 1);

        sc.close();

        if (escolha == 2){
            System.out.println("\nObrigado por utilizar o nosso sistema, espero que tenha gostado.");
        }

    }

}
