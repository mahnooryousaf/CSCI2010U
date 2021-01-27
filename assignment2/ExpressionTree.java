/**
 * This is the expression tree class in which all the opNodes are places to compute
 */

package expressionTree;

public class ExpressionTree {
    TreeNode t=new OpNode(0);
    
    public ExpressionTree(OpNode bigExpression){
        t=bigExpression;
        
    }
    public double evaluate(){
        return t.evaluate();
    }
    public void print(){
      
    }
}
