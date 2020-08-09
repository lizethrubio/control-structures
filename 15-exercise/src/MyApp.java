import java.util.Scanner;

public class MyApp {

//    15. Realice un algoritmo que, con base en un número proporcionado (1-7), indique el día de
//    la semana que le corresponde (L-D). Represente el diagrama de flujo y el pseudocódigo
//    correspondiente.

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numDay;


        System.out.println("Ingrese el dìa de la semana que desea convertir");
        numDay = keyboard.nextInt();

        switch (numDay){
            case 1:
                System.out.println("Es lunes ");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Ingrese un número valido, entre el numero 1  y 7");
        }



    }

}
