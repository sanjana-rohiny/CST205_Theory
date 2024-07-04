import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ChecksumCalculatorWithByteArrayOutputStream {
    public static void main(String[] args) {
        try {
            // Create a ByteArrayOutputStream to hold the file content
            ByteArrayOutputStream byteArrayOutputStream = readFileToByteArrayOutputStream("firmware.bin");

            // Calculate the checksum (SHA-256 in this example)
            byte[] checksum = calculateChecksum(byteArrayOutputStream);

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

    // Read a binary file into a ByteArrayOutputStream
    private static ByteArrayOutputStream readFileToByteArrayOutputStream(String filename) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            byteArrayOutputStream.write(buffer, 0, bytesRead);
        }

        fileInputStream.close();
        return byteArrayOutputStream;
    }

    // Calculate the SHA-256 checksum of the data in the ByteArrayOutputStream
    private static byte[] calculateChecksum(ByteArrayOutputStream byteArrayOutputStream) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(byteArrayOutputStream.toByteArray());
    }
}

