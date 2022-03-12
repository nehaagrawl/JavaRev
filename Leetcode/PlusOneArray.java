/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOneArray {
    public static int[] PlusOne(int[] num) {
        int l = num.length;
        for (int i = l - 1; i >= 0; i--) {
            if (num[i] != 9) {
                num[i]++;
                break;
            } else {
                num[i] = 0;
            }
        }
        if (num[0] == 0) {
            int[] num1 = new int[l + 1];
            num1[0] = 1;
            return num1;
        }
        return num;
    }


    public static void main(String[] args) {
        int[] num = {9,8, 7, 6, 5, 4, 3, 2, 1, 0};

        printArray(PlusOne(num));
    }

    private static void printArray(int[] PlusOne) {
        for (int i : PlusOne) {
            System.out.print(i+" ");

        }
    }
}

