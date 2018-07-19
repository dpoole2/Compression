import java.util.ArrayList;
import java.util.Map;


public class Tree {
/*
 * Tree will also contain a list of trees that will be useful later
 */
	public Tree(Node parent, Node child1, Node child2, int weight)
		{
			Parent = parent;
			Child1 = child1;
			Child2 = child2;
			Weight = weight;
		}
	//This will take the chart from the class Chart to create a list of Trees
	public Node getParent()
	{
		return Parent;
	}
	public Node getChild1()
	{
		return Child1;
	}
	public Node getChild2()
	{
		return Child2;
	}
	public int getWeight()
	{
		return Weight;
	}
	int Weight;
	Node Parent, Child1, Child2;
	ArrayList<Tree> treeList;
}
