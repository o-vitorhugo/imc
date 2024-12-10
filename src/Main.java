import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = 0.0, altura = 0.0, imc = 0.0;
        String resultado = " ", nome = " ";

        System.out.println("\nPrograma para calcular o IMC do paciente");
        System.out.println("---------------------------------------------");
        System.out.print("Digite o nome do paciente: ");
        nome = sc.nextLine();
        System.out.print("Digite o peso do paciente: ");
        peso = sc.nextDouble();
        System.out.print("Digite a altura do paciente: ");
        altura = sc.nextDouble();

        imc = Imc.calcularImc(peso, altura);
        resultado = Imc.classificarImc(imc);

        System.out.println("---------------------------------------------");
        System.out.printf("O paciente %s tem um IMC = %.2f\n", nome, imc);
        System.out.printf("A classificação do IMC é: %s\n", resultado);

        sc.close();
    }
}