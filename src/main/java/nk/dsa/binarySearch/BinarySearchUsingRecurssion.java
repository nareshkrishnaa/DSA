package nk.dsa.binarySearch;

public class BinarySearchUsingRecurssion {

    static Integer bs(int[] arr,int s,int e,int target){
        if(s>e){
            return null;
        }
       int mid=(s+e)/2;

       if(target==arr[mid]){
           return mid;
       } else if (target<mid) {
           e=mid-1;
          return bs(arr,s,e,target);
       } else if (target>mid) {
           s=mid+1;
           return bs(arr,s,e,target);

       }
        return null;
    }


    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6};
        System.out.println(bs(arr,0,arr.length-1,5));
        System.out.println(bs(arr,0,arr.length-1,10));
    }
}
