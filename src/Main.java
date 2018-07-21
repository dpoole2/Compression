import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main 
{
	
	public static void main(String[] args)
	{
	Tree huffmanTree = buildTree();
	}
	public static Tree buildTree()
	{
		Chart chart = new Chart("go go gophers");
		huffman = chart.buildTable();
		nodeList = chart.getTreeList(huffman);
		childrenNodes = chart.getChildrenList();
		int ctr = nodeList.size();
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
				System.out.println(tree.getParent().getName());
			}
		}
		return nodeList.get(0);
	}
	public static Tree createNewTree()
	{
		
		//NODE(Value, weight, child1, child2)
		//TREE(Parent, child1, child2, weight)
		Tree temp1 = nodeList.get(0);
		Tree temp2 = nodeList.get(1);
		int weight = temp1.getWeight() + temp2.getWeight();
		Node child1 = new Node(nodeList.get(0).getParent().getName(), nodeList.get(0).getWeight(), nodeList.get(0).getChild1(), nodeList.get(0).getChild2());
		Node child2 = new Node(nodeList.get(1).getParent().getName(), nodeList.get(1).getWeight(), nodeList.get(1).getChild1(), nodeList.get(1).getChild2());
		Node parent = new Node(Integer.toString(weight), weight, child1, child2);
		Tree newTree = new Tree(parent, child1, child2, weight );
		return newTree;
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
	static Map huffman;
	static ArrayList<Node> childrenNodes = new ArrayList<Node>();
}

