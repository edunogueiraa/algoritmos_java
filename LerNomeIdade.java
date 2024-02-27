import java.util.*;

public class LerNomeIdade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Escreva sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Seu nome: "+ nome +"\nSua idade: "+ idade);
    }
}
