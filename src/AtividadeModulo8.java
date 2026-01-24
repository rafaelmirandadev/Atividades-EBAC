import java.util.Scanner;

public class AtividadeModulo8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Receber dados do usuário
        System.out.println("Digite seu primeiro nome: ");
        String nome = sc.nextLine();

        //Estrutura de repetição para o usuário digitar novamente o número, se ele digitou um número inválido
        while (true){
            System.out.println("Digite um número inteiro e positivo: ");
            int num = sc.nextInt();

            //Estrutura condicional para caso o usuário digite um número não aceito
            if(num>0){
                //Mostrar número de forma crescente
                System.out.println("\nNúmero de forma crescente:");
                for (int i = 0; i <= num; i++){
                    System.out.println(i);
                }
                //Mostrar número de forma decrescente
                System.out.println("\nNúmero de forma decrescente:");
                for (int i = num; i >= 0; i--){
                    System.out.println(i);
                }

                System.out.println();

                //Exibir nome digitado
                if (nome.length()>6){
                    for (int i = 0; i < num; i++){
                        System.out.println(nome);
                    }
                } else {
                    System.out.println(nome);
                }
                break;
            }
            else {
                System.out.println("Número inválido!");
            }
        }
        sc.close();
    }

}