public class Recursion{
    public static int factorial(int n){
        if(n==0 || n ==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(7));
}
}

// output would be 5040 because 7*6*5*4*3*2*1 = 5040
