package enumeraciones;

public enum TipoUsuarioE {
	ADMINISTRATIVO("U"),
	PUBLICO("P");
	public final String value;
	private TipoUsuarioE(String value) {
		this.value = value;
	}
}
