public class MathUtil {
    //shows if number is prime
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    //показывает самое большое число делитель для обоих
    public static int GCD(int a, int b) {
        int gcd = 1;
        if (b == 0) {
            return a;
        }
        if (a % b == 0) {
            gcd = b;
            return gcd;
        }
        else {
            return GCD(b, a % b);
        }

    }
    //показывает НОК
    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
    //дает число фибоначи после стольких
    public static int fibonacci(int n) {
        int fibonacci = 0;
        int a = 1;
        int b =0;
        for(int i = 0; i<n; i++){
            b = fibonacci;
            fibonacci += a;
            a = b;
        }
        return fibonacci;
    }
    //находит факториал
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    //Сравнивает если число Идеальное
    boolean isPerfectNumber(int n) {
        boolean isPerfectNumber = false;
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            isPerfectNumber = true;
        }
        return isPerfectNumber;
    }
    //сумма всех цифр
    int sumOfDigits(int n) {
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    //перевернутое число
    int reverseNumber(int n) {
        String reverse = "";
        while(n>0){
            reverse = reverse + n%10;
            n = n/10;
        }
        return Integer.parseInt(reverse);
    }
    //Если число армстронг
    boolean isArmstrongNumber(int n){
        String number = Integer.toString(n);
        int lan = number.length();
        int sum = 0;
        int b = n;
        while(b>0){
            int num1 = b%10;
            sum += Math.pow(num1, lan);
            b = b/10;
        }
        return sum == n;
    }
    //следующее прайм число
    int nextPrime(int n) {
        while(true){
            n++;
            if(isPrime(n)){
                return n;
            }
        }
    }

}
