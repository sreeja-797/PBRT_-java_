import java.util.*;
public class levelorder {
     public static void main(String [] args)
    {
        tree root =new tree('a');
        root.left=new tree('b');
        root.right=new tree('c');
        root.left.right =new tree('d');
        root.left.right.left=new tree('e');
        root.left.right.right=new tree('f');
        order(root);
    }
    
    static void order(tree root)
    {
        if(root==null)
        {
            return;
        }
         Queue <tree> q=new LinkedList<>();
         q.add(root);
         while (!q.isEmpty())
         {
             tree temp=q.remove();
             System.out.println(temp.data);
             if(temp.left!=null)
             {
                 q.add(temp.left);
             }
             if(temp.right!=null)
             {
                 q.add(temp.right);
             }
             
         }
        System.out.println(root.data);
        
    }
}
class tree
{
    char data;
    tree left;
    tree right;
    tree(char data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }

}