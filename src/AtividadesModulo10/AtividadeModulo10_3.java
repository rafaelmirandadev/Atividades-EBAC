package AtividadesModulo10;

import java.util.Scanner;

public class AtividadeModulo10_3 {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        char[] letras = nome.toCharArray();

        inverterString(letras);
    }

    private static void inverterString(char[] letras){
        System.out.println("Nome ao contrário: ");
        for(int i = letras.length - 1; i >= 0; i--){
            System.out.print(letras[i]);
        }
    }

}
