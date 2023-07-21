import java.util.PriorityQueue;
public class priority {
  public static void main(String[] args) {
  PriorityQueue<String> queue=new PriorityQueue<String>();  
  queue.add("Red");
  queue.add("Green");
  queue.add("Orange");
  queue.add("White");
  queue.add("Black");
  PriorityQueue<String>  queue1=new PriorityQueue<String>();  
  queue1.add("Red");
  queue1.add("Pink");
  queue1.add("Black");
  queue1.add("Orange");
  for (String element :queue ){
    System.out.println(element);
    }
    for (String element :queue){
        System.out.println(queue1.contains(element) ? "Yes" : "No");
     }    
 }
}