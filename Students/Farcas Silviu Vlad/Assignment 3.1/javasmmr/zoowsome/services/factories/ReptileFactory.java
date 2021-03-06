package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory{
	public Animal getAnimal (String type) throws Exception{
		if(Constants.Animal.Reptile.Chameleon.equals(type)){
			return new Chameleon(AnimalFactory.names[(int)(Math.random()*100)]);
		}else if(Constants.Animal.Reptile.Cobra.equals(type)){
			return new Cobra(AnimalFactory.names[(int)(Math.random()*100)]);
		}else if (Constants.Animal.Reptile.Crocodile.equals(type)){
			return new Crocodile(AnimalFactory.names[(int)(Math.random()*100)]);			
		}else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
