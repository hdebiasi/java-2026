package basico;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        // Comentário de teste
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a nota entre 0 e 10: ");
        int nota = entrada.nextInt();

        if (nota >= 7) {
            System.out.println("Passou direto!");
        } else if (nota >= 4 && nota < 7) {
            System.out.println("Pegou exame!");
        } else {
            System.out.println("Reprovou!");
        }
    }
}
