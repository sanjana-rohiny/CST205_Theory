

import java.awt.*;
import java.awt.event.*;

class MyButton extends Button {

    private TextField textField;

    public MyButton(String label, TextField textField) {
        super(label);
        this.textField = textField; 
    }

    @Override
    public boolean handleEvent(Event evt) {
    	

        if (evt.id == Event.ACTION_EVENT) {
            System.out.println("handleEvent() : event = " + evt.toString());

            textField.setText("HELLO WORLD ...!");
            return true;
        }
        return false; 
    }
}

public class HelloWorld_awt_inheritance {

    Frame frame;
    MyButton button, tbutton;
    TextField textField;

    HelloWorld_awt_inheritance() {
        frame = new Frame("Hello World Program");
        frame.setLayout(null);

        // Set the size of the frame
        frame.setSize(400, 200);
        frame.setVisible(true);

        // Initialize the TextField
        textField = new TextField();

        // Initialize the button by passing a reference of TextField to the button
        button = new MyButton("Click Me", textField);
        tbutton = new MyButton("Click Me", textField);

        // Position the GUI with (x, y, width, height)
        button.setBounds(50, 100, 100, 30);
        textField.setBounds(160, 100, 200, 30);
        tbutton.setBounds(50, 140, 100, 30);

        // Add components to the frame
        frame.add(button);
        frame.add(textField);
        frame.add(tbutton);

        // Add a window listener to handle window closing events
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Exit the application on window close
            }
        });
    }

    public static void main(String[] args) {
        HelloWorld_awt_inheritance test = new HelloWorld_awt_inheritance();
    }
}
