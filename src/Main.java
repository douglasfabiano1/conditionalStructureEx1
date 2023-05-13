import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota do semestre: ");
        double note1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do semestre: ");
        double note2 = sc.nextDouble();
        double finalNote = (note1 + note2);

        System.out.printf("\nNOTA FINAL = %.1f%n", finalNote);

        if (finalNote < 60.00) {
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
