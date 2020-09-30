package datastructurepackage;

import java.util.Scanner;

public class DataStructurePackage 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);     
        int ch1,ch2;
        ILinkedList i;
        
        System.out.println("\nData Structures Package:");
        System.out.println("1)Singly Linked List");
        System.out.println("2)Doubly Linked List");
        System.out.println("3)Circular Singly Linked List");
        System.out.println("4)Circular Doubly Linked List");
        System.out.println("5)Stack using linked list");
        System.out.println("6)Queue using linked list");
        System.out.println("7)Stack using array");
        System.out.println("8)Queue using array");
        System.out.println("9)Circular queue using array");
        System.out.println("10)Binary search tree");
        System.out.print("Enter your choice:");
        ch1=in.nextInt();
        
        switch(ch1)
        {
            case 1:
            i=new SinglyLinkedList();
            do
            {
                System.out.println("\nSingly linked list operations:");
                System.out.println("1)Insert a node at front");
                System.out.println("2)Insert a node at rear");
                System.out.println("3)Insert a node after particular position");
                System.out.println("4)Delete the node at the front");
                System.out.println("5)Delete the node at the rear");
                System.out.println("6)Delete a node at a particular position");
                System.out.println("7)Display");
                System.out.println("8)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();

                switch(ch2)
                {
                    case 1:i.insertAtFront();
                           break;

                    case 2:i.insertAtRear();
                           break;

                    case 3:i.insertAfterPos();
                           break;

                    case 4:i.deleteAtFront();
                           break;

                    case 5:i.deleteAtRear();
                           break;

                    case 6:i.deleteAtPos();
                           break;
                           
                    case 7:i.display();
                           break;
                           
                    case 8:break;

                    default:System.out.println("Invalid choice!!!");
                }
            }while(ch2!=8);
            break;
            
            case 2:
            i=new DoublyLinkedList();
            do
            {
                System.out.println("\nDoubly linked list operations:");
                System.out.println("1)Insert a node at front");
                System.out.println("2)Insert a node at rear");
                System.out.println("3)Insert a node after particular position");
                System.out.println("4)Delete the node at the front");
                System.out.println("5)Delete the node at the rear");
                System.out.println("6)Delete a node at a particular position");
                System.out.println("7)Display");
                System.out.println("8)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();

                switch(ch2)
                {
                    case 1:i.insertAtFront();
                           break;

                    case 2:i.insertAtRear();
                           break;

                    case 3:i.insertAfterPos();
                           break;

                    case 4:i.deleteAtFront();
                           break;

                    case 5:i.deleteAtRear();
                           break;

                    case 6:i.deleteAtPos();
                           break;
                           
                    case 7:i.display();
                           break;
                           
                    case 8:break;

                    default:System.out.println("Invalid choice!!!");
                }
            }while(ch2!=8);    
            break;
        
            case 3:
            i=new CircularSinglyLinkedList();
            do
            {
                System.out.println("\nCircular singly linked list operations:");
                System.out.println("1)Insert a node at front");
                System.out.println("2)Insert a node at rear");
                System.out.println("3)Insert a node after particular position");
                System.out.println("4)Delete the node at the front");
                System.out.println("5)Delete the node at the rear");
                System.out.println("6)Delete a node at a particular position");
                System.out.println("7)Display");
                System.out.println("8)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();

                switch(ch2)
                {
                    case 1:i.insertAtFront();
                           break;

                    case 2:i.insertAtRear();
                           break;

                    case 3:i.insertAfterPos();
                           break;

                    case 4:i.deleteAtFront();
                           break;

                    case 5:i.deleteAtRear();
                           break;

                    case 6:i.deleteAtPos();
                           break;
                           
                    case 7:i.display();
                           break;
                           
                    case 8:break;

                    default:System.out.println("Invalid choice!!!");
                }
            }while(ch2!=8);
            break;
            
            case 4:
            i=new CircularDoublyLinkedList();
            do
            {
                System.out.println("\nCircular doubly linked list operations:");
                System.out.println("1)Insert a node at front");
                System.out.println("2)Insert a node at rear");
                System.out.println("3)Insert a node after particular position");
                System.out.println("4)Delete the node at the front");
                System.out.println("5)Delete the node at the rear");
                System.out.println("6)Delete a node at a particular position");
                System.out.println("7)Display");
                System.out.println("8)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();

                switch(ch2)
                {
                    case 1:i.insertAtFront();
                           break;

                    case 2:i.insertAtRear();
                           break;

                    case 3:i.insertAfterPos();
                           break;

                    case 4:i.deleteAtFront();
                           break;

                    case 5:i.deleteAtRear();
                           break;

                    case 6:i.deleteAtPos();
                           break;
                           
                    case 7:i.display();
                           break;
                           
                    case 8:break;

                    default:System.out.println("Invalid choice!!!");
                }
            }while(ch2!=8);
            break;
            
            case 5:
            LinkedStack ls=new LinkedStack();
            int topele;
            do
            {
                System.out.println("\nLinked stack operations:");
                System.out.println("1)Push");
                System.out.println("2)Pop");
                System.out.println("3)Display");
                System.out.println("4)Peek");
                System.out.println("5)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();
                
                switch(ch2)
                {
                    case 1:
                    System.out.print("\nEnter an element to push:");
                    ls.push(in.nextInt());
                    break;
                    
                    case 2:
                    try
                    {
                        ls.pop();
                    }
                    catch(StackEmptyException e){System.out.println(e.getMessage());}
                    break;
                    
                    case 3:
                    ls.display();
                    break;
                    
                    case 4:
                    topele=ls.peek();
                    if(topele!=-1)
                        System.out.println("\nThe element on the top of the stack is "+topele);
                    else
                        System.out.println("\nStack is empty!!!");
                    break;
                    
                    case 5:
                    break;
                    
                    default:
                        System.out.println("\nInvalid choice!!!");
                }                   
            }while(ch2!=5);
            break;
            
            case 6:
            LinkedQueue lq=new LinkedQueue();
            do
            {
                System.out.println("\nLinked queue operations:");
                System.out.println("1)Insert");
                System.out.println("2)Delete");
                System.out.println("3)Display");
                System.out.println("4)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();
                
                switch(ch2)
                {
                    case 1:
                    System.out.print("\nEnter an element to insert:");
                    lq.insert(in.nextInt());
                    break;
                          
                    case 2:
                    try
                    {
                        lq.delete();
                    }
                    catch(QueueEmptyException e){System.out.println(e.getMessage());}
                    break;
                    
                    case 3:
                    lq.display();
                    break;
                    
                    case 4:
                    break;
                    
                    default:
                    System.out.println("\nInvalid choice!!!");
                }
            }while(ch2!=4);
            break;
            
            case 7:            
            int pele,ssize;
            System.out.print("\nEnter the size of the stack:");
            ssize=in.nextInt();
            Stack s=new Stack(ssize);
            do
            {
                System.out.println("\nStack operations:");
                System.out.println("1)Push");
                System.out.println("2)Pop");
                System.out.println("3)Display");
                System.out.println("4)Peek");
                System.out.println("5)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();
                
                switch(ch2)
                {
                    case 1:
                    try
                    {
                        System.out.print("\nEnter an element to push:");
                        s.push(in.nextInt());
                    }
                    catch(StackFullException e){System.out.println(e.getMessage());}
                    break;
                    
                    case 2:
                    try
                    {
                        s.pop();
                    }
                    catch(StackEmptyException e){System.out.println(e.getMessage());}
                    break;
                    
                    case 3:
                    s.display();
                    break;
                    
                    case 4:
                    pele=s.peek();
                    if(pele!=-1)
                        System.out.println("\nThe element on the top of the stack is "+pele);
                    else
                        System.out.println("\nStack is empty!!!");
                    break;
                    
                    case 5:
                    break;
                    
                    default:
                        System.out.println("\nInvalid choice!!!");
                }                   
            }while(ch2!=5);
            break;
            
            case 8:
            int qsize;
            System.out.print("\nEnter the size of the queue:");
            qsize=in.nextInt();
            Queue q=new Queue(qsize);
            do
            {
                System.out.println("\nQueue operations:");
                System.out.println("1)Insert");
                System.out.println("2)Delete");
                System.out.println("3)Display");
                System.out.println("4)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();
                
                switch(ch2)
                {
                    case 1:
                    try
                    {
                        System.out.print("\nEnter an element to insert:");
                        q.insert(in.nextInt());
                    }
                    catch(QueueFullException e){System.out.println(e.getMessage());}
                    break;
                          
                    case 2:
                    try
                    {
                        q.delete();
                    }
                    catch(QueueEmptyException e){System.out.println(e.getMessage());}
                    break;
                    
                    case 3:
                    q.display();
                    break;
                    
                    case 4:
                    break;
                    
                    default:
                    System.out.println("\nInvalid choice!!!");
                }
            }while(ch2!=4);
            break;
            
            case 9:
            int cqsize;
            System.out.print("\nEnter the size of the circular queue:");
            cqsize=in.nextInt();
            CircularQueue cq=new CircularQueue(cqsize);
            do
            {
                System.out.println("\nCircular Queue operations:");
                System.out.println("1)Insert");
                System.out.println("2)Delete");
                System.out.println("3)Display");
                System.out.println("4)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();
                
                switch(ch2)
                {
                    case 1:
                    try
                    {
                        System.out.print("\nEnter an element to insert:");
                        cq.insert(in.nextInt());
                    }
                    catch(QueueFullException e){System.out.println(e.getMessage());}
                    break;
                          
                    case 2:
                    try
                    {
                        cq.delete();
                    }
                    catch(QueueEmptyException e){System.out.println(e.getMessage());}
                    break;
                    
                    case 3:
                    cq.display();
                    break;
                    
                    case 4:
                    break;
                    
                    default:
                    System.out.println("\nInvalid choice!!!");
                }
            }while(ch2!=4);
            break;
            
            case 10:
            System.out.println("\nBinary Tree Implementation\n");
            BinarySearchTree B = new BinarySearchTree();
            int Max;
            for (; ; )
            {
                System.out.println("Menu\n1.Insert\n2.search\n3.recInsert");
                int ch;
                ch = in.nextInt();
                switch (ch)
                {
                    case 1:
                    System.out.println("Enter the Number of elements to be inserted\n ");
                    Max = in.nextInt();
                    System.out.println("Enter the elements\n");
                    for (int k = 0; k < Max; k++) 
                    {
                        B.insert(in.nextInt());
                    }
                    break;
                    
                    case 2:
                    System.out.println("Enter the element to be searched\n");
                    B.Search(B.root, in.nextInt());break;
               
                    case 3:
                    System.out.println("Enter the additional element U would like to insert\n1");
                    B.recInsert(B.root,in.nextInt());
                    break;
                    
                    default:
                    System.out.println("Invalid Input\n");    
                }
            }    
            
            default:System.out.println("\nInvalid choice!!!");
        }
    }
}   