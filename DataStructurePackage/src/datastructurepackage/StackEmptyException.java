package datastructurepackage;

public class StackEmptyException extends Exception
{
    private String msg;
    
    public StackEmptyException(String msg)
    {
        this.msg=msg;
    }            
    
    public String getMessage()
    {
        return msg;
    }
}
