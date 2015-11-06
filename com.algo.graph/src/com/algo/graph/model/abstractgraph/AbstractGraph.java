package com.algo.graph.model.abstractgraph;

import com.algo.graph.model.Node.Node;
import com.algo.graph.model.igraph.*;

public abstract class AbstractGraph implements IGraph {
	abstract public void addVertex(Node a, Node b, long weight);
	abstract public void removeVertex(Node a, Node b);
	abstract public long getWeight(Node a, Node b);

}
