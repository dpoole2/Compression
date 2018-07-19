/*
 * My hope for this class is that it will create a Node with details
 */
public class Node {
public Node(String val, int w, Node Child1, Node Child2)
{
	name = val;
	weight = w;
	child1 = Child1;
	child2 = Child2;
}
public Node getChild1()
{
	return child1;
}
public Node getChild2()
{
	return child2;
}
public  String getName()
{
	return name;
}

public int getWeight()
{
	return weight;
}
public String getParent(){
	return parent;
}
public void setParent(String Parent){
	parent = Parent;
}
String parent = "";
String name = "";
Node child1;
Node child2;
int weight = 0;
}
