package nk.dsa.recurssion;

public class TowerOfHanoi
{
    public static  void hanoi(int n,int a,int b,int c){
        if(n>0){
            hanoi(n-1,a,c,b);
            String s = String.format("(%s,%s)",a,c);
            System.out.println(s);
            hanoi(n-1,b,a,c);
        }
    }
    public static void main(String[] args) {

        hanoi(3,1,2,3);

    }
}
