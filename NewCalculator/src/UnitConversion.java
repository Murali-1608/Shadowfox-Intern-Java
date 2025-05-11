public class UnitConversion
{
    public static double celsiusToFahrenheit(double c)
    {
        return (c*9/5)+32;
    }
    public static double fahrenheitToCelsius(double f)
    {
        return (f-32)*5/9;
    }
    public static double celsiusToKelvin(double c)
    {
        return c+273.15;
    }
    // Rupees Conversion

    public static double inrToUsd(double inr)
    {
        return inr*0.012;
    }
    public static double usdToInr(double usd)
    {
        return usd*84;
    }
    public static double inrToEur(double inr)
    {
        return inr*0.011;
    }
    public static double kmToMiles(double km)
    {
        return km * 0.621371;
    }

    public static double milesToKm(double miles)
    {
        return miles / 0.621371;
    }

    public static double kgToPounds(double kg)
    {
        return kg * 2.20462;
    }

    public static double poundsToKg(double lb)
    {
        return lb / 2.20462;
    }
}
