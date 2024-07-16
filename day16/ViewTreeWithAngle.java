import java.util.*;

public class ViewTreeWithAngle {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        in.close();
        tree.createTree(arr);
        List<Integer> list = new ArrayList<>();
        tree.rightView(tree.root, list, 0);
        for (int i = 0; i < list.size(); i++) System.out.print(
            list.get(i) + " "
        );
    }
}

class TreeNode {

    int data;
    TreeNode right;
    TreeNode left;

    TreeNode(int data) {
        this.data = data;
    }
}

class Tree {

    TreeNode root;

    void rightView(TreeNode root, List<Integer> list, int level) {
        if (root == null) return;
        if (level == list.size()) list.add(root.data);
        rightView(root.right, list, level + 1);
        rightView(root.left, list, level + 1);
    }

    void createTree(String[] arr) {
        if (arr.length == 0 || arr[0].equals("N")) return;
        Queue<TreeNode> q = new LinkedList<>();
        root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i = 1;
        while (i < arr.length && !q.isEmpty()) {
            TreeNode cur = q.poll();
            if (!arr[i].equals("N")) {
                cur.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.left);
            }
            i++;
            if (i >= arr.length) break;
            if (!arr[i].equals("N")) {
                cur.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.right);
            }
            i++;
        }
    }
}
