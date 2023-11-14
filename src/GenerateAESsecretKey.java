import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class GenerateAESsecretKey {


    public static void main(String[] args) {

        try {
            // Choose the algorithm (e.g., AES)
            String algorithm = "AES";

            // Generate a key generator for the specified algorithm
            KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);

            // Generate a secret key
            SecretKey secretKey = keyGenerator.generateKey();

            // Print the encoded format of the secret key
            byte[] encodedKey = secretKey.getEncoded();
            System.out.println("Encoded Key: " + bytesToHex(encodedKey));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static String bytesToHex(byte[] bytes) {

        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%04X", b));
        }
        return result.toString();
    }

}

