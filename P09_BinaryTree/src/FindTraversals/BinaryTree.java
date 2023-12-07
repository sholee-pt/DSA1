package FindTraversals;

class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // 중위 순회, 후위 순회를 알 때, 트리를 구성하고 전위 순위 (NLR) 구하기
    public void constructTreeforNLR(int[] inorder, int[] postorder) {
        int n = inorder.length;
        this.root = buildTreeforNLR(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    private Node buildTreeforNLR(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd)
            return null;

        int rootValue = postorder[postEnd];
        Node root = new Node(rootValue);

        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }

        int leftSubtreeSize = rootIndex - inStart;
        int rightSubtreeSize = inEnd - rootIndex;

        root.left = buildTreeforNLR(inorder, postorder, inStart, rootIndex - 1, postStart, postStart + leftSubtreeSize - 1);
        root.right = buildTreeforNLR(inorder, postorder, rootIndex + 1, inEnd, postStart + leftSubtreeSize, postEnd - 1);

        return root;
    }

    public void preorderTraversal() {
        System.out.print("Preorder Traversal: ");
        preorder(this.root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node == null)
            return;

        System.out.print((char) node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    
    // 중위 순회, 전위 순회를 알 때, 트리를 구성하고 후위 순위 (LRN) 구하기
    public void constructTreeforLRN(int[] inorder, int[] preorder) {
        int n = inorder.length;
        this.root = buildTreeforLRN(inorder, preorder, 0, n - 1, 0, n - 1);
    }

    private Node buildTreeforLRN(int[] inorder, int[] preorder, int inStart, int inEnd, int preStart, int preEnd) {
        if (inStart > inEnd || preStart > preEnd)
            return null;

        int rootValue = preorder[preStart];
        Node root = new Node(rootValue);

        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }

        int leftSubtreeSize = rootIndex - inStart;
        int rightSubtreeSize = inEnd - rootIndex;

        root.left = buildTreeforLRN(inorder, preorder, inStart, rootIndex - 1, preStart + 1, preStart + leftSubtreeSize);
        root.right = buildTreeforLRN(inorder, preorder, rootIndex + 1, inEnd, preStart + leftSubtreeSize + 1, preEnd);

        return root;
    }

    public void postorderTraversal() {
        System.out.print("Postorder Traversal: ");
        postorder(this.root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print((char) node.value + " ");
    }
}