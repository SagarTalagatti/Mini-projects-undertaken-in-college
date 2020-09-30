package datastructurepackage;

public class Queue implements IQueue
{
    private int front,rear,size;
    private int items[];
    
    public Queue(int size)
    {
        rear=-1;
        front=0;
        items=new int[size];
    }
    
    public void insert(int ele)throws QueueFullException
    {
        if(rear==items.length-1)
            throw new QueueFullException("\nQueue is full!!!");
        else
            items[++rear]=ele;
    }
    
    public void delete()throws QueueEmptyException
    {
        if(front>rear)
            throw new QueueEmptyException("\nQueue is empty!!!");
        else
            System.out.println("\nThe deleted element is: "+items[front++]);
    }
    
    public void display()
    {
        if(front>rear)
            System.out.println("\nQueue is empty!!!");
        else
        {
            System.out.println("\nContents of queue are:");
            for(int i=front;i<=rear;i++)
                System.out.print(items[i]+" ");                      
        }
    }
}
