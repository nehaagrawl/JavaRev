/*
Reverse a String Using String Builder
 */
import java.lang.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder w=new StringBuilder("NehaAgarwal");
        for (int i = 0; i < w.length()/2; i++) {

           int front=i;
            int back=w.length()-front-1;
            char frontchar=w.charAt(front);
            char backchar=w.charAt(back);
            w.setCharAt(front,backchar);
w.setCharAt(back,frontchar);

        }
        System.out.println(w);
    }
}
