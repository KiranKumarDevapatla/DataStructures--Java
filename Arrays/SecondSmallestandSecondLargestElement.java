package Arrays;
import java.util.Scanner;

public class SecondSmallestandSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        int large= Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            small=Math.min(small,arr[i]);
            large=Math.max(large,arr[i]);

        }
        for(int i=0;i<n;i++)
        {
            if (arr[i] < secondsmall && arr[i] != small)
		{
			secondsmall = arr[i];
		}
		if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
        }
     System.out.println(secondsmall);
    System.out.println(second_large);
    }

}
