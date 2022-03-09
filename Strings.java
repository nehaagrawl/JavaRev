import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="cdac";
        String s1= "cdac";
        String num="1";
        int a=12;
        System.out.println(s.equals(s1));
        System.out.println(s.length());
        System.out.println(s.compareTo(s1));
        System.out.println(s.concat(s1));

        System.out.println(s.substring(1,2));
        int n=Integer.parseInt(num)+1;
         String y=Integer.toString(a)+1;
        System.out.println(y);
        System.out.println(n);
//        for (int i = 1; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
    }
}
