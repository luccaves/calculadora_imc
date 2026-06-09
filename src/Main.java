import javax.swing.JOptionPane;
//import java.util.Scanner;
public class Main {
    // Declaracao de variaveis
    static double weight;
    static double height;

    // Declaração de objetos
    //static Scanner userinput = new Scanner(System.in);

    /// Metodos
    //Calcula o IMC
    static void calculateIMC(double weight, double height) {
        double imc = weight / Math.pow(height, 2);

        String message = String.format("Seu IMC é de %.2f: ", imc);
        if (imc < 40) {
            if (imc < 18.5) {
                JOptionPane.showMessageDialog(null, message + "Você esta abaixo do peso.");

            } else if (imc >= 18.6 && imc <= 24.9) {
                JOptionPane.showMessageDialog(null, message + "Você esta no PESO IDEAL. Parabéns!!!");

            } else if (imc >= 25 && imc <= 29.9) {
                JOptionPane.showMessageDialog(null, message + "Você esta LEVEMENTE acima do peso");
                System.out.println("Levemente acima do peso");

            } else if (imc >= 30 && imc <= 34.9) {
                JOptionPane.showMessageDialog(null, message + "Você um POUCO ACIMA do peso. Obesidade grau I");

            } else if (imc >= 35 && imc <= 39.9) {
                JOptionPane.showMessageDialog(null, message + "Você esta MUITO ACIMA do peso. Obesidade grau II (severa)");

            }
        }else {
            JOptionPane.showMessageDialog(null, message + "Você esta EXTREMAMENTE ACIMA do peso. Obesidade III (mórbida)");
        }
    }


    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("        CALCULADORA DE IMC");
        System.out.println("------------------------------------");
        weight = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        calculateIMC(weight, height);

        }
    }