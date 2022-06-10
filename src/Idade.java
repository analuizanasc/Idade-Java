import java.util.Calendar;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Você nasceu em que ano?");
        int nascimento = entrada.nextInt();

        int ano = calendario.get(Calendar.YEAR);
        int idade = ano - nascimento;
        System.out.println(nome +"," + " você tem " + idade + " anos!");

    }
}
