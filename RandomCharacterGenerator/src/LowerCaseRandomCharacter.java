import java.util.Scanner;

public class LowerCaseRandomCharacter {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the total number of characters: ");
			final int Number_of_Chars = input.nextInt();
			
			System.out.print("Enter the number of characters per line: ");
			final int Chars_Per_Line = input.nextInt();
			
			for (int i = 0; i < Number_of_Chars; i++) {
				char ch = RandomCharacter.getRandomLowerCaseLetter();
				if ((i+1) % Chars_Per_Line == 0)
					System.out.println(ch);
				else
					System.out.print(ch);
			}
		}

	}

}
