import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main 
{
	
	public static void main(String [] args)
	{
		run();

	}
	public static void run()
	{
		Chart chart = new Chart("go go gophers");
		huffman = chart.buildTable();
		nodeList = chart.getTreeList(huffman);
		childrenNodes = chart.getChildrenList();
		int ctr = nodeList.size();
		//This loop works now add somethings that allow it to go down the tree
		while(nodeList.size() > 1)
		{
			//Grab the lowest two node Trees
			//They have the index of 0 & 1 
			Tree temp1 = nodeList.get(0);
			Tree temp2 = nodeList.get(1);
			//Now use these two trees to create a new tree
			int weight = temp1.getWeight() + temp2.getWeight();
			/*
			 * The new nodes are needed in order to create the Tree
			 * If you want you can combine this all into one line for
			 * I like it like this though.
			 */
			Node child1 = new Node(nodeList.get(0).getParent().getName(), nodeList.get(0).getWeight(), nodeList.get(0).getChild1(), nodeList.get(0).getChild2());
			Node child2 = new Node(nodeList.get(1).getParent().getName(), nodeList.get(1).getWeight(), nodeList.get(1).getChild1(), nodeList.get(1).getChild2());
			Node parent = new Node(Integer.toString(weight), weight, child1, child2);
			Tree newTree = new Tree(parent, child1, child2, weight );
			//Now we must remove the two nodes since we have the next tree		
				nodeList.remove(0);
				nodeList.remove(0);
				int index = getIndex(nodeList, newTree.getWeight());
				nodeList.add(index, newTree);
		}
		System.out.println(nodeList.get(0).getParent().getChild2().getName());
		HuffmanChart c = new HuffmanChart(nodeList, childrenNodes);
		//c.scan();
	}
	public static int getIndex(ArrayList<Tree> list, int weight)
	{
		for(int x =0; x < list.size(); x++)
		{
			if(list.get(x).getWeight() <= weight)
			{
				if(x+1 > nodeList.size() - 1)
				{
					return nodeList.size();
				}
			 	if(list.get(x+1).getWeight() != weight)
			 	{
			 		return x;
			 	}
			}
		}
		return list.size();
	}

	static ArrayList<Tree> nodeList = new ArrayList<Tree>();
	static Map huffman;
	static ArrayList<Node> childrenNodes = new ArrayList<Node>();
}

