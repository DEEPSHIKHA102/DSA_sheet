import java.util.*;
// public class InsertArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // int  n = sc.nextInt();
//         int n = 5;

//         int[] arr = new int[5];
//         // for(int i=0;i<n;i++){
//         //     arr[i]=sc.nextInt();
//         // }

//         arr[0] = 3;
//         arr[1] = 5;

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
    
// }



public class InsertArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int pos = sc.nextInt();

        int[] arr2 = new int[n + 1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < pos) {
                arr2[i] = arr[i];
            } 
            else if (i == pos) {
                arr2[i] = element;
            } 
            else {
                arr2[i] = arr[i - 1];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
