package any;

import java.util.Scanner;

public class M_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int number = n.replaceAll("(.)(?=.*?\\1)", "").length();
        if(number % 2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else System.out.println("IGNORE HIM!");
    }
}
