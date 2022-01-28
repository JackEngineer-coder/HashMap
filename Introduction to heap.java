import java.util.*;

public class Main {

  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int []ranks = {12,14,33,1,43,534,54};
    for(int val : ranks)
    {
      pq.add(val);
    }

    while(pq.size()>0)
    {
      System.out.println(pq.peek());
      pq.remove();
    }

  }
}
