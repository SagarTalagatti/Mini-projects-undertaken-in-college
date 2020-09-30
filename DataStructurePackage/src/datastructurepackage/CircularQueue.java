package datastructurepackage;

public class CircularQueue implements IQueue
{
    int items[];
    int front,rear,count;
    
    public CircularQueue(int size)
    {
        items=new int[size];
        front=0;
        rear=-1;
        count=0;
    }
    
    public void insert(int ele)throws QueueFullException
    {
        if(count==items.length)
            throw new QueueFullException("\nCircular queue is full!!!");
        else
        {
            rear=(rear+1)%items.length;
            items[rear]=ele;
            count++;           
        }
    }
    
    public void delete()throws QueueEmptyException
    {
        if(count==0)
            throw new QueueEmptyException("\nCircular queue is empty!!!");
        else
        {
            System.out.println("\nThe deleted element is: "+items[front]);
            front=(front+1)%items.length;
            count--;
        }
    }
    
    public void display()
    {
        if(count==0)
            System.out.println("\nCircular queue is empty!!!");
        else
        {
            System.out.println("\nContents of circular queue are:");
            for(int i=front,j=1;j<=count;i=(i+1)%items.length,j++)
                 System.out.print(items[i]+" ");     
        }
    }
}
