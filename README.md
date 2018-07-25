# Compression
@author Dylan Poole

DESCRIPTION: This was a simple project to understand the concept of the Huffman coding algorithm. It does not actually compress any data it just gives you the "paths" or the binary code for characters that go through this process. This project is made up of four different classes.

CLASSES: 

Main(97 lines): This class is where the algorithm is located in the buildTree method. The public static MAin method acts as a head-quarters for the entire project. From this class you create new Nodes and Trees. This class also keeps track of the paths for the end of the project.

Chart(84): Chart is a class that is only used to create the original nodeList that will keep the a list of Trees that are have the weight from lowest to highest. This is the same list that will end up containing one item  (this item will be the optimal tree). I call this Class in the Main class to init my Node List. This class is also used to create the text into nodes and then into a tree.

Node(48): Node is a class that i created to have objects that are sub-trees. Nodes can be combined to create a tree which is the end goal. The class nodes also has a lengthy amount of methods that can be used to gather information about a certain Node, including it's final path or address. 

Tree(44): The class Tree is a collection of Nodes. Trees can be combined with other trees. In fact Nodes have to be converted to single trees before that can be instated as a tree. To make a tree you must have two children trees (A single tree can just have null as child1, and child2).