import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Chart {
	public Chart(String compress)
	{
	subject = compress;	
	}
	//buildTable will get the frequency of a char
	//This method does now work ----- It returns a table that has the frequency of the chars as the value
	public Map<Character, Integer> buildTable()
	{
		Map<Character, Integer> table = new HashMap<Character, Integer>();
		int loopControl = subject.length();
		for(int x = 0; x < loopControl; x++)
		{
			if(table.containsKey(subject.charAt(x)) == true)
			{
				//If it is true we need to add one more to the current int
				//So this is just appending to the current state 
				table.put(subject.charAt(x), table.get(subject.charAt(x)) + 1);
			}
			else
			{
				//This is creating a new dict value... Thanks Kinga
				//Note to reader, Kinga was my intro to cs professor who taught me how to use dicts
				table.put(subject.charAt(x), 1);
			}
		}
		return table;
	}
	public ArrayList<Tree> getTreeList(Map<Character, Integer> huffman)
	{
		while(huffman.size() > 0)
		{
			Character tempChar = getLowestLeaf(huffman);
			int tempInt = (Integer) huffman.get(tempChar);
			Node node = new Node(tempChar.toString(), tempInt, null, null);
			childrenNodes.add(node);
			//This is a filler
			Node x = null,y = null;
			Tree tree = new Tree(node ,y ,x , tempInt);
			ArrayList<Node> list = new ArrayList<Node>();
			list.add(node);
			tree.appendTreeList(list);
			nodeList.add(tree);
			huffman.remove(tempChar);
		}
		return nodeList;
	}
	//This is going to take the map and find the lowest value in it
	public ArrayList<Node> getChildrenList()
	{
		return childrenNodes;
	}
	public static Character getLowestLeaf(Map<Character, Integer> table)
	{
		Integer min = -1;
		Character key = ' ';
		Collection<Integer> collection = table.values();
		Collection<Character> collectionKeys = table.keySet();
		Object [] array = collection.toArray();
		Object [] arrayKey = collectionKeys.toArray();
		for(int x = 0; x < array.length; x++ )
		{
			if(min == -1)
			{
				min = ((Integer) array[x]).intValue();
				key = (Character) arrayKey[x];
			}
			else if(min > ((Integer) array[x]).intValue())
			{
				min = ((Integer) array[x]).intValue();
				key = (Character) arrayKey[x];
		}
	}
	return key;	
	}
	static String subject = "";
	static ArrayList<Tree> nodeList = new ArrayList<Tree>();
	static ArrayList<Node> childrenNodes = new ArrayList<Node>();
}