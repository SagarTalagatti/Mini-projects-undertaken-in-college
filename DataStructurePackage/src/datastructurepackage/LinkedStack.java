package datastructurepackage;

import java.util.Scanner;

public class LinkedStack implements IStack
{
    private class Node
    {
        int data;
        Node link;
    }
    
    Scanner in=new Scanner(System.in);
    
    private Node top;
    
    public LinkedStack()
    {
        top=null;
    }
    
    public void push(int ele)
    {
        Node temp=new Node();
        
        temp.data=ele;
        
        temp.link=top;
        top=temp;
    }
    
    public void pop()throws StackEmptyException
    {
        if(top==null)
             throw new StackEmptyException("\nStack is empty!!!");
        else
        {
           System.out.println("\nPopped element is: "+top.data);
           top=top.link;
        }
    }
    
    public void display()
    {
        if(top==null)
            System.out.println("\nStack is empty!!!");
        else
        {
            Node temp;
            
            System.out.println("\nContents of stack are:");
            for(temp=top;temp!=null;temp=temp.link)
                System.out.println(temp.data);
        }
        System.out.println();
    }
    
    public int peek()
    {
        if(top==null)
            return -1;
        else
            return top.data;
    }
}