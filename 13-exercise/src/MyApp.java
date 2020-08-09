import java.util.Scanner;

public class MyApp {

//13. Los alumnos de una escuela desean realizar un viaje de estudios, pero requieren
//    determinar cuánto les costará el pasaje, considerando que las tarifas del autobús son
//    las siguientes: si son más de 100 alumnos, el costo es de $20; si son entre 50 y 100,
//    $35; entre 20 y 49, $40, y si son menos de 20 alumnos, $70 por cada uno. Realice el
//    algoritmo para determinar el costo del pasaje de cada alumno. Represente el algoritmo
//    mediante el diagrama de flujo y el pseudocódigo


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int travelCost;
        int studentsInTheTrip;

        System.out.println("Ingresar la cantidad de alumnos que estarán en el viaje");
        studentsInTheTrip = keyboard.nextInt();

        if (studentsInTheTrip>100){
            travelCost = 20;
        }else if (studentsInTheTrip>= 50){
            travelCost = 35;
        }else if (studentsInTheTrip>19){
            travelCost= 40;
        }else {
            travelCost = 70;
        }

        System.out.println("El costo del viaje por persona es de $" + travelCost);


    }


}
