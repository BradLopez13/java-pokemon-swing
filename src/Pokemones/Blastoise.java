/**
 * 
 */
package Pokemones;

import MenuInicio.FotoFondo;

/**
 * @author Brad Lopez
 *
 */
public class Blastoise extends Pokemon implements TipoAgua{
	FotoFondo BlastoiseFoto  =new FotoFondo("/Imagenes/Blastoise-Pokemon.png");


	@Override
	public String n_placaje() {
		return "Placaje";
	}
	@Override
	public String n_ataqueRapido() {
		return "Ataque Rapido";
	}
	
	@Override
	public int placaje() {
		return 10;
	}

	@Override
	public int ataqueRapido() {
		return 15;
	}

	@Override
	public void hidropulso() {
		
	}

	@Override
	public void pistolaAgua() {
		
	}

	@Override
	public void rayoBurbuja() {
		
	}

	@Override
	public void acuaJet() {
		
	}

}
