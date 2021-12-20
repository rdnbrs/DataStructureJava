package com.rdnbrs.question.tree;

public class InsertionBinaryTree {
	
	public static class Node {
		int data;
		Node left;
		Node right;
	}
	
	public static Node insert(Node root,int data) {
        if(root==null)
        {
            Node node=new Node();
            node.data=data;
            node.left=null;
            node.right=null;
            root=node;
        }else{
            if(root.data < data){
                insert(root.right, data);
            }else{
                insert(root.left, data);
            }  
        }    	        
        return root;        
    }

	public static void main(String[] args) {
		
	}	
}
