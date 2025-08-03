public class PrimeNumber_3_6 {
    public static boolean isPrime (int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are ");
        for(int i = 1; i <= 100; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }

}
