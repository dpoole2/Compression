//import java.awt.List;
//import java.util.ArrayList;
//import java.util.Map;
//
///*
// * This will contain the list of all 
// * Nodes that we will manage
// * This class also sets up the coding tree using the main algorthim
// */
//public class NodeTree {
//	public NodeTree(Chart c, Map t)
//	{
//		chart = c;
//		table = t;
//	}
//	//Call this method if there are 2 or more items left in the list
//	public void createBranch()
//	{
//		//this loop will take the lowest two items from the chart
//		int parentWeight = 0;
//		for(int x =0; x < 2; x++)
//		{
//			//This returns the key
//			int weight = table.get(Chart.getLowestLeaf(table));
//			//Now make this a node
//			Node node = new Node(Character.toString(chart.getLowestLeaf(table)), weight, null, null);
//			parentWeight += weight;
//			nodeTree.add(node);
//			//Now remove the lowest from the table
//			table.remove(Chart.getLowestLeaf(table));
//		}
//		//We need to add a parent node to this new branch
//		//This sets the nodes to have parents
//		nodeTree.get(nodeTree.size()-2).setParent(Integer.toString(parentWeight));
//		nodeTree.get(nodeTree.size()-1).setParent(Integer.toString(parentWeight));
//		Node node = new Node(Integer.toString(parentWeight), parentWeight, null, null);
//		nodeTree.add(node);
//	}
//	public void connectParents()
//	{
//		int tempIndex = -1;
//		for(int x =0; x < nodeTree.size(); x++)
//		{
//			//maybe create an index shortcut later
//			if(nodeTree.get(x).getParent() == "")
//			{
//				if(tempIndex == -1)
//				{
//					tempIndex = x;
//				}
//				else{
//					Node node = new Node(Integer.toString(nodeTree.get(x).getWeight() + nodeTree.get(tempIndex).getWeight()),nodeTree.get(x).getWeight() + nodeTree.get(tempIndex).getWeight(), null, null );
//				}
//			}
//		}
//	}
//	public void addNode()
//	{
//		//This returns the key
//		int weight = table.get(Chart.getLowestLeaf(table));
//		//Now make this a node
//		Node node = new Node(Character.toString(chart.getLowestLeaf(table)), weight, null, null);
//		nodeTree.add(node);
//		//Now remove the lowest from the table
//		table.remove(Chart.getLowestLeaf(table));
//	}
//	//this method will check to see if the list of table is empty
//	public int getCurrentParent()
//	{
//		return currentParent;
//	}
//	public ArrayList<Node> getNodeTree()
//	{
//		return nodeTree;
//	}
//ArrayList<Node> nodeTree = new ArrayList<Node>();
//Map<Character, Integer> table;
//int currentParent;
//Chart chart;
//}
