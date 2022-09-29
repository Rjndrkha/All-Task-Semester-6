package Task;

import java.util.*;

public class login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, password;
        int nilaii = 0;
        System.out.println("================================");
        System.out.println("      Silahkan LOGIN Dulu       ");
        System.out.println("================================");

        for (int i = 0; i <= 5; i++) {
            nilaii = i + 1;
            System.out.print("Masukan Username : ");
            username = sc.nextLine();
            System.out.print("Enter Password : ");
            password = sc.nextLine();
            if (username.equalsIgnoreCase("admin")) {

                if (password.equals("admin")) {
                    System.out.println("You have successfully logged in");
                    break;
                } else {
                    System.out.println("Sorry,wrong password");
                    System.out.println("================================");
                }
            } else {
                
                System.out.println("Username Can't be found");
                System.out.println("================================");
            }
        }
    }
}
