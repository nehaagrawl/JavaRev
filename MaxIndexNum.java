import java.util.Scanner;

public class MaxIndexNum {
    public static int DominantIndex(int[] arr)
    {
        int maxIndex=0;
        for(int i=0;i<arr.length;++i)
            if(arr[i]>arr[maxIndex])
                maxIndex=i;
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=i && arr[maxIndex]<2*arr[i])
                return -1;
        return maxIndex;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int k=0;k<arr.length;k++)
        {
            arr[k]= sc.nextInt();

        }
        System.out.println(DominantIndex(arr));
    }
}
