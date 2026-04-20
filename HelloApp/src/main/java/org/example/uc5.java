package org.example;
import java.util.Scanner;
public class uc5 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter names: ");
            String input = sc.nextLine();

            // If no input
            if (input.isEmpty()) {
                System.out.println("Hello, World!");
            } else {
                String[] names = input.split(" ");

                System.out.print("Hello, ");

                // Enhanced for loop
                for (String name : names) {
                    System.out.print(name + " ");
                }

                System.out.println("!");
            }

            sc.close();
        }
    }
