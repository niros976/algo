package com.algo.graph.model.Vertex;

import com.algo.graph.model.Node.Node;

public class Vertex {
	private Node a;
	private Node b;
	private long weight;
	
	public Vertex(Node a, Node b, long weight) {
		this.a=a;
		this.b=b;
		this.weight=weight;
	}
	
	public Node getA() {
		return a;
	}

	public Node getB() {
		return b;
	}

	public long getWeight(Node a, Node b) {
		return weight;
	}
}
