import java.util.Random;

public class CharacterCounter {

    public static void main(String[] args) {
        // Generate 100 random lowercase letters
        char[] charactersArray = generateRandomCharacters(100);

        // Count the occurrence of each character
        int[] characterCount = countCharacters(charactersArray);

        // Display the character counts
        displayCharacterCounts(characterCount);
    }

    // Generating an array of random lowercase letters
    private static char[] generateRandomCharacters(int size) {
        char[] characters = new char[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // ASCII values
            characters[i] = (char) (random.nextInt(26) + 'a');
        }

        return characters;
    }

    // Counting the occurrence of each character
    private static int[] countCharacters(char[] characters) {
        int[] characterCount = new int[26]; 
        // Assuming only lowercase letters

        for (char character : characters) {
            // Increment the count for the correct character
            characterCount[character - 'a']++;
        }

        return characterCount;
    }

    // Displaying the character count
    private static void displayCharacterCounts(int[] characterCount) {
        for (int i = 0; i < 26; i++) {
            char character = (char) (i + 'a');
            System.out.println(character + ": " + characterCount[i]);
        }
    }
}