package ro.ase.cts.chainOfResp;

public abstract class Handler {

	//referinta la succesor
	protected Handler succesor = null;

	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	}
	
	public abstract void procesare(Comanda comanda);
	
}
