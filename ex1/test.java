package ex1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice !");
        while (true) {
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();
            if (choix == 5) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.println("Entrez le premier nombre :");
            double a = scanner.nextDouble();
            System.out.println("Entrez le deuxième nombre :");
            double b = scanner.nextDouble();

            try {
                switch (choix) {
                    case 1:
                        System.out.println("Résultat : " + calculatrice.addition(a, b));
                        break;
                    case 2:
                        System.out.println("Résultat : " + calculatrice.soustraction(a, b));
                        break;
                    case 3:
                        System.out.println("Résultat : " + calculatrice.multiplication(a, b));
                        break;
                    case 4:
                        System.out.println("Résultat : " + calculatrice.division(a, b));
                        break;
                    default:
                        System.out.println("Choix invalide !");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
