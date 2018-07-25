import java.util.ArrayList;
/*
 * @author Dylan Poole
 */
public class Tree {
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
	public ArrayList<Node> getTreeList()
	{
		return treeList;
	}
	public void appendTreeList(ArrayList<Node> newItems)
	{
		for(int x =0; x < newItems.size(); x++)
		{
			treeList.add(newItems.get(x));
		}
	}
	int Weight;
	Node Parent, Child1, Child2;
	ArrayList<Node> treeList = new ArrayList<Node>();
}