package no.hvl.dat108;



public class SirkulearKoe<T>  {
	private static final int STDK = 100;
	private int front, bak, antall;
	private T[] koe;

	public SirkulearKoe() {
		this(STDK);
	}

	public SirkulearKoe(int startKapasitet) {
		koe = (T[]) (new Object[startKapasitet]);
		front = bak = 0;
		antall = 0;
	}

	public T[] getKoe() {
		return koe;
	}

	
	public void innKoe(T element) {
		if (antall() == koe.length) {
			utivd();
		}
		koe[bak] = element;
		bak = (bak + 1) % koe.length;
		antall++;
	}

	
	public T utKoe() {
		T resultat = null;
		if(!erTom()) {
			resultat = koe[front];
			front = (front + 1) % koe.length;
			antall--;
		}
		return resultat;
	}

	
	public T foerste()  {
		if(!erTom()) {
			return koe[front];
		} return null;
	}


	public boolean erTom() {
		boolean tom = false;
		if (antall == 0) {
			tom = true;
		}
		return tom;
	}

	
	public int antall() {
		return antall;
	}

	public void utivd() {
		T[] hjelpetabell = (T[]) (new Object[koe.length * 2]);
		for (int i = 0; i < antall; i++) {
			hjelpetabell[i] = koe[i];
			front = (front + 1) % koe.length;
		}
		front = 0;
		bak = antall;
		koe = hjelpetabell;
	}
}