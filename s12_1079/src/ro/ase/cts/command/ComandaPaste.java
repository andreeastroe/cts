package ro.ase.cts.command;

public class ComandaPaste implements IComanda{

	private String tipPaste;
	private String tipBranza;
	private Bucatar bucatar;
	
	public ComandaPaste(String tipPaste, String tipBranza, Bucatar bucatar) {
		super();
		this.tipPaste = tipPaste;
		this.tipBranza = tipBranza;
		this.bucatar = bucatar;
	}

	@Override
	public void prepara() {
		this.bucatar.gatestePaste(this.tipPaste, this.tipBranza);
	}

}
