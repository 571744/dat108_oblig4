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

	@Override
	public String toString() {
		return "Graf [noder=" + noder + "]";
	}
	
	
}
