import java.util.Scanner;

public class ConversorMedidas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Converter metros para centimetros: \n");

        System.out.print("Digite em metros: ");
        float metros = input.nextFloat();

        float centimetros = metros * 100;

        System.out.printf("%.1f cm", centimetros);
    }
}
