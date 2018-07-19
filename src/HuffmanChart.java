import java.util.ArrayList;


public class HuffmanChart {
	public HuffmanChart(ArrayList<Tree> NodeList, ArrayList<Node> ChildrenNodes)
	{
		nodeList = NodeList;
		childrenNodes = ChildrenNodes;
	}
	//First
	public void scan()
	{
		Node currentOne = nodeList.get(0).getParent().getChild1();
		Node currentTwo = nodeList.get(0).getChild2();
		System.out.println(currentOne.getParent());
		
	}
	//Check will see if you can safely move do
	public boolean check()
	{
		return false;
	}
	ArrayList<Tree> nodeList;
	ArrayList<Node> childrenNodes;
}
