package com.algo.graph.main;

import java.util.List;

import com.algo.graph.model.Node.Node;
import com.algo.graph.model.abstractgraph.AbstractGraph;
import com.algo.graph.model.listgraph.ListGraph;
import com.algo.graph.model.matrixgraph.MatrixGraph;

public class Application {

	static AbstractGraph graf;
	static List<Node> noduri;
	
	public static void main(String[] args) {
	graf = new MatrixGraph(10);
	noduri = graf.getNodes();	
	initGraf(graf);

	System.out.println("The end");
	}
	
	static void initGraf(AbstractGraph gra) {
		addV(0,4,5);
		addV(0,7,2);
		addV(0,9,1);
		addV(1,2,3);
		addV(1,3,5);
		addV(1,5,20);
		addV(2,4,6);
		addV(2,5,10);
		addV(2,8,1);
		addV(3,7,2);
		addV(3,9,15);
		addV(4,1,5);
		addV(4,6,4);
		addV(4,7,2);
		addV(5,2,10);
		addV(5,3,6);
		addV(5,8,1);
		addV(6,5,5);
		addV(7,2,9);
		addV(7,9,3);
		addV(8,0,3);
		addV(9,5,14);
		addV(9,8,2);
	}
	
	static void addV(int a, int b, int w) {
		graf.addVertex((Node)noduri.toArray()[a],(Node)noduri.toArray()[b],w);
	}

}
