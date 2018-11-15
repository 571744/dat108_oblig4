package no.hvl.dat108;

public class AltKant implements Comparable<AltKant> {

	

	private Node node1;
	private Node node2;
	private int vekt;
	
	public AltKant(Node node1, Node node2, int vekt) {
		this.node1 = node1;
		this.node2 = node2;
		this.vekt = vekt;
		
	}
	
	public Node getNode1() {
		return node1;
	}

	public void setNode1(Node node1) {
		this.node1 = node1;
	}

	public Node getNode2() {
		return node2;
	}

	public void setNode2(Node node2) {
		this.node2 = node2;
	}

	public int getVekt() {
		return vekt;
	}

	public void setVekt(int vekt) {
		this.vekt = vekt;
	}

	@Override
	public int compareTo(AltKant k) {
		Integer a = this.vekt;
		Integer b = k.vekt;
		return a.compareTo(b);
	}
}
