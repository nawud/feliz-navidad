package Arbol;

import java.util.Scanner;

public class ArbolNavidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura del árbol: ");
        int heightTree = scanner.nextInt();

        System.out.println("\n ¿Quieres añadir la estrella?(true/false)");
        boolean  starTree = scanner.nextBoolean();

        for (int rows = 0; rows <= heightTree; rows++) {

            for (int asterisk = heightTree - rows; asterisk > 0; asterisk--) {
                System.out.print(" ");
            }

            if (rows == 0 && starTree) {
                System.out.println("\u001b[33m@");
            } else {
                for (int space = 0; space <= 2 * rows - 1; space++) {
                    System.out.print("\u001b[32m*");
                }
                System.out.println();
            }
        }


        for (int rows = 1; rows <= heightTree / 3; rows++) {
            for (int space = heightTree / 2; space > 0; space--) {
                System.out.print(" ");
            }
            System.out.println("\u001b[33m|||");

        }

        scanner.close();
          }
        }