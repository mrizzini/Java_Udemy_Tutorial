package Tutorial30;

public class App {

	public static void main(String[] args) {

		// POLYMORPHISM
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		// if you have a child class, you can always use the child class in any place you would normally use the parent
		
		Plant plant2 = tree;
		
		//will use the tree method which over rides the plant method
		// plant2 is pointing to tree
		plant2.grow();
		
		tree.shedLeaves();
		
		// wont work
		// plant2.shedLeaves();
		
		doGrow(tree);
		
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
