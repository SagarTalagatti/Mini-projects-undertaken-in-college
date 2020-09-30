package datastructurepackage;

import java.util.Scanner;

public class LinkedQueue implements IQueue
{
    private class Node
    {
        int data;
        Node link;
    }
    
    Scanner in=new Scanner(System.in);
    
    private Node front,rear;
    
    public LinkedQueue()
    {
        front=rear=null;
    }
    
    public void insert(int ele)
    {
        Node temp=new Node();
        
        temp.data=ele;
        temp.link=null;
        
        if(front==null)
        {
            front=rear=temp;
        }
        else
        {
            rear.link=temp;
            rear=temp;
        }
    }
    
    public void delete()throws QueueEmptyException
    {              
        if(front==null)
            throw new QueueEmptyException("\nQueue is empty!!!");
        else if(front==rear)
        {
            System.out.println("\nThe deleted element is:"+front.data);
            front=rear=null;
        }
        else
        {
            Node temp;
            
            temp=front;
            front=front.link;
            temp.link=null;
            
            System.out.println("\nThe deleted element is:"+temp.data);
            temp=null;
        }   
    }
    
    public void display()
    {
        if(front==null)
            System.out.println("\nQueue is empty!!!");
        else
        {
            Node temp;
            
            temp=front;
            System.out.println("\nThe contents of queue are:");
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.link;
            }
        }
        System.out.println();
    }
}