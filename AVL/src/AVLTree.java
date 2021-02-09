//AVL Tree initialization

public class AVLTree {
	private AVLNode root;
	
	public AVLTree() {		
		root = null;
	}
	
	//--------
	public void insert(String isbn, books book) {		
		root = insert(isbn, book, root);
	}
	
	//--------	
	private int height(AVLNode t) {		
		if (t == null) {			
			return -1;
		}
		else {
			return t.height;
		}
	}
	
	//--------
	private int max(int left, int right) {		
		if (left > right) {		
			return left;
		}
		else {		
			return right;
		}
	}
	
	//--------
	private int compare(String a, String b) {
		
		for( int i=0; i<a.length(); i++) {
			
			if(a.charAt(i) != '-') {			
				if(a.charAt(i) > b.charAt(i)) {				
					return 1;
				}
				else if(b.charAt(i) > a.charAt(i)) {				
					return 0;
				}
			}
		}
		return 0;
	}
	
	//--------
	private AVLNode insert(String isbn, books book, AVLNode top) {
		
		if (top == null) {		
			top = new AVLNode(isbn, book);
		}
		else if (compare(top.key, isbn) == 1) {
			
			top.leftPath = insert(isbn, book, top.leftPath);
			if (height(top.leftPath) - height(top.rightPath) == 2) {
				System.out.print("Imbalance occurred at inserting ISBN " + isbn);
				
				if (compare(top.leftPath.key, isbn) == 1) {
					System.out.println("; fixed in left Rotation");
					top = rotateLchild(top );
				}
				else {
					System.out.println("; fixed in RightLeft Rotation");
					top = doubleWithLeftChild(top);
				}
			}
		}
		else if (compare(top.key, isbn) == 0) {
			top.rightPath = insert(isbn, book, top.rightPath);
			
			if (height(top.rightPath) - height(top.leftPath) == 2) {
				System.out.print("Imbalance occurred at inserting ISBN " + isbn);
				
				if (compare(top.rightPath.key, isbn) == 0) {
					System.out.println("; fixed in Right Rotation");
					top = rotateRchild(top);
				}
				else {
					System.out.println("; fixed in LeftRight Rotation");
					top = doubleWithRightChild(top);
				}
			}
		}
		
		top.height = max(height(top.leftPath), height(top.rightPath)) + 1;
		return top;
		}
	
	//--------
	private AVLNode rotateLchild(AVLNode node2) {
		
		AVLNode node1 = node2.leftPath;
		node2.leftPath = node1.rightPath;
		node1.rightPath = node2;
		node2.height = max(height(node2.leftPath), height(node2.rightPath)) + 1;
		node1.height = max(height(node1.leftPath), node2.height) + 1;
		return node1;
	}

	//--------
	private AVLNode rotateRchild(AVLNode node1) {
		
		AVLNode node2 = node1.rightPath;
		node1.rightPath = node2.leftPath;
		node2.leftPath = node1;
		node1.height = max(height(node1.leftPath), height(node1.rightPath)) + 1;
		node2.height = max(height(node2.rightPath), node1.height) + 1;
		return node2;
	}

	//--------
	private AVLNode doubleWithLeftChild(AVLNode node3) {
		
		node3.leftPath = rotateRchild(node3.leftPath);
		return rotateLchild(node3);
	}

	//--------
	private AVLNode doubleWithRightChild(AVLNode node1) {
		
		node1.rightPath = rotateLchild(node1.rightPath);
		return rotateRchild(node1);
	}

	//--------
	public void order() {
		order(root);
	}

	//--------
	private void order(AVLNode r) {
		if (r != null) {
			order(r.leftPath);
		System.out.print(r.key + " ");
		
		order(r.rightPath);
		}
	}
}