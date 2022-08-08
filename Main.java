import java.util.*;
public class Main {
	public static void main(String args[]){
	   ArrayList<String> words = new ArrayList<String>();
	   words.add("Java");
	   words.add("React");
	   words.add("Angular");
	   words.add("Vue");

	   Collections.sort(words);

	   System.out.println("In dictionary order:");
	   for(String counter: words){
			System.out.println(counter);
		}
	}
}

// run code to see result