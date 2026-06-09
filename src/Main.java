import java.util.Locale;
import java.util.Scanner;
public class Main {
    // Declaracao de variaveis
    static double weight;
    static double height;

    // Declaração de objetos
    static Scanner userinput = new Scanner(System.in);

    /// Metodos
    //Calcula o IMC
    static void calculateIMC(double weight, double height) {
        double imc = weight / Math.pow(height, 2);

        System.out.println("Seu IMC é de: " + imc);
        if (imc < 40) {
            if (imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 18.6 && imc <= 24.9) {
                System.out.println("Peso ideal (parabéns)");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Levemente acima do peso");
            } else if (imc >= 30 && imc <= 34.9) {
                System.out.println("Obesidade grau I");
            } else if (imc >= 35 && imc <= 39.9) {
                System.out.println("Obesidade grau II (severa)");
            }
        }else {
            System.out.println("Obesidade III (mórbida)");
        }
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("------------------------------------");
        System.out.println("        CALCULADORA DE IMC");
        System.out.println("------------------------------------");
        System.out.println("Digite o seu peso:");
        weight = userinput.nextDouble();
        System.out.println("Digite sua altura:");
        height = userinput.nextDouble();
        calculateIMC(weight, height);
        }
    }