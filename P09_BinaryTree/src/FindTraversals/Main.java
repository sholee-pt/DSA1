package FindTraversals;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        // int[] inorder = {4, 2, 5, 'A', 3};
	        // int[] postorder = {4, 5, 2, 3, 'A'};
		
		    // 연습문제 4.26
		    System.out.print("Find Preorder Traversal: \n");
        	int[] inorder = {'J','E','N','K','O','P','B','F','A','C','L','G','M','D','H','I'};
        	int[] postorder = {'J','N','O','P','K','E','F','B','C','L','M','G','H','I','D','A'};

	        BinaryTree tree = new BinaryTree();
	        tree.constructTreeforNLR(inorder, postorder);
	        tree.preorderTraversal();
	        
	        // 연습문제 4.27
	        System.out.print("\n\nFind Postorder Traversal: \n");
	        int[] inorder1 = {'D','B','E','F','A','G','H','C'};
        	int[] postorder1 = {'A','B','D','E','F','C','G','H'};

	        BinaryTree tree1 = new BinaryTree();
	        tree1.constructTreeforLRN(inorder1, postorder1);
	        tree1.postorderTraversal();
    }
}
