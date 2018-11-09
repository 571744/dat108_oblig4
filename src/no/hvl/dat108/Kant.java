package no.hvl.dat108;

public class Kant {
	private String id;
	private Node start;
	private Node slutt;
	private int vekt;
	

	
	public Kant(String id, Node start, Node slutt, int vekt) {

		this.id = id;
		this.start = start;
		this.slutt = slutt;
		this.vekt = vekt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Node getStart() {
		return start;
	}
	public void setStart(Node start) {
		this.start = start;
	}
	public Node getSlutt() {
		return slutt;
	}
	public void setSlutt(Node slutt) {
		this.slutt = slutt;
	}
	public int getVekt() {
		return vekt;
	}
	public void setVekt(int vekt) {
		this.vekt = vekt;
	}
	@Override
	public String toString() {
		return "Kant [id=" + id + ", start=" + start + ", slutt=" + slutt + ", vekt=" + vekt + "]";
	}

	
	
	
}
