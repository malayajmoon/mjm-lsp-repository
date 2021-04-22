package org.howard.edu.lsp.exam.question42;

import java.util.*; 
public class Test {

	public Test() {
		SongsDatabase();{

	    }

	    
	        
	        
	        SongsDatabase db = new SongsDatabase();
	        db.add(“Rap”, “Savage”);
	        db.add(“Rap”, “Gin and Juice”); 
	        db.add(“Jazz”, “Always There”);

	        Set<String> songs = db.getSongs(“Rap”);
	        System.out.println( db.getGenreOfSong(“Savage”));// prints “Rap”
	        System.out.println( db.getGenreOfSong(“Always There”));// prints “Jazz”
	
	    

}

	private void SongsDatabase() {
		// TODO Auto-generated method stub
		
	}

	
}
