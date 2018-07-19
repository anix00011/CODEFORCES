package any;

import java.io.*;
import java.util.*;

public class M_2
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    static int div(int x){
        int c=0;
        for(int z=1;z<=Math.sqrt(x);z++){
            if(x%z==0){
                if(x/z==z) c++;
                else c+=2;
            }
        }
        return c;
    }
    public static void main(String[] args) throws IOException {
        FastReader s1=new FastReader();
        int s=0;
        int[] array = new int[1000001];
        int a=s1.nextInt();
        int b=s1.nextInt();
        int c=s1.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                for(int k=1;k<=c;k++){
                    int product = i * j * k;
                    if(array[product] == 0)//this step is taken because product was same many times
                        array[product] = div(i * j * k);
                    s += array[product];
                }
            }
        }
        System.out.println(s);
    }
}
