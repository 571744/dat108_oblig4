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
	
	@Override
	public int compareTo(AltKant o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
