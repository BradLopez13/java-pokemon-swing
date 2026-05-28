package Pokemones;

public enum Ataque {
	Lanzallamas("Lanzallamas", 35, "TipoFuego"),
	FuegoFatuo("Fuego Fatuo", 30, "TipoFuego"),
	NitroCarga("Nitrocarga", 20, "TipoFuego"),
	LLamarada("Llamarada", 15, "TipoFuego"),
	Hidropulso("Hidropulso", 35, "TipoAgua"),
	PistolaAgua("Pistola Agua", 25, "TipoAgua"),
	RayoBurbuja("Rayo Burbuja", 20, "TipoAgua"),
	AcuaJet("AcuaJet", 30, "TipoAgua"),
	rayoSolar("Rayo Solar", 35, "TipoPlanta"),
	LatigoCepa("Latigo Cepa", 15, "TipoPlanta"),
	DanzaPetalo("Danza Petalo", 20, "TipoPlanta"),
	Gigadrenado("Gigadrenado", 25, "TipoPlanta"),
	Rayo("Rayo", 35, "TipoElectrico"),
	BolaVoltio("Bola Voltio", 25, "TipoElectrico"),
	PunoTrueno("Puno Trueno", 20, "TipoElectrico"),
	Chispazo("Chispazo", 20, "TipoElectrico");

	private String nombre;
	private int dano;
	private String tipo;

	Ataque(String nombre, int dano, String tipo) {
		this.nombre = nombre;
		this.dano = dano;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
