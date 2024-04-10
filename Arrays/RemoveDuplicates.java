package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
            for(int j=1;j<n;j++)
            {
                if(arr[count]!=arr[j])
                {
                    count++;
                    arr[count]=arr[j];
                }

            }
            System.out.println(count+1);
        
    }

}
