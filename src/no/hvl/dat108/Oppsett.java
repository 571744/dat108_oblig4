package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

public class Oppsett {
	public static void Generering() {
		Node node1;
		Node node2;
		Node node3;
		Node node4;
		Node node5;
		List<Node> naboTil1 = new ArrayList<Node>();
		List<Node> naboTil2 = new ArrayList<Node>();
		List<Node> naboTil3 = new ArrayList<Node>();
		List<Node> naboTil4 = new ArrayList<Node>();
		List<Node> naboTil5 = new ArrayList<Node>();
		List<Node> noder = new ArrayList<Node>();
		node1 = new Node("A");
		node2 = new Node("B");
		node3 = new Node("C");
		node4 = new Node("D");
		node5 = new Node("F");

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
		List<Node> node5naboer = new ArrayList<Node>();
		node5naboer.add(node3);
		node5naboer.add(node4);
		node5naboer.add(node2);
		node5naboer.add(node1);
		graf.leggTilNode(node5, node5naboer);
		graf.printUt();
		System.out.println("\nSå fjerner vi en node: \n");
		Node fjernet = graf.fjernNode(node1);
		System.out.println("Fjernet: " + fjernet.getNavn());
		graf.printUt();

		System.out.println("\nSå legger vi til en node: \n");
		Node nyNode = new Node("E");
		List<Node> nyNodeNaboer = new ArrayList<Node>();
		nyNodeNaboer.add(node2);

		Node lagtTil = graf.leggTilNode(nyNode, nyNodeNaboer);
		System.out.println("La til node: " + lagtTil.getNavn());
		graf.printUt();
		System.out.println("\nSå fjerner vi en kant mellom " + node2.getNavn() + " og " + node4.getNavn() + ".\n");
		graf.fjernKant(node2, node4);
		graf.printUt();

		System.out.println("\nBreddeførst gjennomgang: \n");
		List<Node> bredde = graf.breddeFoerst(node2);
		System.out.println("\nEndelig gjennomgang: \n");
		for (Node n : bredde) {
			System.out.println(n.getNavn());
		}

	}
}
