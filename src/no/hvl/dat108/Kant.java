package no.hvl.dat108;

public class Kant implements Comparable<Kant>{


	private Node nabo;
	private int vekt;
	

	
	public Kant(Node slutt, int vekt) {
		this.nabo = slutt;
		this.vekt = vekt;
	}
	
	public Node getNabo() {
		return nabo;
	}
	public void setNabo(Node slutt) {
		this.nabo = slutt;
	}
	public int getVekt() {
		return vekt;
	}
	public void setVekt(int vekt) {
		this.vekt = vekt;
	}
	
	@Override
	public String toString() {
		return "Kant [nabo=" + nabo + ", vekt=" + vekt + "]";
	}

	@Override
	public int compareTo(Kant o) {
		Integer a = this.vekt;
		Integer b = o.vekt;
		return a.compareTo(b);
	}
}
