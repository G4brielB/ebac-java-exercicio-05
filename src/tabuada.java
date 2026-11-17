import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero e veja a tabuada dele: ");
        int numero = sc.nextInt();
        int multiplicadores = 1;

        while (multiplicadores <= 10) {
            int mult = numero * multiplicadores;
            System.out.println(numero + "x" + multiplicadores + "=" + mult);
            multiplicadores++;
        }

        int decisao;
        do {
            System.out.println("digite: 1 - Continuar ou 2 - Sair");
            decisao = sc.nextInt();
            sc.nextLine();

            if(decisao == 2) {
                break;
            }

            System.out.println("Digite uma palavra ou frase: ");
            String frase = sc.nextLine();

            System.out.println(frase);
        } while (decisao == 1);

        System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado." );
        sc.close();

    }
}
