import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left=0;
        int right=n-1;
        boolean found = true;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]==target){
                System.out.print(mid);
                found = false;
                break;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        if(found){
            System.out.println("founded");
        }else{
            System.out.println("not present");
        }


    }
}
