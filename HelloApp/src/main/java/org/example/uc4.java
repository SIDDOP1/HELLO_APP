package org.example;
import java.util.Scanner;
public class uc4 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter names: ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Hello, World!");
            } else {
                System.out.println("Hello, " + input + "!");
            }

            sc.close();
        }
    }

