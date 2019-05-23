package ro.ase.cts.memento;

public class Contract {

	private String nameClient;
	private String date;
	private int noPers;
	
	public Contract(String nameClient, String date, int noPers) {
		super();
		this.nameClient = nameClient;
		this.date = date;
		this.noPers = noPers;
	}

	//meth that will change the state
	public void setNoPers(int noPers) {
		this.noPers = noPers;
	}

	@Override
	public String toString() {
		return "Contract [nameClient = " + this.nameClient + ", date = " + this.date + ", noPers = " + this.noPers;
	}
	
	//meth for storing and restoring from memento
	public Memento savetoMemento(){
		return new Memento(this.noPers);
	}
	
	public void restoreFromMemento(Memento memento) {
		this.noPers = memento.getNoPers();
	}
}
