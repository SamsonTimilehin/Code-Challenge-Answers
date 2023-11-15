import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class GenerateRSAsecretKey {

    public static void main(String[] args) {

        try {
            // Choose the algorithm (RSA)
            String algorithm = "RSA";

            // Generate a key pair generator for the specified algorithm
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);

            // Initialize the key pair generator with a key size (e.g., 2048 bits)
            keyPairGenerator.initialize(512);

            // Generate a key pair
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            // Get the private key
            java.security.PrivateKey privateKey = keyPair.getPrivate();

            // Print the encoded format of the private key
            byte[] encodedPrivateKey = privateKey.getEncoded();
            System.out.println("Encoded Private Key: " + bytesToHex(encodedPrivateKey));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }
}
