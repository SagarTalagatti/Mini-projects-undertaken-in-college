package datastructurepackage;

public interface IQueue 
{
    public void insert(int ele)throws QueueFullException;
    public void delete()throws QueueEmptyException;
    public void display();
}
