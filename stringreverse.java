import java.util.*;

public class stringrevers {
	

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter string ");

        String str1 = scan.nextLine();

        
        str1.trim();

        str1 = str1 + " ";

        String str2 = " ";

        String str3 = " ";
       
        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (ch == ' ') {

                str3 = str3 + str2;

                str2 = " ";

            } else {

                str2 = ch + str2;

            }

        }

        System.out.println(str3);

    }

}


