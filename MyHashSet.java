import java.util.*;

public class MyHashSet {
        int size = 0;
    	  
    	  private ArrayList<LinkedList<MapEntry>> entries;

    	  public MyHashSet(int size) 
        {
          this.size = size;

    	    entries = new ArrayList<>();
    	    //Your hash set should contain an array for holding the underlying data.
    	    for (int i = 0; i < size; i++) {
    	      LinkedList<MapEntry> emptyList = new LinkedList<>(); //Handles collisions 
    	      entries.add(emptyList);
    	    }
    	  }

    	  public void add(String word) {
    	    MapEntry entry = new MapEntry(word);
    	    int index = hash(word);
    	    entries.get(index).add(entry); 
    	  }
    	  	
        public boolean contains(String isWord) {
            int index = hash(isWord);
            LinkedList<MapEntry> current = entries.get(index);
            return entries.contains(isWord);
        }
 

      public int hash(String word) { 
        char[] letters = word.toCharArray();
        int sum = 0;			
        for (int i = 0; i< letters.length; i++){
          sum += (int) letters[i];
        }
        return sum % size;
      }
   }

    class MapEntry {
    	  public String word;
    	  
    	  public MapEntry(String word) {
    	    this.word = word;
    	  }
    }