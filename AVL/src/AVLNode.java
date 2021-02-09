//AVL Node initialization

public class AVLNode {
	
	AVLNode leftPath, rightPath;
	String key;
	books value;
	int height;
	
	public AVLNode(String isbn, books book) {
		
		leftPath = null;
		rightPath = null;
		key = isbn;
		value = book;
		height = 0;
		}
}