import java.util.Scanner;

public class MyApp {

//9. Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y
//    daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
//    ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
//    beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad –como de- ficiencia
//    cardiaca o diabetes–, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo
//    10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que
//    represente el algoritmo para determinar cuánto le cuesta a una persona contratar una
//    póliza.

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double insuranceBasePrice;
        boolean insuranceType;
        double  totalCost;
        boolean drinkAlcohol;
        boolean glassesUse;
        boolean sick;
        int age;
        double ageCharge;
        double percentExtra;

        System.out.println("Por favor responda las siguientes pregutnas 'true' en caso afirmativo y 'false' en caso contrario");
        System.out.println("¿Prefiere una poliza de cobertura amplia?");
//        System.out.println(" de lo contrario, si quiere una que solo cubra daños a terceros, introduzca -false-");
        insuranceType = keyboard.nextBoolean();

        if (insuranceType) {
            totalCost = 1200;
        }else{
            totalCost = 950;
        }



        System.out.println("¿Tiene como habito beber?");
        drinkAlcohol = keyboard.nextBoolean();

        if (drinkAlcohol){
            percentExtra = 0.1;
        }else{
            percentExtra = 0;
        }

        System.out.println("¿Utiliza lentes para ver?");
        glassesUse = keyboard.nextBoolean();

        if (glassesUse){
            percentExtra = percentExtra + 0.05;
        }


        System.out.println("Padece alguna enfermedad como deficiencia cardiaca o diabetes");
        sick = keyboard.nextBoolean();

        if (sick){
            percentExtra = percentExtra + 0.05;
        }

        System.out.println("Por favor introduzca su edad");
        age = keyboard.nextInt();

        if (age >40){
            ageCharge=0.2;
        }else{
            ageCharge=0.1;
        }
        percentExtra = percentExtra + ageCharge;

                totalCost = totalCost * (1+percentExtra);

        System.out.println("El costo de su poliza es de $" + totalCost);


    }


}
