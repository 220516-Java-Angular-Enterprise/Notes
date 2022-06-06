# Breadth First Search

Breadth First Search (BFS) algorithm traverses a graph in a breadth motion and 
uses a queue to remember to get the next vertex to start a search, when a dead
end occurs in any iteration.

<img src="https://www.tutorialspoint.com/data_structures_algorithms/images/breadth_first_traversal.jpg">

* **Rule 1** − Visit the adjacent unvisited vertex. Mark it as visited. Display it. Insert it in a queue.


* **Rule 2** − If no adjacent vertex is found, remove the first vertex from the queue.


* **Rule 3** − Repeat Rule 1 and Rule 2 until the queue is empty.

| Step | 	Traversal                                                                                  | 	Description                                                                                                                                            |
|------|---------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1	   | <img src="https://www.tutorialspoint.com/data_structures_algorithms/images/bfs_one.jpg">    | 	Initialize the queue.                                                                                                                                  |
| 2	   | <img src="https://www.tutorialspoint.com/data_structures_algorithms/images/bfs_two.jpg">    | 	We start from visiting S (starting node), and mark it as visited.                                                                                      |
| 3	   | <img src="https://www.tutorialspoint.com/data_structures_algorithms/images/bfs_three.jpg">  | 	We then see an unvisited adjacent node from S. In this example, we have three nodes but alphabetically we choose A, mark it as visited and enqueue it. |
| 4	   | <img src="https://www.tutorialspoint.com/data_structures_algorithms/images/bfs_four.jpg">   | 	Next, the unvisited adjacent node from S is B. We mark it as visited and enqueue it.                                                                   |
| 5	   | <img src="https://www.tutorialspoint.com/data_structures_algorithms/images/bfs_five.jpg">   | 	Next, the unvisited adjacent node from S is C. We mark it as visited and enqueue it.                                                                   |
| 6	   | <img src="https://www.tutorialspoint.com/data_structures_algorithms/images/bfs_six.jpg">    | 	Now, S is left with no unvisited adjacent nodes. So, we dequeue and find A.                                                                            |
| 7	   | <img src="https://www.tutorialspoint.com/data_structures_algorithms/images/bfs_seven.jpg">	 | From A we have D as unvisited adjacent node. We mark it as visited and enqueue it.                                                                      |

At this stage, we are left with no unmarked (unvisited) nodes. 
But as per the algorithm we keep on dequeue in order to get all unvisited nodes. 
When the queue gets emptied, the program is over.

## Example
```
// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph
{
	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; //Adjacency Lists

	// Constructor
	Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}

	// prints BFS traversal from a given source s
	void BFS(int s)
	{
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean visited[] = new boolean[V];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s]=true;
		queue.add(s);

		while (queue.size() != 0)
		{
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s+" ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				if (!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	// Driver method to
	public static void main(String args[])
	{
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal "+
						"(starting from vertex 2)");

		g.BFS(2);
	}
}
// This code is contributed by Aakash Hasija

```