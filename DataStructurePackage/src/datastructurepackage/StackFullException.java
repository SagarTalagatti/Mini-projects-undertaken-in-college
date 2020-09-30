package datastructurepackage;

public class StackFullException extends Exception
{
    private String msg;
    
    public StackFullException(String msg)
    {
        this.msg=msg;
    }
    
    public String getMessage()
    {
        return msg;
    }
}
