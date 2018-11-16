package no.hvl.dat108;

import java.util.List;

public class Node  {

	private String navn;
	private List<Kant> naboer;

	public Node(String navn) {
		this.navn = navn;
	}

	public List<Kant> getNaboer() {
		return naboer;
	}

	public void setNaboer(List<Kant> naboer) {
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
