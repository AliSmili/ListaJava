package models;

public class Bicicleta {

	//Atributos
		private String Color;
		private int numRuedas;
		private String Marca;
		private int numVelocidades;
		private String tipoBici;
		
		
		
		public Bicicleta(){
			
			this.Color=Color;
			this.numRuedas=numRuedas;
			this.Marca=Marca;
			this.numVelocidades=numVelocidades;
			this.tipoBici=tipoBici;
			
		}
		
		//Metodos
		public void  Arranca(){
			System.out.println("He arrancado");;
		}
		
		public void Accelera(){
			System.out.println("He accelerado !!");
		}
		
		

}
