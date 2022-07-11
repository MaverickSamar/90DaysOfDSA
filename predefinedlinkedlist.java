import java.util.*;
class LL
{
  public static void main(String[] args){
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("a");
    list.addLast("linked");
    list.add("list"); //in last
    string newstr = list.get(1); //linked
    int s = list.size(); // size of list
    list.removeFirst();
    list.removeLast();
    list.remove(0); // removes value at very first index
  }
}
