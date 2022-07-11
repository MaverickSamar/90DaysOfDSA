import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    Node head;
    private int size;
    Codechef(){
        this.size=0;
    }
    
    class Node{
        String data;
        Node next;
        
        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        
    }
    
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        
        Node currentNode = head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    
    public void printList()
    {
        Node currentNode = head;
        while(currentNode != null)
        {
            System.out.println(currentNode + "->");
            currentNode = currentNode.next;
        }
    }
    //deletion
    
    public void deleteFirst(){
        if(head == null)
        {
            return;
        }
        size--;
        head = head.next;
        
    }
    
    public void deleteLast(){
        if(head == null)
        {
            return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node secondNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = null;
    }
    
    public int getSize(){
        return size;
    }
    
	public static void main (String[] args)
	{
		Codechef list = new Codechef();
		list.addFirst("a");
		list.addFirst("is");
		list.addFirst("This");
		list.addLast("Linked List");
		printList();
	}
}
