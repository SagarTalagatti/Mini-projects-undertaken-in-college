package datastructurepackage;

public interface IStack
{
    public void push(int ele)throws StackFullException;
    public void pop()throws StackEmptyException;
    public void display();
    public int peek();
}
