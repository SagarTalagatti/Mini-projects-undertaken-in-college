package datastructurepackage;

public class QueueEmptyException extends Exception
{
    private String msg;
    
    public QueueEmptyException(String msg)
    {
        this.msg=msg;
    }
    
    public String getMessage()
    {
        return msg;
    }
}
