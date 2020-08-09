import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class MyApp {

    //    5. Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la
//    persona de mayor edad. Realice el algoritmo correspondiente y represéntelo con un
//    diagrama de flujo y pseudocódigo

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
        String nameOne;
        String nameTwo;
        String nameThree;
        int ageOne;
        int ageTwo;
        int ageThree;
        String Older;
        int ageOlder;

        System.out.println("ingrese el nombre de la persona uno");
        nameOne = keyboard.next();
        System.out.println("ingrese la edad de la persona uno");
        ageOne = keyboard.nextInt();

        System.out.println("ingrese el nombre de la persona dos");
        nameTwo = keyboard.next();
        System.out.println("ingrese la edad de la persona dos");
        ageTwo = keyboard.nextInt();

        System.out.println("ingrese el nombre de la persona tres");
        nameThree = keyboard.next();
        System.out.println("ingrese la edad de la persona tres");
        ageThree = keyboard.nextInt();


        if (ageOne> ageTwo  && ageOne>ageThree){
            Older = nameOne;
            ageOlder = ageOne;
        }else if(ageTwo> ageOne  && ageTwo>ageThree){
            Older = nameTwo;
            ageOlder = ageTwo;
        }else {
            Older = nameThree;
            ageOlder = ageThree;
        }

        System.out.printf("La persona con la edad mayor es " + Older + ". Tiene %d años ",ageOlder);

    }

}
