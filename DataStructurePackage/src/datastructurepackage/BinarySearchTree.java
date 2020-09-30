package datastructurepackage;

public class BinarySearchTree 
{
    class Node
    {
        int data;
        Node left,right;
        
        public Node(int item)
        {
            data=item;
            left=right=null;
        }
    }
    
    Node root;
    public BinarySearchTree()
    {
        root =null;
    }
        
    Node Search(Node root,int data)
    {
        if(root==null)
        {
            System.out.println("not founD!!!");
            return null;
        }
        if(root.data==data)
        {
            System.out.println("found At:"+root+"\n");
            return root;
        }
        if(root.data<data)
        {
            return Search(root.right,data);
        }
        else
            return Search(root.left,data);
    }
        
    void insert(int data)
    {
        root=recInsert(root,data);
    }
        
    Node recInsert(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<=root.data)
            root.left=recInsert(root.left,data);
        else
            root.right=recInsert(root.right,data);
        
        return root;
    }
}