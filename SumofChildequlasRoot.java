import java.util.*;

class GFG {
    GFG(int data){
        this.data = data;
        this.l = null;
        this.r= null;
    }
    int data;
	GFG l;
	GFG r;
	public static boolean postOrder(GFG root){
	   if(root == null)
	        return false;
	   else if( (root.l == null ? 0 : root.l.data) + (root.r == null ? 0 : root.r.data) == root.data)
	       return true;
	   else if( postOrder(root.l) | postOrder(root.r) )
	       return true;
	    return false;
	   
	}
	public static void main (String[] args) {
	   GFG root = new GFG(11);
	   root.l = new GFG(6);
	   root.r = new GFG(4);
	   root.l.r = new GFG(3);
	   System.out.println(postOrder(root));
	 //  System.out.println("inorder:"+root.l.data+" ->"+root.r.data+" ->"+root.data);
	}
}
