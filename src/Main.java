import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type first numerator");
        int numeratorFractionOne = sc.nextInt();
        System.out.println("Type first denominator");
        int denominatorFractionOne = sc.nextInt();
        System.out.println("Type second numerator");
        int numeratorFractionTwo = sc.nextInt();
        System.out.println("Type second denominator");
        int denominatorFractionTwo = sc.nextInt();
        sc.close();

        Fraction fractionOne = new Fraction (numeratorFractionOne, denominatorFractionOne);
        Fraction fractionTwo = new Fraction (numeratorFractionTwo, denominatorFractionTwo);

        IFraction add = fractionOne.plus(fractionTwo);
        IFraction subtract = fractionOne.minus(fractionTwo);
        IFraction multiply = fractionOne.times(fractionTwo);
        IFraction divide = fractionOne.dividedBy(fractionTwo);

        System.out.println("Added: " + add.getNumerator() + "/" + add.getDenominator() + "\n");
        System.out.println("Subtracted: " + subtract.getNumerator() + "/" + subtract.getDenominator() + "\n");
        System.out.println("Multiplied: " + multiply.getNumerator() + "/" + multiply.getDenominator() + "\n");
        System.out.println("Divided: " + divide.getNumerator() + "/" + divide.getDenominator() + "\n");
    }
}
