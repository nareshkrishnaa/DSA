package nk.dsa.backtracking;

public class NBit {


    public static void getBitStrings(int n){

        NBit.function(n,new StringBuilder());
    }

    public static void function(int n,StringBuilder current){
        if(current.length()==n){
            System.out.println(current);
            return;
        }

        current.append('0');
        function(n,current);
        current.deleteCharAt(current.length()-1);

        current.append('1');
        function(n,current);
        current.deleteCharAt(current.length()-1);

    }
    public static void main(String[] args) {
        getBitStrings(3);
    }
}
