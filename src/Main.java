import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a movie character");
		String character = in.nextLine();
		
		System.out.println("Enter a noun");
		String noun = in.nextLine();
		
		System.out.println("Enter an emotion(not past term)");
		String emotion = in.nextLine();
		
		System.out.println("Enter a number that is more than one");
		String number = in.nextLine();

		
		System.out.println("Enter an animal that is plural");
		String animal = in.nextLine();
		
		System.out.println("Enter a food");
		String food = in.nextLine();
		
		System.out.println("Enter a verb ending with ing");
		String verb = in.nextLine();
		
		System.out.println("Enter a famous building");
		String building = in.nextLine();
		
		System.out.println("Enter a size adjective");
		String size = in.nextLine();
		
		System.out.println("Enter a transportation");
		String transportation = in.nextLine();
		
		System.out.println("Enter a second noun");
		String noun2 = in.nextLine();
		
		System.out.println("Ready to see your results?");
		in.nextLine();
		
		System.out.print("While watching a movie, ");
		System.out.print(character);
		System.out.print(" finds the ");
		System.out.print(noun);
		System.out.print(", directed by Mai-Lee , I realize that it is a ");
		System.out.println(emotion + " movie. ");
		System.out.print(character + " is being chased by ");
		System.out.print(number);
		System.out.print(" ");
		System.out.print(animal);
		System.out.println(" that eats " + food + ". ");
		System.out.print(character + " keeps " + verb);
		System.out.print(" untill they find a " + building);
		System.out.println(". ");
		System.out.print("They go inside and try to hide from the " + animal); 
		System.out.println(". ");
		System.out.print("The " + animal);
		System.out.print(" goes away and ");
		System.out.println(character + " wanders off and soon discovers the best thing in the world. ");
		System.out.println("A " + size + " " + noun + ". ");
		System.out.print("After picking it up they go outside to find a " + transportation);
		System.out.println(". ");
		System.out.print(character + " gets on and goes back to their home, " + noun2);
		System.out.println(" land.");
		System.out.print("The End.");
		
		
		
		
		
		
		/*Story
		 While watching a movie,(name)finds the (noun), I realize it is a 
		 (emotion). (name) is being chased by(number)(animal) that eats (food. (name)keeps (verb)away until they find a (famous Building)
		 They go inside and try to hide from the (animal). The (animal) goes away and (name) decides to wander around. They soon discover the best thing in the world.
		 A (size) (noun). After picking it up they go outside to find a (transportation. They get on and go back to their home, (noun2) land. The End. 
		*/
		
		
	}

}
