//AVL reader
import java.io.*;
public class AVLread {
	
	public static void main(String[] args) throws IOException {
		
		//reads books.txt -------> initialize in tree
		BufferedReader reader = new BufferedReader(new FileReader("books.txt"));
		AVLTree tree = new AVLTree();
		String read;
		
		//AVL buffer
		while ((read = reader.readLine()) != null) {
			
			String values[] = read.split(" ");
			books book = new books(values[1],values[2]); 
			tree.insert(values[0], book);
		}
		
		reader.close();
		System.out.println("\nIn order traversal: ");
		tree.order();
  }
}