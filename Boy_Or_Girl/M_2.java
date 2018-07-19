package any;

import java.util.HashSet;
import java.util.Scanner;

public class M_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashSet<Character> a = new HashSet<>();
        String  s = sc.next();
        for(char c:s.toCharArray())
            a.add(c);
        System.out.println(a.size()%2==0?"CHAT WITH HER!":"IGNORE HIM!");
    }
}
