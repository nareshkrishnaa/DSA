package nk.dsa.binarySearch;

public class main {
    static  Integer binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;


        while(start<=end){ //################################
            int mid =start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;

            } else if (arr[mid]==target) {
                return mid;
            }
        }
        return null;
    }
    public static void main(String[] args) {

        int[] arr1 ={1,2,3,4,5,6};
        System.out.println(binarySearch(arr1,5));
        System.out.println(binarySearch(arr1,10));

    }
}
