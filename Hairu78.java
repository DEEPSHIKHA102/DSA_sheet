import java.util.*;
public class Hairu78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

         int count1 = 0, count2 = 0, count3 = 0;

        for (char ch : str1.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count1++;
            }
        }
        for (char ch : str2.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count2++;
            }
        }

        for (char ch : str3.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count3++;
            }
        }

        if (count1 == 5 && count2 == 7 && count3 == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
    
}
