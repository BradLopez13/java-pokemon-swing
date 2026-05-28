/**
 * 
 */
package Pokemones;

import MenuInicio.FotoFondo;

/**
 * @author Brad Lopez
 *
 */
public class Pikachu extends Pokemon implements TipoElectrico {
	FotoFondo pikachuFoto =new FotoFondo("/Imagenes/Pikachu-Pokemon.png");

	@Override
	public int placaje() {
		return 10;
	}
	
	@Override
	public int ataqueRapido() {
		return 15;
	}
	
	@Override
	public void rayo() {
		
	}
	
	@Override
	public void bolaVoltio() {
		
	}
	
	@Override
	public void punoTrueno() {
		
	}
	
	@Override
	public void chispazo() {
		
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

