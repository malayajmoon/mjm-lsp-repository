package org.howard.edu.lsp.exam.question42;

public class SongsDatabase {

	public class SongsDatabase {
		private Map<String, Set<String>> map = 
new HashMap<String, Set<String>>();

 		/* Add a song title to a genre */
		public void addSong(String genre, String songTitle) {
				//Code it!!
				if(!map.containsKey(genre)){
		            //adds new genre 
		            map.put(genre, new HashSet<String>());
		        }
				//add song to genre 
				map.get(genre).add(songTitle); 
			}


		/* Return the Set that contains all songs for a genre */
		public Set<String> getSongs(String genre) {
    			// Code it!!
				
			
		}

		/* Return genre, i.e., jazz, given a song title */
		public String getGenreOfSong(String songTitle) {
    			// Code it!!
				for(Map.Entry<String,Set<String>> k : map.entrySet()){
		            if(k.getValue().contains(songTitle)){
		                //return genre
		                return k.getKey();
			            }
			        }
				//song not in any genre
				return null;
		}
}
} 
/*Below is sample that uses your implementation:
Hint: You need some of the below in your JUnit test cases.
		…
SongsDatabase db = new SongsDatabase();
db.add(“Rap”, “Savage”);
db.add(“Rap”, “Gin and Juice”);
db.add(“Jazz”, “Always There”);

Set<String> songs = db.getSongs(“Rap”);
System.out.println( db.getGenreOfSong(“Savage”) );// prints “Rap”
System.out.println( db.getGenreOfSong(“Always There”) );// prints 
“Jazz”


}*/ 
