//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtil.isPrime(97));
        System.out.println(MathUtil.isPrime(17));
        System.out.println(MathUtil.isPrime(15));
        System.out.println(MathUtil.GCD(270 ,192));
        System.out.println(MathUtil.GCD(210 ,45));
        System.out.println(MathUtil.GCD(17 ,13));
        System.out.println(MathUtil.LCM(15 ,10));
        System.out.println(MathUtil.LCM(13 ,17));
        System.out.println(MathUtil.LCM(210 ,10));
        System.out.println(MathUtil.fibonacci(6));
        System.out.println(MathUtil.fibonacci(15));
        System.out.println(MathUtil.fibonacci(30));
        System.out.println(MathUtil.factorial(5));
        System.out.println(MathUtil.factorial(10));
        System.out.println(MathUtil.factorial(20));
        MathUtil adi = new MathUtil();
        System.out.println(adi.isPerfectNumber(6));
        System.out.println(adi.isPerfectNumber(28));
        System.out.println(adi.isPerfectNumber(301));
        System.out.println(adi.sumOfDigits(152));
        System.out.println(adi.sumOfDigits(1528));
        System.out.println(adi.sumOfDigits(15289));
        System.out.println(adi.reverseNumber(1529));
        System.out.println(adi.reverseNumber(25342));
        System.out.println(adi.reverseNumber(2534));
        System.out.println(adi.isArmstrongNumber(1));
        System.out.println(adi.isArmstrongNumber(1634));
        System.out.println(adi.isArmstrongNumber(152));
        System.out.println(adi.nextPrime(97));
        System.out.println(adi.nextPrime(17));
        System.out.println(adi.nextPrime(15));
    }
}