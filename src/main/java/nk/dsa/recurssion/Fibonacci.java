package nk.dsa.recurssion;

public class Fibonacci {
   static int[] arr =new int[1500];
    static int fib(int n){

        int fibValue=0;
        if(n<2){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        else {
            fibValue= fib(n-1)+fib(n-2);
            arr[n]=fibValue;
            return fibValue;
        }
    }

    public static void main(String[] args) {
        //System.out.println(arr[0]);
        System.out.println(fib(1000));
    }
}
