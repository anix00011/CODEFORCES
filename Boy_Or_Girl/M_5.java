package any;

import java.util.Scanner;


public class M_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int count = 0;
        while(!(name.equals(""))) {
            name = name.replaceAll(Character.toString(name.charAt(0)), "");
            count++;
        }
        if(count%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}