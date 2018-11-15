package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

public class Oppsett {
	public static void Generering() {
	
		List<Kant> naboTil1 = new ArrayList<Kant>();
		List<Kant> naboTil2 = new ArrayList<Kant>();
		List<Kant> naboTil3 = new ArrayList<Kant>();
		List<Kant> naboTil4 = new ArrayList<Kant>();

		List<Node> noder = new ArrayList<Node>();
		Node node1 = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("C");
		Node node4 = new Node("D");
		
		
		Kant k1 = new Kant(node2, 3);
		naboTil1.add(k1);
		node1.setNaboer(naboTil1);

		Kant k2 = new Kant(node1, 3);
		Kant k3 = new Kant(node3, 5);
		Kant k4 = new Kant(node4, 7);
		naboTil2.add(k2);
		naboTil2.add(k3);
		naboTil2.add(k4);
		node2.setNaboer(naboTil2);

		Kant k5 = new Kant(node2, 5);
		Kant k6 = new Kant(node4, 1);
		naboTil3.add(k5);
		naboTil3.add(k6);
		node3.setNaboer(naboTil3);

		
		Kant k7 = new Kant(node2, 7);
		Kant k8 = new Kant(node3, 1);
		naboTil4.add(k7);
		naboTil4.add(k8);
		node4.setNaboer(naboTil4);

		
		noder.add(node1);
		noder.add(node2);
		noder.add(node3);
		noder.add(node4);
		Graf graf = new Graf(noder);
		System.out.println("Grafen vår ser slik ut:");
		graf.printUt();
		
		
		//Tester leggtil-metoden
		System.out.println("\nSå legger vi til en node: ");
		List<Kant> naboTil5 = new ArrayList<Kant>();
		Node node5 = new Node("F");
		
		Kant k9 = new Kant(node1, 10);
		Kant k10 = new Kant(node2, 2);
		Kant k11= new Kant(node3, 4);
		Kant k12 = new Kant(node4, 5);
		naboTil5.add(k9);
		naboTil5.add(k10);
		naboTil5.add(k11);
		naboTil5.add(k12);
		Node lagtTil = graf.leggTilNode(node5, naboTil5);
		
		System.out.println("\nLa til node: " + lagtTil.getNavn());
		graf.printUt();
		
		
		
		System.out.println("\nSå fjerner vi en node: \n");
		Node fjernet = graf.fjernNode(node1);
		System.out.println("Fjernet: " + fjernet.getNavn());
		graf.printUt();

		
	
		
		
		System.out.println("\nSå fjerner vi en kant mellom " + node2.getNavn() + " og " + node4.getNavn() + ".\n");
		graf.fjernKant(node2, node4);
		graf.printUt();

		
		
		System.out.println("\nBreddeførst gjennomgang fra node B: \n");
		List<Node> bredde = graf.breddeFoerst(node2);
		System.out.println("\nEndelig gjennomgang: \n");
		for (Node n : bredde) {
			System.out.println(n.getNavn());
		}
		
		List<Kant> naboTil6 = new ArrayList<Kant>();
		Node node6 = new Node("G");
		
		Kant k13 = new Kant(node4, 4);
		
		naboTil6.add(k13);
		graf.leggTilNode(node6, naboTil6);
		
		
		List<Kant> naboTil7 = new ArrayList<Kant>();
		Node node7 = new Node("H");
		
		Kant k14 = new Kant(node4, 4);
		Kant k15 = new Kant(node6, 1);
		
		naboTil7.add(k14);
		naboTil7.add(k15);
		graf.leggTilNode(node7, naboTil7);
		
		List<Kant> naboTil8 = new ArrayList<Kant>();
		Node node8 = new Node("I");
		
		Kant k16= new Kant(node2, 1);
		Kant k17 = new Kant(node7, 3);
		
		naboTil8.add(k16);
		naboTil8.add(k17);
		graf.leggTilNode(node8, naboTil8);
		
		List<Kant> naboTil9 = new ArrayList<Kant>();
		Node node9 = new Node("J");
		
		Kant k18= new Kant(node5, 6);
		Kant k19 = new Kant(node8, 2);
		
		naboTil9.add(k18);
		naboTil9.add(k19);
		graf.leggTilNode(node9, naboTil9);
		
		
		System.out.println("\nVi prøver her å finne minnste spenntre (MST): \n");
	
		graf.prim(node4);
		
		List<Node> MST = graf.getMST();
		graf.printMST();
	}
}
