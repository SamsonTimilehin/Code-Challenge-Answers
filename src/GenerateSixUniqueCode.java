import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

public class GenerateSixUniqueCode {




    public static void main(String[] args) throws NoSuchAlgorithmException {
        String generatedCode = generateRandomCode();
        System.out.println("Generated code: " + generatedCode);

        UUID uuid = UUID.randomUUID();
        String sixDigitCode = uuid.toString().substring(24, 30);
        System.out.println("Generated 6-digit code: " + sixDigitCode);

    }


    public static String generateRandomCode() throws NoSuchAlgorithmException {
            String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String NUMBERS = "0123456789";
            SecureRandom random = new SecureRandom();
            StringBuilder code = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                char randomChar = ALPHABET.charAt(random.nextInt(ALPHABET.length()));
                code.append(randomChar);
            }

            for (int i = 0; i < 3; i++) {
                char randomDigit = NUMBERS.charAt(random.nextInt(NUMBERS.length()));
                code.append(randomDigit);
            }

        return shuffleString(code.toString());
        }

        private static String shuffleString(String input) throws NoSuchAlgorithmException {
            char[] characters = input.toCharArray();
            for (int i = characters.length - 1; i > 0; i--) {
                int randomIndex = SecureRandom.getInstanceStrong().nextInt(i + 1);
                char temp = characters[i];
                characters[i] = characters[randomIndex];
                characters[randomIndex] = temp;
            }
            return new String(characters);
        }
}
