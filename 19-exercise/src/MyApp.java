import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class MyApp {

//    19. La secretaria de salud requiere un diagrama de flujo que le represente el algoritmo que
//    permita determinar qué tipo de vacuna (A, B o C) debe aplicar a una persona,
//    considerando que si es mayor de 70 años, sin importar el sexo, se le aplica la tipo C; si
//    tiene entre 16 y 69 años, y es mujer, se le aplica la B, y si es hombre, la A; si es menor de
//16 años, se le aplica la tipo A, sin importar el sexo.

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int years;
        boolean sexM;
        String vacumType;

        System.out.println("Ingrese true si es mujer o false si es hombre");
        sexM = keyboard.nextBoolean();

        System.out.println("Ingrese la edad de la persona");
        years = keyboard.nextInt();

        if (years >70){
            vacumType="C";

        }else if ( years >= 16){

            if(sexM){
                vacumType= "B";
            }else {
                vacumType = "A";
            }

        }else if(years<16 && years>0){
            vacumType= "A";
        }else{
            vacumType = "No encontrado, digite un sexo y edad valida";

        }
        System.out.println("El tipo de vacuna a administrar es: " + vacumType);

    }







}
