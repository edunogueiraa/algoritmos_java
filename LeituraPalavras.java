import java.util.Scanner;

public class LeituraPalavras {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite duas palavras para serem concatenadas");

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = input.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = input.nextLine();

        System.out.print(palavra1 + palavra2);
    }
}
