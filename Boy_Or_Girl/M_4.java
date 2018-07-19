package any;

import java.util.*;
public class M_4
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String s = "";
        for(int i = 0;i<name.length();i++)
            if(!(s.contains("" + name.charAt(i))))
                s = s + name.charAt(i);
        if(s.length()%2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");


    }

}