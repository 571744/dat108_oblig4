package no.hvl.dat108;

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
		for(int i = 0; i<noder.size(); i++) {
			System.out.println("\n" + noder.get(i).getNavn());
			for(int j = 0; j<noder.get(i).getNaboer().size();j++) {
				System.out.println("Har nabo: " +noder.get(i).getNaboer().get(j).getNavn());
			}
		}
		
	}

	
}
