/*
Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘y’.
 */
import java.util.*;
public class ReplaceString {
    public static void main(String[] args) {
        String a="elephant";
        String y="";

        for (int i = 0; i <a.length() ;  i++ ) {
        if(a.charAt(i)=='e')
        {
          y+='y';
        }
        else
        {
            y+=a.charAt(i);
        }

        }
System.out.println(y);
    }
}
