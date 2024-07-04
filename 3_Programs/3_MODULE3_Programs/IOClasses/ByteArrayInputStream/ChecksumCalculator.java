import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ChecksumCalculator {
    public static void main(String[] args) {
        try {
            // Read the binary file into a byte array (in practice, this can be done more efficiently)
            byte[] fileData = readFileToByteArray("firmware.bin");

            // Create a ByteArrayInputStream from the byte array
            ByteArrayInputStream input = new ByteArrayInputStream(fileData);

            // Calculate the checksum (SHA-256 in this example)
            byte[] checksum = calculateChecksum(input);

            // Convert the checksum to a hexadecimal string for display
            StringBuilder hexChecksum = new StringBuilder();
            for (byte b : checksum) {
                hexChecksum.append(String.format("%02x", b));
            }

            System.out.println("Checksum (SHA-256): " + hexChecksum.toString());
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    // Read a binary file into a byte array
    private static byte[] readFileToByteArray(String filename) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        byte[] data = new byte[fileInputStream.available()];
        fileInputStream.read(data);
        fileInputStream.close();
        return data;
    }

    // Calculate the SHA-256 checksum of the data
    private static byte[] calculateChecksum(ByteArrayInputStream input) throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = input.read(buffer)) != -1) {
            md.update(buffer, 0, bytesRead);
        }

        return md.digest();
    }
}

