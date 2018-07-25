import java.util.ArrayList;
import java.util.Map;
/*
 * @author Dylan Poole
 * Refer to README for class description
 */
public class Main 
{
	public static void main(String[] args)
	{
	Tree huffmanTree = buildTree();
	//Uncomment this to see paths
	printPaths(huffmanTree);
	}
	public static void printPaths(Tree print)
	{
		ArrayList<Node> list = print.getTreeList();
		for(int x = 0; x < list.size(); x++)
		{
			System.out.println("The path for " + list.get(x).getName() +" is "+list.get(x).getPath());
		}
	}
	public static Tree buildTree()
	{
		Chart chart = new Chart("Hello World");
		huffman = chart.buildTable();
		nodeList = chart.getTreeList(huffman);
		childrenNodes = chart.getChildrenList();
		//This loop works now add something that allow it to go down the tree
		while(nodeList.size() > 1)
		{
		//Grab the lowest two nodes
			Tree tree = createNewTree();
			nodeList.remove(0);
			nodeList.remove(0);
			try {
			int index = getIndex(nodeList, tree.getWeight());
			nodeList.add(index, tree);
			} catch(Exception IndexOutOfBoundsException){
				//This is just to skip out on this
			}
		}
		//The final Tree
		return nodeList.get(0);
	}
	public static Tree createNewTree()
	{
		//References to Node and Tree
		//NODE(Value, weight, child1, child2)
		//TREE(Parent, child1, child2, weight)
		Tree temp1 = nodeList.get(0);
		Tree temp2 = nodeList.get(1);
		ArrayList<Node> tempList = new ArrayList<Node>();
		for(int x =0; x < temp1.getTreeList().size(); x++)
		{
		 Node temp = (Node) temp1.getTreeList().get(x);
		 tempList.add(temp);
		}
		for(int x =0; x < temp2.getTreeList().size(); x++)
		{
		 Node temp = (Node) temp2.getTreeList().get(x);
		 tempList.add(temp);
		}
		appendAllPaths(temp1, "0");
		appendAllPaths(temp2, "1");
		int parentWeight = temp1.getWeight() + temp2.getWeight();
		Node parent = new Node(Integer.toString(parentWeight), parentWeight, temp1.getParent(), temp2.getParent());
		Tree newTree = new Tree(parent, temp1.getParent(), temp2.getParent(), parentWeight);
		//Append paths here
		newTree.appendTreeList(tempList);
		//And list
		return newTree;
	}
	public static void appendAllPaths(Tree target, String path)
	{
		//This loop is going to update all paths
		for(int x = 0; x < target.getTreeList().size(); x++)
		{
			Node tempNode = (Node) target.getTreeList().get(x);
			tempNode.appendPath(path);
		}
	}
	public static int getIndex(ArrayList<Tree> list, int weight)
	{
		for(int x = 0; x < list.size(); x++)
		{
			if(list.get(x).getWeight() >= weight)
			{
				return x;
			}
		}
		return list.size();
	}
	static ArrayList<Tree> nodeList = new ArrayList<Tree>();
	static Map<Character, Integer> huffman;
	static ArrayList<Node> childrenNodes = new ArrayList<Node>();
}