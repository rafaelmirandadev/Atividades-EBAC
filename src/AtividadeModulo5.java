import java.util.Scanner;

public class AtividadeModulo5 {

    public static void main(String[] args){

        //Chamar Scanner para entrada de dados do usuário
        Scanner input = new Scanner(System.in);

        System.out.println("Boas-vindas ao programa! Para começar, preciso de alguns dados.");

        //Receber e processar dados do usuário
        System.out.print("Por favor, digite seu nome completo: ");
        String nome = input.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite seu peso (em kg): ");
        float peso = input.nextFloat();

        System.out.print("Digite sua altura (em metros): ");
        float altura = input.nextFloat();

        input.nextLine();

        System.out.print("Qual seu estado civil?: ");
        String estadoCivil = input.nextLine();

        //(Importante) Fechar o scanner para poupar recursos do sistema
        input.close();

        //Exibir os dados para o usuário na forma de uma descrição
        System.out.println("Agora, irei montar uma breve descrição sua...");
        System.out.println("Seu nome completo é " + nome + ". Seu CPF é " + cpf + ". Você tem " + idade + " anos, " + "seu peso é " + peso + "kg, " + "você tem " + altura + "m de altura. Seu estado civíl é " + estadoCivil + ".");

    }
}