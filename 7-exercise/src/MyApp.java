import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

//7. El presidente de la república ha decidido estimular a todos los estudiantes de una
//        universidad mediante la asignación de becas mensuales, para esto se tomarán en
//        consideración los siguientes criterios:
//        Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de
//        $2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores
//        de 7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de
//        invitación incitándolos a que estudien más en el próximo ciclo escolar.
//        A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a
//        9, se les dará $3000; con promedios menores a 9 pero mayores o iguales a 8, $2000;
//        para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará
//        $100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de
//        invitación. Realice el algoritmo correspondiente y represéntelo con un diagrama de flujo

public class MyApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double  grade;
        int age;
        boolean receivesScholarship=false;
        int scholarship;

        System.out.println("Ingrese su promedio de calificaciones");
        grade = keyboard.nextDouble();

        System.out.println("Ingrese su edad");
        age = keyboard.nextInt();


        if (age >18){
            if (grade >= 9){
                receivesScholarship = true;
                scholarship = 2000;
            }else if (grade >= 7.5){
                receivesScholarship=true;
                scholarship = 1000;
            }else if (grade >=6){
                receivesScholarship=true;
                scholarship = 500;

            }else{
                receivesScholarship=false  ;
                scholarship = 0;
            }

        }else if (grade >= 9){
            receivesScholarship=true;
            scholarship = 3000;
        }else if (grade >= 8){
            receivesScholarship=true;
            scholarship = 2000;
        }else if (grade >= 6){
            receivesScholarship=true;
            scholarship = 100;

        }else{
            receivesScholarship=false;
            scholarship = 0;
        }


        if (receivesScholarship ==false){

            System.out.print("El alumno recibira una carta de invitación a mejorar ");

        }else {
            System.out.printf("El alumno recibira $%d de beca ", scholarship);

        }


    }
}
