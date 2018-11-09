package no.hvl.dat108;

import java.util.List;

public class Node {

	
	private String navn;
	private List<Node> naboer;
	
	public Node(String navn) {
		this.navn = navn;
		
	}


	public Node(String navn, List<Node> naboer) {
		this.navn = navn;
		this.naboer = naboer;
	}


	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	@Override
	public String toString() {
		return "Node [navn=" + navn + "]";
	}
	
	
}
