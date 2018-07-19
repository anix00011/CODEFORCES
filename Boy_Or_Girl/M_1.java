package any;

import java.util.Scanner;


public class M_1 {


    public static void main(String [] args){

        Scanner a=new Scanner(System.in);
        String c=a.next();
        int s=0;
        String c1=new String();
        for (int i=0;i<c.length();i++){
            if(i==c.lastIndexOf(c.charAt(i))){ s++; }

        }


        if(s%2==0){ System.out.println("CHAT WITH HER!");}
        else {  System.out.println("IGNORE HIM!"); }


    }

}