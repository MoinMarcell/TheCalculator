import java.math.BigDecimal;
import java.math.MathContext;

public class Calculator {

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal(1);
        BigDecimal bigDecimal2 = new BigDecimal(0);
        BigDecimal bigDecimal3 = BigDecimal.valueOf(0.3);
        BigDecimal bigDecimal4 = BigDecimal.valueOf(0.1);

        System.out.println("Add:" + add(bigDecimal1, bigDecimal2));

        System.out.println("Sub:" + sub(bigDecimal2, bigDecimal2));

        System.out.println("Divide:" + divide(bigDecimal1, bigDecimal2)); // error!
        System.out.println("Divide:" + divide(bigDecimal2, bigDecimal1));
        System.out.println("Divide:" + divide(bigDecimal3, bigDecimal4));
        System.out.println("Divide:" + divide(bigDecimal4, bigDecimal3));

        System.out.println("Multiply:" + multiply(bigDecimal1, bigDecimal2));
        System.out.println("Multiply:" + multiply(bigDecimal2, bigDecimal1));
        System.out.println("Multiply:" + multiply(bigDecimal3, bigDecimal4));
        System.out.println("Multiply:" + multiply(bigDecimal4, bigDecimal3));
    }
    public static BigDecimal add(BigDecimal bigDecimal1, BigDecimal bigDecimal2){
        return bigDecimal1.add(bigDecimal2);
    }

    public static BigDecimal sub(BigDecimal bigDecimal1, BigDecimal bigDecimal2){
        return bigDecimal1.subtract(bigDecimal2);
    }

    public static BigDecimal divide(BigDecimal nominator, BigDecimal denominator){
        try{
            return nominator.divide(denominator, MathContext.DECIMAL32);
        }catch (ArithmeticException e){
            System.err.println("Division durch 0 nicht möglich: " + e);
        }
        return new BigDecimal(0);
    }

    public static BigDecimal multiply(BigDecimal bigDecimal1, BigDecimal bigDecimal2){
        return bigDecimal1.multiply(bigDecimal2, MathContext.DECIMAL32);
    }
}
