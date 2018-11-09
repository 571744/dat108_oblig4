package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {

	public static void Generering() {
		Node node1;
		Node node2;
		Node node3;
		Node node4;
		List<Node> naboTil1 = new ArrayList<Node>();
		List<Node> naboTil2 = new ArrayList<Node>();
		List<Node> naboTil3 = new ArrayList<Node>();
		List<Node> naboTil4 = new ArrayList<Node>();
		List<Node> noder = new ArrayList<Node>();
		node1 = new Node("A");
		node2 = new Node("B");
		node3 = new Node("C");
		node4 = new Node("D");
		
		naboTil1.add(node2);
		node1.setNaboer(naboTil1);
		
		
		naboTil2.add(node1);
		naboTil2.add(node3);
		naboTil2.add(node4);
		node2.setNaboer(naboTil2);
		

		naboTil3.add(node2);
		naboTil3.add(node4);
		node3.setNaboer(naboTil3);
		
		naboTil4.add(node2);
		naboTil4.add(node3);
		node4.setNaboer(naboTil4);
		
		noder.add(node1);
		noder.add(node2);
		noder.add(node3);
		noder.add(node4);
		Graf graf = new Graf(noder);
		graf.printUt();
		System.out.println("\nSå fjerner vi en node: \n");
		graf.fjernNode(node1);
		graf.printUt();
		
		System.out.println("\nSå legger vi til en node: \n");
		Node nyNode = new Node("E");
		List<Node> nyNodeNaboer = new ArrayList<Node>();
		nyNodeNaboer.add(node4);
		
		graf.leggTilNode(nyNode, nyNodeNaboer);
		graf.printUt();
		System.out.println("\nSå fjerner vi en kant: \n");
		graf.fjernKant(node2, node4);
		graf.printUt();
	}
	public static void main(String[] args) {
		

		Generering();
		

	}

}
