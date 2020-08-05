package com.company;
////18. Realice un algoritmo y represéntelo mediante el diagrama de flujo, el pseudocódigo y el
//        diagrama N/S que permitan determinar la cantidad del bono navideño que recibirá un
//        empleado de una tienda, considerando que si su antigüedad es mayor a cuatro años o
//        su sueldo es menor de dos mil pesos, le corresponderá 25 % de su sueldo, y en caso
//        contrario sólo le corresponderá 20 % de éste.

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);

        double salary;
        int antiquityYears;
        double  bono;

        System.out.println("Ingrese el salario del empleado");
        salary = keyboard.nextDouble();

        System.out.println("Ingrese sus años laborados en la compañia");
        antiquityYears= keyboard.nextInt();

        //calculo del bono

        if (antiquityYears>4 || salary<2000){

            bono = salary*0.25;
        }else{

            bono = salary*0.2;
        }

        System.out.println("El bono de fin de año que le corresponde es de $" + bono);
    }
}