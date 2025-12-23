import java.util.*;

public class ThirdMinimum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        int[] shop1 = new int[n];
        for(int i=0;i<n;i++){
            shop1[i]=sc.nextInt();
        }

        int m = sc.nextInt();

        int[] shop2 = new int[m];
        for(int i=0;i<m;i++){
            shop2[i]=sc.nextInt();
        }

        int totalPhones[] = new int[n+m];

        for(int i=0;i<n;i++){
            totalPhones[i] = shop1[i];
        }

        for(int i=0;i<m;i++){
            totalPhones[n+i] = shop2[i];
        }

        // Arrays.sort(totalPhones);
        for(int i=0;i<n+m;i++){
            for(int j=0;j<n+m-1-i;j++){
                if(totalPhones[j]>totalPhones[j+1]){
                    int temp = totalPhones[j];
                    totalPhones[j] =totalPhones[j+1];
                    totalPhones[j+1] = temp;
                }
            }
        }

        System.out.println(totalPhones[2]);

    }
}
