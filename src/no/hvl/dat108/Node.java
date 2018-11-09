package no.hvl.dat108;

public class Node {

	private String id;
	private String navn;
	
	public Node(String navn) {
		this.navn = navn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
