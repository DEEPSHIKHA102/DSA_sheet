import java.util.*;

// public class ArmStrong {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//             int num = sc.nextInt();
//             int originalNumber = num;
//             int sum= 0;
//             int digits = String.valueOf(num).length();
//             while(num > 0){
//                 int digit = num % 10;
//                 sum += Math.pow(digit,digits);
//                 num /= 10;
//             }

//             if(sum == originalNumber){
//                 System.out.println("Armstrong");
//             }
//             else{
//                 System.out.println("Not Armstrong");
//             }
//         }
//     }



public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int originalNumber = n;
            
            int s = String.valueOf(n).length();
            int sum = 0;

            while(n>0){
                int rem = n%10;
                sum +=Math.pow(rem ,s);
                n = n/10;
            }

            if(sum == originalNumber){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not Armstrong");
            }
        
    }
    
}

    

