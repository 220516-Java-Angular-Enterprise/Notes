# Depth First Search

**Input**: `n = 4`, `e = 6`

`0 -> 1, 0 -> 2, 1 -> 2, 2 -> 0, 2 -> 3, 3 -> 3`

`Output`: DFS from vertex 1 : `1 2 0 3`

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20200507074112/ezgif.com-gif-maker61.gif">

## Approach

Depth-first search is an algorithm for traversing or searching tree or graph data 
structures. The algorithm starts at the root node (selecting some arbitrary node as 
the root node in the case of a graph) and explores as far as possible along each 
branch before backtracking. 

So the basic idea is to start from the root or any arbitrary node and mark the node 
and move to the adjacent unmarked node and continue this loop until there is no 
unmarked adjacent node. Then backtrack and check for other unmarked nodes and 
traverse them. Finally, print the nodes in the path.

## Algorithm
Create a recursive function that takes the index of the node and a visited array.

1. Mark the current node as visited and print the node.


2. Traverse all the adjacent and unmarked nodes and call the recursive function with 
the index of the adjacent node.

## Example

```aidl
// Java program to print DFS
// traversal from a given
// graph
import java.io.*;
import java.util.*;

// This class represents a
// directed graph using adjacency
// list representation
class Graph {
	private int V; // No. of vertices

	// Array of lists for
	// Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	@SuppressWarnings("unchecked") Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w)
	{
		adj[v].add(w); // Add w to v's list.
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[])
	{
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		// Recur for all the vertices adjacent to this
		// vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	// The function to do DFS traversal.
	// It uses recursive
	// DFSUtil()
	void DFS(int v)
	{
		// Mark all the vertices as
		// not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper
		// function to print DFS
		// traversal
		DFSUtil(v, visited);
	}

	// Driver Code
	public static void main(String args[])
	{
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println(
			"Following is Depth First Traversal "
			+ "(starting from vertex 2)");

		g.DFS(2);
	}
}
// This code is contributed by Aakash Hasija

```

Output:
```
Following is Depth First Traversal (starting from vertex 2)
2 0 1 3
```

## Complexity Analysis

* Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.

* Space Complexity: O(V), since an extra visited array of size V is required.

