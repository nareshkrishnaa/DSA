package nk.dsa.backtracking;

public class NKString {

    public static void generateString(int n, int k){
        function(n,k,new StringBuilder());
    }
    public static void function(int n, int k, StringBuilder current){
        if(current.length() == n){
            System.out.println(current);
            return;
        }

        for(int i=0;i<k;i++){
            current.append(i);
            function(n,k,current);
            current.deleteCharAt(current.length()-1);
        }
    }
    public static void main(String[] args) {
        int n = 3;//length
        int k = 4;//range -1

        generateString(n,k);
    }
}

