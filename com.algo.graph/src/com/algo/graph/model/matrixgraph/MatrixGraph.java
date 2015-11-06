package com.algo.graph.model.matrixgraph;

import java.util.ArrayList;
import java.util.List;

import com.algo.graph.model.Node.Node;
import com.algo.graph.model.abstractgraph.AbstractGraph;

public class MatrixGraph extends AbstractGraph {
	private List<Node> nodes;
	private long[][] matrix;
	
	public MatrixGraph(int nnodes) {
		nodes = new ArrayList<Node>();
		matrix = new long[nnodes][nnodes];
		for (int i=0;i<nnodes;i++)
			nodes.add(new Node(i));
		for (int i=0;i<nnodes;i++)
			for (int j=0;j<nnodes;j++) 
				matrix[i][j]=NOLINK;
	}

	public void addVertex(Node a, Node b, long weight) {
		matrix[a.getId()][b.getId()] = weight;
	}
	
	public void removeVertex(Node a, Node b) {
		matrix[a.getId()][b.getId()] = NOLINK;
	}
	
	public long weight(Node a, Node b) {
		return matrix[a.getId()][b.getId()];
	}

	@Override
	public long getWeight(Node a, Node b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Node> getNodes() {
		return nodes;
	}
}
