package org.anmat.pruebas;




public class pruebas {

	public static void main(String[] args){
		AnmatTest pr = new AnmatTest();
		try{
			pr.testConection();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
