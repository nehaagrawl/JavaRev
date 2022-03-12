/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
 */
import java.util.*;
public class PivotNumber
    {
        public static int pivotIndex(int[] nums) {
            int sum=0;

            int leftsum=0;
            for(int x:nums)
                sum=sum+x;

            for(int i=0;i<nums.length;i++)
            {
                if(leftsum==sum-leftsum-nums[i]){
                    return i;}
                leftsum+=nums[i];
            }

            return -1;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] nums=new int[n];
           // int nums[]={1,7,3,6,5,6};
            for(int y=0;y<nums.length;y++) {
                nums[y] = sc.nextInt();
            }
            for(int y=0;y<nums.length;y++)
            {

                System.out.print(+nums[y]+" ");
            }
            System.out.println(" ");
            System.out.print(pivotIndex(nums));
        }
    }

