package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

public class Graf {
	List<Node> noder;
	
	List<Node> MST; 
	TabellHaug<Kant> kanter = new TabellHaug<Kant>();

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
				Kant k = noder.get(i).getNaboer().get(j);
				System.out.println("Har nabo: " + k.getNabo().getNavn() + ", med vekt: " + k.getVekt());
			}
		}

	}

	public Node fjernNode(Node node) {
		List<Kant> naboer = node.getNaboer();
		if (noder.contains(node)) {

			for (int i = 0; i < naboer.size(); i++) {

				for (int j = 0; j < naboer.get(i).getNabo().getNaboer().size(); j++) {

					Kant k = naboer.get(i).getNabo().getNaboer().get(j);

					if (k.getNabo().equals(node)) {
						naboer.get(i).getNabo().getNaboer().remove(j);
					}

				}

			}

			noder.remove(node);

		} else {
			return null;

		}

		return node;

	}

	public Node leggTilNode(Node node, List<Kant> naboer) {
		List<Kant> nyNabo = new ArrayList<Kant>();
		if (!noder.contains(node)) {
			noder.add(node);

			for (int a = 0; a < naboer.size(); a++) {
				if (noder.contains(naboer.get(a).getNabo())) {
					nyNabo.add(naboer.get(a));
				} else {
					System.out.println("Noden " + naboer.get(a).getNabo().getNavn()
							+ " eksisterer ikke, og vil derfor ikke bli lagt til som nabo hos noden " + node.getNavn());
				}
			}
			node.setNaboer(nyNabo);

			for (int i = 0; i < noder.size(); i++) {
				for (int j = 0; j < naboer.size(); j++) {

					Kant k = naboer.get(j);

					if (k.getNabo().equals((noder.get(i)))) {
						Kant nyKant = new Kant(node, k.getVekt());
						noder.get(i).getNaboer().add(nyKant);
					}
				}

			}

			return node;
		} else {
			System.out.println("\nDenne noden er allerede en del av grafen!\n");
			return null;
		}

	}

	public Kant fjernKant(Node node, Node naboNode) {
		for (int i = 0; i < node.getNaboer().size(); i++) {
			Kant a = node.getNaboer().get(i);

			if (a.getNabo().equals(naboNode)) {
				node.getNaboer().remove(a);
				for (int j = 0; j < naboNode.getNaboer().size(); j++) {
					Kant b = naboNode.getNaboer().get(j);
					if (b.getNabo().equals(node)) {
						naboNode.getNaboer().remove(b);
						return a;
					}
				}
			}

		}

		return null;

	}

	public List<Node> breddeFoerst(Node node) {
		List<Node> besokt = new ArrayList<Node>();
		SirkulearKoe<Node> koe = new SirkulearKoe<Node>();
		koe.innKoe(node);
		int j = 1;
		while (!koe.erTom() && (noder.size() != besokt.size())) {
			Node n = koe.utKoe();
			System.out.println("\nKøen er på gjennomgang " + j + ":\n");
			if (!besokt.contains(n)) {
				besokt.add(n);

				for (int i = 0; i < n.getNaboer().size(); i++) {
					koe.innKoe(n.getNaboer().get(i).getNabo());
				}

				for (int i = koe.getFront(); i < koe.getFront() + koe.antall(); i++) {

					System.out.println("" + koe.getElement(i).getNavn());
				}
			} else {
				System.out.println("* Elementet " + n.getNavn() +" er allerede besøkt");
			}
			j++;
		}
		if(!koe.erTom()) {
			System.out.println("\nGjennomgangen stoppes etter " + (j-1) + " gjennomganger fordi alle elementene nå er besøkt.");
		}
		return besokt;
	}
	
	public List<Node> finnMST(){
		for (int i = 0; i < noder.size(); i++) {
			prim(noder.get(i));
		}
		return MST;
	}
	
	public void prim(Node node) {
		for (Kant a : node.getNaboer()) {
			Kant k = kanter.fjernMinste();
		}
	}
	
}
