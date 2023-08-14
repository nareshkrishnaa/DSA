package nk.dsa.recurssion;

public class VisualisationOfRecursion {
    public static int print(int n){
        if(n==0){
            return 0;
        }
        else {
            System.out.println(n);
            return print(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(print(5));
    }
}


