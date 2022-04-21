import java.util.*;

public class methods
{
    public static void main(String[] args)
    {
        Currency c1 = Currency.getInstance("USD");
        Currency c2 = Currency.getInstance("INR");

        String cCode1=c1.getCurrencyCode();
        String cCode2=c2.getCurrencyCode();

        //System.out.println(Currency.getAvailableCurrencies());

        System.out.println(c1.toString());



        System.out.println(c1.getDisplayName() +" code :" + cCode1);
        System.out.println("Indian Rupee Code:" + cCode2);
        
        int D1 = c1.getDefaultFractionDigits();
        System.out.println(cCode1 + " Fraction digits:" + D1);

        int D2 = c2.getDefaultFractionDigits();
        System.out.println("INR Fraction digits:" + D2);

        System.out.println(cCode1 + " Display :" + c1.getDisplayName());
        System.out.println("INR Display :" + c2.getDisplayName());

        System.out.println("INR Symbol :" + c2.getSymbol());
        System.out.println(cCode1+" Symbol:" + c1.getSymbol());
    }
}