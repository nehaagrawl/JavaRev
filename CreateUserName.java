/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
 */
public class CreateUserName {
    public static void main(String[] args) {
        String a= "apnaCollegeJava@gmail.com";
        String Username="";
        for (int i = 0; i <a.length(); i++) {

            if(a.charAt(i)=='@')
           break;
            Username+=a.charAt(i);

        }
System.out.println(Username);
    }
}
