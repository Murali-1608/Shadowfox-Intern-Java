public class ScientificCalculator
{
    public static double sqrt(double a)
    {
        return Math.sqrt(a);
    }

    public static double power(double base, double exponent)
    {
        return Math.pow(base, exponent);
    }

    public static double log(double a)
    {
        return Math.log(a);
    }

    public static double sin(double a)
    {
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a)
    {
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a)
    {
        return Math.tan(Math.toRadians(a));
    }
}
