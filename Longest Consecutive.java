import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();

    int []a1 = new int [n1];

    for(int i=0; i<a1.length;i++)
    {
        a1[i] = scn.nextInt();
    }

    HashMap<Integer,Boolean> map = new HashMap<>();

    for(int val : a1)
    {   
        map.put(val, true);
    }
    

    for(int val : a1)
    {
        if(map.containsKey(val-1))
        {
           map.put(val,false);
        }
        
    }

    int maxStartPoint =0;
    int maxStartLength =0;
    for(int val : a1)
    {   
        if(map.get(val)==true)
        {
            int tl =1;
            int startPoint = val;

            while(map.containsKey(tl+startPoint))
            {
                tl++;

            }
            if(tl>maxStartLength)
            {
                maxStartLength=tl;
                maxStartPoint = startPoint;
            }
        }
    }

    for(int i=0;i<maxStartLength;i++)
    {
        System.out.println(maxStartPoint+i);
    }
 }

}
