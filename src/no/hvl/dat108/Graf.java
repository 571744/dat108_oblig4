package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

public class Graf {
	List<Node> noder;

	public Graf(List<Node> noder) {
		this.noder = noder;

	}

	public List<Node> getNoder() {
		return noder;
	}

	public void setNoder(List<Node> noder) {
		this.noder = noder;
	}

	public void printUt() {
		for (int i = 0; i < noder.size(); i++) {
			System.out.println("\n" + noder.get(i).getNavn());
			for (int j = 0; j < noder.get(i).getNaboer().size(); j++) {
				System.out.println("Har nabo: " + noder.get(i).getNaboer().get(j).getNavn());
			}
		}

	}

	public Node fjernNode(Node node) {
		List<Node> naboer = node.getNaboer();
		if (noder.contains(node)) {
			
				for(int i = 0; i<naboer.size();i++) {
					if(naboer.get(i).getNaboer().contains(node)) {
					naboer.get(i).getNaboer().remove(node);
					}
				}
				noder.remove(node);
				
			}
		else {
			return null;
			
			
			
		
		}

		return node;

	}
	public Node leggTilNode(Node node, List<Node> naboer) {
		List<Node> nyNabo = new ArrayList<Node>();
		if(!noder.contains(node)) {
		noder.add(node);
		
		for(int a = 0; a<naboer.size();a++) {
			if(noder.contains(naboer.get(a))) {
				nyNabo.add(naboer.get(a));
			} else {
				System.out.println("Noden " + naboer.get(a).getNavn() + " eksisterer ikke, og vil derfor ikke bli lagt til som nabo hos noden " + node.getNavn());
			}
			
		}
		node.setNaboer(nyNabo);
		
		for(int i = 0; i<noder.size();i++) {
			if(naboer.contains(noder.get(i))) {
				
				noder.get(i).getNaboer().add(node);
			}
		}
		
		return node;
		}
		return null;
	}
	public Node fjernKant(Node node, Node naboNode) {
		
		if(node.getNaboer().contains(naboNode)) {
			node.getNaboer().remove(naboNode);
			naboNode.getNaboer().remove(node);
		}
	
		
		
		return node;
	}

	public List<Node> breddeFoerst(Node node) {
		List<Node> besokt = new ArrayList<Node>();
		SirkulearKoe<Node> koe = new SirkulearKoe<Node>();
		koe.innKoe(node);
		int j = 1;
		while(!koe.erTom()) {
			Node n  = koe.utKoe();
			if(!besokt.contains(n)) {
				besokt.add(n);
				
				for(int i = 0; i<n.getNaboer().size();i++) {
					koe.innKoe(n.getNaboer().get(i));
				}
				System.out.println("\nKøen er på gjennomgang " + j + ":\n");
				for(int i = 0; i<koe.antall();i++) {
					
					System.out.println(""+ koe.getElement(i).getNavn());
				}
			}
			j++;
		}
		return besokt;
	}
}
