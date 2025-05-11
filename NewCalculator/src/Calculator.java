import java.util.*;
public class Calculator
{
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while(run)
        {
            System.out.println(BLUE+"\n Enhcanced Calculator"+RESET);
            System.out.println(CYAN+"1. Basic Operations"+RESET);
            System.out.println(CYAN+"2. Scientific Calculator"+RESET);
            System.out.println(CYAN+"3. Unit Converter"+RESET);
            System.out.println(RED+"4. Exit"+RESET);
            System.out.print(YELLOW+"Choose an option: "+RESET);

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    Arithmetic(sc);
                    break;
                case 2:
                    scientific(sc);
                    break;
                case 3:
                    unitConversion(sc);
                    break;
                case 4:
                    run=false;
                    System.out.println(GREEN + "Thank you for using the calculator!" + RESET);
                    break;
                default:
                    System.out.println(RED+"Give a Correct Choice!"+RESET);
            }
        }
    }
    private static void Arithmetic (Scanner sc)
    {
        System.out.print(YELLOW+"Enter First Number: "+RESET);
        double a = sc.nextDouble();

        System.out.print(YELLOW+"Enter Second Number: "+RESET);
        double b = sc.nextDouble();

        System.out.print(YELLOW+"Choose Operation (+,-,*,/): "+RESET);
        char op = sc.next(). charAt(0);

        try
        {
            switch (op)
            {
                case '+':
                    System.out.println(GREEN+"Result: "+Arithmetic.add(a,b)+RESET);
                    break;
                case '-':
                    System.out.println(GREEN+"Result: "+Arithmetic.subtract(a,b)+RESET);
                    break;
                case '*':
                    System.out.println(GREEN+"Result: "+Arithmetic.multiply(a,b)+RESET);
                    break;
                case '/':
                    System.out.println(GREEN+"Result: "+Arithmetic.divide(a,b)+RESET);
                    break;
                default:
                    System.out.println(RED+"Not Defined Operation!"+RESET);
            }
        }catch(Exception e)
        {
            System.out.println(RED+"Error: "+e.getMessage()+RESET);
        }
    }
    private static void scientific(Scanner sc)
    {
        System.out.println(CYAN+"Choose Operation: 1.Sqrt 2.Power 3.Log 4.Sin 5.Cos 6.Tan"+RESET);
        int op = sc.nextInt();
        double a,b;
        switch(op)
        {
            case 1:
                System.out.println(YELLOW+"Enter Number: "+RESET);
                a=sc.nextDouble();
                System.out.println(GREEN+"√"+a+"="+ScientificCalculator.sqrt(a)+RESET);
                break;

            case 2:
                System.out.println(YELLOW+"Base: "+RESET);
                a=sc.nextDouble();

                System.out.println(YELLOW+"Exponent: "+RESET);
                b=sc.nextDouble();

                System.out.println(GREEN+"Result: "+ScientificCalculator.power(a,b)+RESET);
                break;

            case 3:
                System.out.println(YELLOW+"Enter Number: "+RESET);
                a=sc.nextDouble();
                System.out.println(GREEN+"Log("+a+")="+ScientificCalculator.log(a)+RESET);
                break;

            case 4:
                System.out.println(YELLOW+"Angle In Degree: "+RESET);
                a=sc.nextDouble();
                System.out.println(GREEN+"Sin(" + a + ") = " + ScientificCalculator.sin(a)+RESET);
                break;

            case 5:
                System.out.println(YELLOW+"Angle In Degree: "+RESET);
                a=sc.nextDouble();
                System.out.println(GREEN+"Cos(" + a + ") = " + ScientificCalculator.cos(a)+RESET);
                break;

            case 6:
                System.out.println(YELLOW+"Angle In Degree: "+RESET);
                a=sc.nextDouble();
                System.out.println(GREEN+"Tan(" + a + ") = " + ScientificCalculator.tan(a)+RESET);
                break;
            default:
                System.out.println(RED + "Invalid Scientific Operation!" + RESET);

        }
    }

    private static void unitConversion(Scanner sc) {
        System.out.println(CYAN+"Options:\n1.C to F\n2.F to C\n3.C to K\n4.INR to USD\n5.USD to INR\n6.INR to EUR\n7. Km to Miles\n8. Miles to Km\n9. Kg to Lb\n10. Lb to Kg\nChoose Method:"+RESET);
        int op = sc.nextInt();
        double val;

        switch (op) {
            case 1:
                System.out.print(YELLOW+"Enter °C: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: " + UnitConversion.celsiusToFahrenheit(val) + " °F"+RESET);
                break;

            case 2:
                System.out.print(YELLOW+"Enter °F: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: " + UnitConversion.fahrenheitToCelsius(val) + " °C"+RESET);
                break;

            case 3:
                System.out.print(YELLOW+"Enter °C: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: " + UnitConversion.celsiusToKelvin(val) + " K"+RESET);
                break;

            case 4:
                System.out.print(YELLOW+"Enter INR: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: $" + UnitConversion.inrToUsd(val)+RESET);
                break;

            case 5:
                System.out.print(YELLOW+"Enter USD: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: ₹" + UnitConversion.usdToInr(val)+RESET);
                break;

            case 6:
                System.out.print(YELLOW+"Enter INR: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: €" + UnitConversion.inrToEur(val)+RESET);
                break;

            case 7:
                System.out.print(YELLOW+"Enter Km: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: " + UnitConversion.kmToMiles(val) + " miles"+RESET);
                break;

            case 8:
                System.out.print(YELLOW+"Enter Miles: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: " + UnitConversion.milesToKm(val) + " km"+RESET);
                break;

            case 9:
                System.out.print(YELLOW+"Enter Kg: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: " + UnitConversion.kgToPounds(val) + " lb"+RESET);
                break;

            case 10:
                System.out.print(YELLOW+"Enter Lb: "+RESET);
                val = sc.nextDouble();
                System.out.println(GREEN+"Result: " + UnitConversion.poundsToKg(val) + " kg"+RESET);
                break;

            default:
                System.out.println(RED+"Invalid option!"+RESET);
        }
    }
}
