package assignments.assignment4;

import java.util.*;

class Node {
    int val;
    int index;
    Node left;
    Node right;

    Node(int val, int index) {
        this.val = val;
        this.index = index;
        this.left = null;
        this.right = null;
    }
}
public class HuffmanCoding {

    public static void main(String[] args) {
        HuffmanCoding obj = new HuffmanCoding();

        String s = "abcdef";
		int[] freq = {5, 9, 12, 13, 16, 45};

        String[] ans = obj.huffmanCodes(s, freq);

		for (int i = 0; i < ans.length; i++) {
			System.out.println(s.charAt(i) + " " + ans[i]);
		}
    }

    private String[] huffmanCodes(String s, int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>((node1, node2) -> node1.val - node2.val);

        for (int i = 0; i < s.length(); i++) {
            Node node = new Node(freq[i], i);
            pq.offer(node);
        }

        while (pq.size() >= 2) {
            Node l = pq.poll();
            Node r = pq.poll();

            Node node = new Node(l.val + r.val, -1);
            node.left = l;
            node.right = r;

            pq.offer(node);
        }

        String[] ans = new String[s.length()];
        preorder(pq.peek(), "", ans);
        return ans;
    }

    private void preorder(Node root, String coding, String[] ans) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            ans[root.index] = coding;
            return;
        }

        preorder(root.left, coding + "0", ans);
        preorder(root.right, coding + "1", ans);
    }
}
