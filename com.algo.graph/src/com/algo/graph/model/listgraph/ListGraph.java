package com.algo.graph.model.listgraph;

import java.util.ArrayList;
import java.util.List;

import com.algo.graph.model.Node.Node;
import com.algo.graph.model.Vertex.Vertex;
import com.algo.graph.model.abstractgraph.AbstractGraph;

public class ListGraph extends AbstractGraph{
	
	private List<Node> nodes;
	private List<Vertex> graph;
	
	public ListGraph(int nnodes) {
		nodes = new ArrayList<Node>();
		graph = new ArrayList<Vertex>();
		for (int i=0; i<nnodes;i++) {
			Node n = new Node(i);
			nodes.add(n);
		}
	}
	
	public void addVertex(Node a, Node b, long weight) {
		if (nodes.contains(a) && nodes.contains(b)) {
			Vertex v = new Vertex(a,b,weight);
			graph.add(v);
		}
	}

	public void removeVertex(Node a, Node b) {
		for (Vertex v: graph) {
			if ((v.getA() == a) && (v.getB() == b))
				graph.remove(v);
		}
	}	
	
	@Override
	public long getWeight(Node a, Node b) {
		for (Vertex v: graph) {
			if ((v.getA() == a) && (v.getB() == b))
				return v.getWeight(a, b);
		}
		return NOLINK;
	}

	@Override
	public List<Node> getNodes() {
		return nodes;
	}
}
