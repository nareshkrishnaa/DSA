package nk.dsa.recurssion;

public class IsArraySorted {

    public static boolean isSorted(int[] arr,int length){

        if(length==1){
            return true;
        }

        if(arr[length-1]<arr[length-2]){
            return false;
        }else {
            return isSorted(arr,length-1);
        }

    }
    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 3, 2, 1, 4};

        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray,5));
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray,5));
    }
}
