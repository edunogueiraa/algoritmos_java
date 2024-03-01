import java.util.*;

public class Soma {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = input.nextInt();

        System.out.print("Digite outro numero: ");
        int n2 = input.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma de "+n1+" e "+n2+": "+ soma );
    }
}
