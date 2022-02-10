package com.github.cookieandcoke;

import java.util.LinkedList;
import java.util.Queue;

public class Q116 {
    public Node connect_bfs(Node root) {
        if(root==null) return null;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int s=q.size();
            Node prev=null;
            for(int i=0; i<s; i++) {
                Node n=q.poll();
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);

                if(i!=0)
                    prev.next=n;
                prev=n;
            }
        }
        return root;
    }

    public Node connect_bfs_O1(Node root) {
        if(root==null) return null;

        Node ptr=root, head=root;
        while(ptr.left != null) {
            ptr.left.next=ptr.right;
            if(ptr.next != null) {
                ptr.right.next=ptr.next.left;
                ptr=ptr.next;
            }
            else {
                ptr=head.left;
                head=head.left;
            }
        }
        return root;
    }

    public Node connect_rec(Node root) {
        if(root==null) return null;
        next(root);
        return root;
    }

    private void next(Node root) {
        if(root==null) return;

        if(root.left!=null && root.right!=null) {
            root.left.next=root.right;
            if(root.next != null) {
                root.right.next=root.next.left;
            }
            next(root.left);
            next(root.right);
        }
    }
}
