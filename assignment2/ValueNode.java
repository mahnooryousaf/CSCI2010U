/**
 * The ValueNode implements all the function of treeNode and
 * creates, prints and evaluates ValueNodes of a expression tree.
 */
package expressionTree;

public class ValueNode  implements  TreeNode{
    public double value;
    
    public ValueNode(int value){
        this.value=value;
    }
  
    public double evaluate(){
        return value;
    }

    public void print(int depth) {
    }

    @Override
    public double get() {
        return value;
    }
    
    
}
