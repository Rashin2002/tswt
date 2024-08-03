/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedList;
class Node
{
    public int data;
    public Node next_node;
    
    public Node()
    {
        next_node = null;
    }
}

class SinglyLinkedList
{
    private Node head;
    
    public SinglyLinkedList()
    {
        head = null;
    }
    
    public void addNodeBeg(int value)
    {
        if(head == null)
        {
            Node new_node = new Node();
            new_node.data = value;
            head = new_node;
        }
        else
        {
            Node new_node = new Node();
            new_node.data = value;
            new_node.next_node=head;
            head = new_node;
        }
        
    }
    
    public void deleteFromBeg()
    {
        head = head.next_node;
    }
    
    public void addNodeEnd(int value)
    {
        if(head == null)
        {
            Node new_node = new Node();
            new_node.data = value;
            head = new_node;
        }
        else
        {
            Node new_node = new Node();
            new_node.data = value;
            Node current = head;
            
            while(current.next_node != null)
            {
                current = current.next_node;
            }
            current.next_node = new_node;
        }
    }
    
    /*public void deleteFromEnd()
    {
        Node current1 = head;
        Node current2 = head;
        
        while(current1.next_node != null)
        {
            current2 = current1;
            current1 = current1.next_node;
        }
        current2.next_node = null;
    }*/
    
    public void deleteFromEnd()
    {
        Node current1 = head;
        
        while(current1.next_node.next_node != null)
        {
            current1 = current1.next_node;
        }
        current1.next_node = null;
    }
    
    public void insertToMiddle(Node p, int value)
    {
        
    }
    
    public void deleteFromMiddle()
    {
        
    }
    
    public void printValue()
    {
        Node current = head;
        while(current != null)
        {
            System.out.println("Node Value is " + current.data);
            current = current.next_node;
        }
    }  
}

public class ExSinglyLinkedList 
{
    public static void main(String[] args)
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        /*sll.addNodeBeg(10);
        sll.addNodeBeg(25);
        sll.addNodeBeg(31);*/
        sll.addNodeEnd(20);
        sll.addNodeEnd(30);
        sll.addNodeEnd(40);
        sll.deleteFromEnd();
        //sll.insertToMiddle(sll.head, 40);
        //sll.deleteFromBeg();
        sll.printValue();
    }
    
}
