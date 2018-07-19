package any;

import java.util.*;

public class M_6{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}