/**
 * 
 */
package Pokemones;

import MenuInicio.FotoFondo;

/**
 * @author Brad Lopez
 *
 */
public class Venasaur extends Pokemon implements TipoPlanta {
	FotoFondo venasaurFoto =new FotoFondo("/Imagenes/Blastoise-Pokemon.png");

	@Override
	public int placaje() {
		return 10;
	}
	
	@Override
	public int ataqueRapido() {
		return 10;
	}
	
	@Override
	public void rayoSolar() {
		
	}
	
	@Override
	public void latigoCepa() {
		
	}
	
	@Override
	public void danzaPetalo() {
		
	}
	
	@Override
	public void gigadrenado() {
		
	}
	
	@Override
	public String n_placaje() {
		return "Placaje";
	}
	
	@Override
	public String n_ataqueRapido() {
		return "Ataque Rapido";
	}

}
