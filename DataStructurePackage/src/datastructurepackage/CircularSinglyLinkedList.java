package datastructurepackage;

import java.util.Scanner;

public class CircularSinglyLinkedList implements ILinkedList
{
    private class Node
    {
        int data;
        Node link;
    }
    
    Scanner in=new Scanner(System.in);
    
    private Node first,last;
    
    public CircularSinglyLinkedList()
    {
        first=null;
        last=null;
    }
    
    public void insertAtFront()
    {
        Node newNode=new Node();
        
        System.out.print("\nEnter an element to insert:");
        newNode.data=in.nextInt();
        if(first==null)
        {
            first=last=newNode;
            last.link=first;
        }
        else
        {
            newNode.link=first;
            first=newNode;
            last.link=first;
        }
    }
    
    public void insertAtRear()
    {
        Node newNode=new Node();
      
        System.out.print("\nEnter an element to insert:");
        newNode.data=in.nextInt();        
        
        if(first==null)
        {
            first=last=newNode;
            last.link=first;                
        }
        else
        {
            last.link=newNode;
            last=newNode;
            last.link=first;
        }
    }
    
    public int length()
    {
        int count=0;
        Node temp;
        
        if(first!=null)
        {
            count=1;
            if(first.link!=null)
                for(temp=first.link;temp!=first;count++,temp=temp.link);
        } 
                           
        return count;
    }
    
    public void insertAfterPos()
    {
        Node newNode=new Node();
        int pos,len;
        
        System.out.print("\nEnter the position after which the element is to be inserted:");
        pos=in.nextInt();
        
        len=length();
        
        if(pos<1 || pos>len)
            System.out.println("Invalid position entered!!!");
        else if(pos==len)
            insertAtRear();
        else
        {
            System.out.print("Enter an element to insert:");
            newNode.data=in.nextInt();
            
            Node temp;
            int i;
            for(temp=first,i=1;i<pos;i++,temp=temp.link);
            
            newNode.link=temp.link;
            temp.link=newNode;
        }
    }
    
    public void deleteAtFront()
    {
        if(first==null)
            System.out.println("Circular singly linked list is empty!!!");
        else if(first==last)
        {
            System.out.print("\nDeleted node contained element:"+first.data);
            first.link=null;
            first=last=null;
        }
        else
        {
            Node temp;
            
            temp=first;
            first=first.link;
            last.link=first;
            System.out.print("\nDeleted node contained element:"+temp.data);
            temp.link=null;
            temp=null;
        }
    }
    
    public void deleteAtRear()
    {
        if(first==null)
            System.out.println("Circular singly linked list is empty!!!");
        else if(first==last)
        {
            System.out.println("\nDeleted node contained:"+first.data);
            first.link=null;
            first=last=null;
        }
        else
        {
            Node temp1;
            
            for(temp1=first.link;temp1.link!=last;temp1=temp1.link);
                             
            last=temp1;
            temp1=temp1.link;
            last.link=first;
            System.out.println("\nDeleted node contained:"+temp1.data);
            temp1.link=null;
            temp1=null;
        }
    }
    
    public void deleteAtPos()
    {
        if(first==null)
            System.out.println("Circular singly linked list is empty!!!");
        else
        {
            Node temp1,temp2;
            int pos,len;
            
            System.out.print("\nEnter the position of the element to be deleted:");
            pos=in.nextInt();
            
            len=length();
            
            if(pos<1 || pos>len)
                System.out.println("\nInvalid position entered!!!");
            else if(pos==1)
            {
                deleteAtFront();
            }
            else if(pos==len)
            {
                deleteAtRear();
            }
            else
            {
                int i;
                for(i=1,temp1=first;i<pos-1;temp1=temp1.link,i++);
                
                temp2=temp1.link;
                temp1.link=temp2.link;
                System.out.println("\nDeleted node contained element:"+temp2.data);
                temp2.link=null;
            }
        }
    }
    
    public void display()
    {
        if(first==null)
            System.out.println("\nCircular singly linked list is empty!!!");
        else
        {
            Node temp;
            int i;
            
            System.out.println("\nContents of circular singly linked list are:");
            temp=first;
            do
            {
                System.out.print(temp.data+" ");
                temp=temp.link;
            }while(temp!=first);
            
            System.out.println();
        }
    }
}