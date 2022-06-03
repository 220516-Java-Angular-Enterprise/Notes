# Trees

the tree data structure is a kind of hierarchical data 
arranged in a tree-like structure. It consists of a central 
node, structural nodes, and sub nodes, which are connected 
via edges. We can also say that tree data structure has roots, 
branches, and leaves connected with one another.

A tree is non-linear and a hierarchical data structure 
consisting of a collection of nodes such that each node 
of the tree stores a value, a list of references to nodes 
(the “children”).

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20201129105858/Tree-Basic-Terminology.png">

## Basic Terminology In Tree Data Structure

* **Parent Node**: The node which is a predecessor of a node is called the parent node of that node. {2} is the parent node of {6, 7}.


* **Child Node**: The node which is the immediate successor of a node is called the child node of that node. Examples: {6, 7} are the child nodes of {2}.


* **Root Node**: The topmost node of a tree or the node which does not have any parent node is called the root node. {1} is the root node of the tree. A non-empty tree must contain exactly one root node and exactly one path from the root to all other nodes of the tree.


* **Degree of a Node**: The total count of subtrees attached to that node is called the degree of the node. The degree of a leaf node must be 0. The degree of a tree is the maximum degree of a node among all the nodes in the tree. The degree of the node {3} is 3.


* **Leaf Node or External Node**: The nodes which do not have any child nodes are called leaf nodes. {6, 14, 8, 9, 15, 16, 4, 11, 12, 17, 18, 19} are the leaf nodes of the tree.


* **Ancestor of a Node**: Any predecessor nodes on the path of the root to that node are called Ancestors of that node. {1, 2} are the parent nodes of the node {7}


* **Descendant**: Any successor node on the path from the leaf node to that node. {7, 14} are the descendants of the node. {2}.


* **Sibling**: Children of the same parent node are called siblings. {8, 9, 10} are called siblings.


* **Depth of a node**: The count of edges from the root to the node. Depth of node {14} is 3.


* **Height of a node**: The number of edges on the longest path from that node to a leaf. Height of node {3} is 2.


* **Height of a tree**: The height of a tree is the height of the root node i.e the count of edges from the root to the deepest node. The height of the above tree is 3.


* **Level of a node**: The count of edges on the path from the root node to that node. The root node has level 0.


* **Internal node**: A node with at least one child is called Internal Node.


* **Neighbour of a Node**: Parent or child nodes of that node are called neighbors of that node.


* **Subtree**: Any node of the tree along with its descendant

## Types of Tree Data Structures

The different types of tree data structures are as follows:

1. **General tree**

A general tree data structure has no restriction on the number of nodes. It means that a parent node can have any number of child nodes.

2. **Binary tree**

A node of a binary tree can have maximum number of two child nodes. In the given tree diagram, node B, D, and F are left children, while E, C, and G are the right children.

3. **Balanced tree**

If the height of the left sub-tree and the right sub-tree are equal or differs at most by 1, the tree is known as balanced tree data structure.  

## Properties

• For the n number of nodes, the edges of a tree are equal to (n – 1). For example, 5 nodes includes (5 – 1) 4 edges in a tree data structure, as shown in the above tree diagram.

• The arrow in the structure represents the path. Every edge connects two nodes.

• Any two nodes or vertices of the tree graph are connected by exactly one edge.

• The depth of the node is defined as the length of the path from the root node to the node a. The height of the node ‘a’ is the longest path from the node ‘a’ to the leaf node of the given tree.  

## Heap

A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types:

1. **Max-Heap**: In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.


2. **Min-Heap**: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.