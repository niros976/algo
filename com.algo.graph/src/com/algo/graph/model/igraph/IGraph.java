package com.algo.graph.model.igraph;

import java.util.List;

import com.algo.graph.model.Node.Node;

public interface IGraph {
	public static final long NOLINK = 0xFFFFFFFF;
	public List<Node> getNodes();
	public void addVertex(Node a, Node b, long weight);
	public void removeVertex(Node a, Node b);
	public long getWeight(Node a, Node b);
}
