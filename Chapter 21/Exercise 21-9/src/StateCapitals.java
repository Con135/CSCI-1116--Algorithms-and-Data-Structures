import java.util.*;
import java.util.Scanner;

public class StateCapitals{
  public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	  
	  Map<String, String> map = new HashMap<>();
	  
	  map.put("alabama", "Montgomery");
	  map.put("alaska", "Juneau");
	  map.put("arizona", "Phoenix");
	  map.put("arkansas", "Little Rock");
	  map.put("california", "Sacramento");
	  map.put("colorado", "Denver");
	  map.put("connecticut", "Hartford");
	  map.put("delaware", "Dover");
	  map.put("florida", "Tallahassee");
	  map.put("georgia", "Atlanta");
	  map.put("hawaii", "Honolulu");
	  map.put("idaho", "Boise");
	  map.put("illinois", "Springfield");
	  map.put("indiana", "Indianapolis");
	  map.put("iowa", "Des Moines");
	  map.put("kansas", "Topeka");
	  map.put("kentucky", "Frankfort");
	  map.put("louisiana", "Baton Rouge");
	  map.put("maine", "Augusta");
	  map.put("maryland", "Annapolis");
	  map.put("massachusettes", "Boston");
	  map.put("michigan", "Lansing");
	  map.put("minnesota", "Saint Paul");
	  map.put("mississippi", "Jackson");
	  map.put("missouri", "Jefferson City");
	  map.put("montana", "Helena");
	  map.put("nebraska", "Lincoln");
	  map.put("nevada", "Carson City");
	  map.put("new hampshire", "Concord");
	  map.put("new jersey", "Trenton");
	  map.put("new york", "Albany");
	  map.put("new mexico", "Santa Fe");
	  map.put("north carolina", "Raleigh");
	  map.put("north dakota", "Bismarck");
	  map.put("ohio", "Columbus");
	  map.put("oklahoma", "Oklahoma City");
	  map.put("oregon", "Salem");
	  map.put("pennsylvania", "Harrisburg");
	  map.put("rhode island", "Providence");
	  map.put("south carolina", "Columbia");
	  map.put("south dakota", "Pierre");
	  map.put("tennessee", "Nashville");
	  map.put("texas", "Austin");
	  map.put("utah", "Salt Lake City");
	  map.put("vermont", "Montpelier");
	  map.put("virginia", "Richmond");
	  map.put("washington", "Olympia");
	  map.put("west Virginia", "Charleston");
	  map.put("wisconsin", "Madison");
	  map.put("wyoming", "Cheyenne");
	  
      // Prompt the user
      System.out.print("Enter a state to see its capital: ");
      String entry = input.nextLine();
      String state = entry.toLowerCase();
      
      if(map.containsKey(state) == true) {
    	    System.out.println(map.get(state));
      }
      else {
    	  System.out.println("Please enter a state.");
      }
  }
}