package nk.dsa.binaryTree;

import java.io.*;

// Java program for Inserting a node
class GFG {

    // Given Node
    static class node {
        int key;
        node left, right;
    }



    // Function to create a new BST node
    static node newNode(int item) {
        node temp = new node();
        temp.key = item;
        temp.left = temp.right = null;
        return temp;
    }

    // Function to insert a new node with
    // given key in BST
    static node insert(node node, int key) {
        // If the tree is empty, return a new node
        if (node == null)
            return newNode(key);

        // Otherwise, recur down the tree
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }

        // Return the node
        return node;
    }

    // Function to do inorder traversal of BST
    static void inorder(node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(" " + root.key);
            inorder(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args) {

		/* Let us create following BST
				50
			/	 \
			30	 70
		/ \ / \
		20 40 60 80
	*/
         /* Let us create following BST
                50
             /     \
            30      70
           /  \    /  \
         20   40  60   80
     */
        node root = null;

        root = insert(root, 50);

        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);
        inorder(root);
    }
}
// This code is contributed by abhijitjadhav1998
