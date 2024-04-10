package Arrays;
import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] A= new int[n];

        
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (A[i] == target) {
                System.out.println("found at index" + i);
                return;
            } 
                

        }
        System.out.println("Not fount");

    }
}