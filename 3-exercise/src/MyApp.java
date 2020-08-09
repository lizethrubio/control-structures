import java.util.Scanner;

//3. El 14 de febrero una persona desea comprarle un regalo al ser querido que más aprecia
//        en ese momento, su dilema radica en qué regalo puede hacerle, las alternativas que
//        tiene son las siguientes:
//          Tarjeta $10.00 o menos
//          Chocolates $11.00 a $100.00
//          Flores $101.00 a $250.00
//          Anillo Más de $251.00

public class MyApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double budget;
        String idealGift;


        System.out.println("Ingrese su presupuesto para el regalo ");
        budget = keyboard.nextDouble();

        if (budget>251 ){
            idealGift = "Anillo";
        } else if (budget>101){
            idealGift = "Flores";
        } else if (budget > 11){
            idealGift = "Chocolate";
        }else{
            idealGift = "Tarjeta";
        }

        System.out.printf("Dado su presupuesto de $ %.2f su regalo ideal es:  ",budget);
        System.out.print(idealGift);


    }


}
