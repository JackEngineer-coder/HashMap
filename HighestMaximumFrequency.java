import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(hm.containsKey(ch))
            {
                int old_frequency = hm.get(ch);
                int new_frequency = old_frequency+1;
                hm.put(ch,new_frequency);
            }
            else
            {
                hm.put(ch,1);
            }
        }


        char mfc = str.charAt(0);
        for(Character Key : hm.keySet())
        {
           if(hm.get(Key)> hm.get(mfc))
           {
               mfc = Key;
           }
        }

        System.out.println(mfc);
    }

}
