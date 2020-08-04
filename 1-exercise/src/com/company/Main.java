package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner keyboard = new Scanner (System.in);

        int firstNumber;
        int secondNumber;
        int mayor;

        System.out.println("Ingrese el primer numero ");
        firstNumber = keyboard.nextInt();

        System.out.println("Ingrese el segundo número");
        secondNumber = keyboard.nextInt();

        if (firstNumber>secondNumber){

            mayor = firstNumber;
            System.out.println("El número mayor es el primero, que es " +firstNumber );

        }else {

            mayor = secondNumber;
            System.out.println("El número mayor es el segundo, que es " + secondNumber);

        }


    }
}
