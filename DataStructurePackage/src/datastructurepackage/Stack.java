package datastructurepackage;

public class Stack implements IStack
{
    private int[] items;
    private int top;
    
    public Stack(int size)
    {
        top=-1;
        items=new int[size];
    }
    
    public void push(int ele)throws StackFullException
    {
        if(top==items.length-1)
            throw new StackFullException("\nStack is full!!!");
        else
            items[++top]=ele;
    }
    
    public void pop()throws StackEmptyException
    {
        if(top==-1)
            throw new StackEmptyException("\nStack is empty!!!");
        else
            System.out.println("\nPopped element is: "+items[top--]);
    }
    
    public void display()
    {
        if(top==-1)
            System.out.println("\nStack is empty!!!");
        else
        {
            System.out.println("\nContents of stack are:");
            System.out.print("top->");
            for(int i=top;i>=0;i--)
            {
                System.out.println(items[i]);
                System.out.print("     ");
            }   
        }
    }
    
    public int peek()
    {
        if(top==-1)
            return -1;
        else
            return items[top];
    }
}