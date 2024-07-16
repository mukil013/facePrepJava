package day16;

import java.util.*;

public class TreeProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(" ");
        Tree t = new Tree();
        t.createTree(arr);
        t.inorder(t.root);
        sc.close();
    }
}

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int n) {
        this.data = n;
    }
}

class Tree {

    TreeNode root;

    void preorder(TreeNode cur) {
        if (cur == null) {
            return;
        }
        System.out.println(cur.data + " ");
        preorder(cur.left);
        preorder(cur.right);
    }

    void inorder(TreeNode cur) {
        if (cur == null) {
            return;
        }
        inorder(cur.left);
        System.out.println(cur.data + " ");
        inorder(cur.right);
    }

    void postOrder(TreeNode cur) {
        if (cur == null) {
            return;
        }
        postOrder(cur.left);
        postOrder(cur.right);
        System.out.println(cur.data + " ");
    }

    void levelOrder() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            System.out.println(cur.data + " ");
            if (cur.left == null) {
                q.add(cur.left);
            }
            if (cur.right == null) {
                q.add(cur.right);
            }
        }
    }

    void createTree(String[] arr) {
        if (arr.length == 0 || arr[0].equals("-1")) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i = 1;
        while (i < arr.length && !q.isEmpty()) {
            TreeNode cur = q.poll();
            if (!arr[i].equals("-1")) {
                cur.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.left);
            }
            i++;
            if (i > arr.length) break;
            if (!arr[i].equals("-1"));
            {
                cur.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.right);
            }
            i++;
        }
    }
}
