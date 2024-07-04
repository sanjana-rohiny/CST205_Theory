package opaque_transparent;

import java.awt.*;
import java.lang.reflect.Method;

public class AWTTest {
    public static void main(String[] args) {
    	Frame frame = new Frame("Transparent AWT Example");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame

        // Making the frame translucent
        try {
            Class<?> awtUtilitiesClass = Class.forName("com.sun.awt.AWTUtilities");
            Method setWindowOpacity = awtUtilitiesClass.getMethod("setWindowOpacity", Window.class, float.class);
            setWindowOpacity.invoke(null, frame, 0.7f); // Set transparency level (0.0f to 1.0f)
        } catch (Exception e) {
            //e.printStackTrace();
        }

        frame.setVisible(true);
    }
}

