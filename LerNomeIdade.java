import java.util.*;

public class LerNomeIdade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nome = input.nextLine();

        System.out.print("Escreva sua idade: ");
        int idade = input.nextInt();

        System.out.println("Seu nome: "+ nome +"\nSua idade: "+ idade);
    }
}
