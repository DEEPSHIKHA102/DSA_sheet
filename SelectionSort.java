import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int key = i;
            for(int j=i;j<n;j++){
                if(key>arr[j]){
                    key = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }
        for(int i=0;i<n;i++){
        System.err.println(arr[i] + " ");
        }
    }
}
