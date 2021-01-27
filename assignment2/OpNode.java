/**
 * Purpose: this class implements all the functions of tree node. 
 * This class is responsible for running the correct operations for the TreeNode.
 */

package expressionTree;

public class OpNode  implements  TreeNode{
    int x, y;
    public TreeNode left=new ValueNode(0);
    public TreeNode right=new ValueNode(0);
    public String operation;
    public String operation1;
    public TreeNode left1=new ValueNode(0);
    public TreeNode right1=new ValueNode(0);
    public OpNode(ValueNode left, String operation, ValueNode right){
        this.left=new ValueNode((int) left.value);
        print((int) left.value);
        this.right=new ValueNode((int) right.value);
        print((int) right.value);
        this.operation=operation;
        
    }
    public OpNode(ValueNode left,String operation, OpNode right){
        this.left=left;
        this.operation=operation;
        
        if(right.operation=="*"){
            this.right=new ValueNode((int) (right.left.get()*right.right.get()));
        }
        else if(right.operation=="-"){
            this.right=new ValueNode((int) (right.left.get()*right.right.get()));
        }
        else if(right.operation=="+"){
            this.right=new ValueNode((int) (right.left.get()*right.right.get()));
        }
        else if(right.operation=="/"){
            this.right=new ValueNode((int) (right.left.get()*right.right.get()));
        }
    }
    public OpNode(OpNode left,String operation, OpNode right){
        this.left=left;
        this.right=right;
        this.operation1=operation;
        
    }
    //To handle exceptions.
    public OpNode(int tt) {
        tt=0;
    }
    
    //Evaluating according to the operations. 
    public double evaluate(){
        double xx=0;
        if(operation=="*")
        {
            xx=left.get()*right.get();
        }
        else if(operation=="-"){
            xx=left.get()-right.get();
        }
        else if(operation=="+"){
            xx=left.get()+right.get();
        }
        else if(operation=="/"){
            xx=left.get()/right.get();
        }
        
        if(operation1=="*"){
            xx=left.evaluate()*right.evaluate();
        }
        else if(operation1=="-"){
            xx=left.evaluate()-right.evaluate();
        }
        else if(operation1=="+"){
            xx=left.evaluate()+right.evaluate();
        }
        else if(operation1=="/"){
            xx=left.evaluate()/right.evaluate();
        }
        return xx;
    }

    //To print the values of the tree
    public void print(int depth) {
    }

    @Override
    
    public double get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
