import java.util.Scanner;

public class MyApp {

//    11. Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se
//    les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que
//    tengan más de 5, el bono será de $1000. Realice un algoritmo y represéntelo mediante el
//    diagrama de flujo y el pseudocódigo que permita determinar el bono que recibirá un
//    trabajador.


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int years;
        int bono;

        System.out.println("¿Cuantos años lleva trabajando en la compañia?");
        years = keyboard.nextInt();


        switch (years){
            case 1:
                bono = 100;
                break;
            case 2:
                bono = 200;
                break;
            case 3:
                bono = 300;
                break;
            case 4:
                bono = 400;
                break;
            case 5:
                bono = 500;
                break;
            default:
                if (years>5){
                    bono = 1000;

                }else {
                    System.out.println("introduzca una antiguedad valida ");
                    bono =0;
                }
        }

        System.out.printf("Su bono por los  %d años de trabajo es de $ %d",years, bono);



    }


}
