package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {

	public static void main(String[] args) {
		Node node1 = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("C");
		Node node4 = new Node("D");

		List<Node> naboTil1 = new ArrayList<Node>();

		naboTil1.add(node2);
		naboTil1.add(node3);
		node1.setNaboer(naboTil1);

		List<Node> naboTil2 = new ArrayList<Node>();

		naboTil2.add(node1);
		naboTil2.add(node4);
		node2.setNaboer(naboTil2);

		List<Node> naboTil3 = new ArrayList<Node>();

		naboTil3.add(node1);
		naboTil3.add(node4);
		node3.setNaboer(naboTil3);

		List<Node> naboTil4 = new ArrayList<Node>();

		naboTil4.add(node2);
		naboTil4.add(node3);
		node4.setNaboer(naboTil4);
		
		List<Node> noder = new ArrayList<Node>();
		noder.add(node1);
		noder.add(node2);
		noder.add(node3);
		noder.add(node4);
		Graf graf = new Graf(noder);
		
		graf.printUt();
	}

}
