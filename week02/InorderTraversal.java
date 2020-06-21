import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        }
}
class InorderTraversal{
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer>list = new ArrayList<>();
        midAgent(root,list);
        return list;
    }
    
    public List midAgent(TreeNode root, List < Integer > res){
        if (root != null) {
            if (root.left != null) {
                midAgent(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                midAgent(root.right, res);
            }
        }
        return res;
    }
}

    /*public static void main(String args[]){
        int input[1,null,2,3];
        InorderTraversal obj = new InorderTraversal();
        //obj.inorderTraversal(1);

    }*/
        
        
