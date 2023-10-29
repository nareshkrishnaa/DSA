package nk.dsa.recurssion;

public class toh {


    public static void myFunction(int n,char from, char to,char aux){

        if(n==1){
            String s = String.format("move %s to %s",from,to);
            System.out.println(s);
            return;
        }

        myFunction(n-1,from,aux,to);
        String s = String.format("move %s to %s",from,to);
        System.out.println(s);
        myFunction(n-1,aux,to,from);
    }

    public static void main(String[] args) {

        myFunction(3,'1','2','3');
    }
}
