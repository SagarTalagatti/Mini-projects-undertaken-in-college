package datastructurepackage;

public class QueueFullException extends Exception
{
    private String msg;
    
    public QueueFullException(String msg)
    {
        this.msg=msg;
    }
    
    public String getMessage()
    {
        return msg;
    }
}
