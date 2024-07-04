package ListItemTest;


import javax.swing.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ListTest_swing {

    // Declare components
    private JFrame frame;
    private JTextField textField;
    private JButton addButton, removeButton;
    private JList<String> itemList;
    private ArrayList<String> items;  // Store list items in an ArrayList

    public ListTest_swing() {
        // Create the main frame
        frame = new JFrame("Simple List Application");
        frame.setLayout(null);  // Disable the layout manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        textField = new JTextField();
        addButton = new JButton("Add Item");
        removeButton = new JButton("Remove Selected Item");

        // Create an ArrayList to store the items and initialize the JList
        items = new ArrayList<>();
        itemList = new JList<>();

        JScrollPane scrollPane = new JScrollPane(itemList);

        textField.setBounds(50, 20, 200, 30);
        addButton.setBounds(260, 20, 120, 30);
        removeButton.setBounds(50, 60, 200, 30);
        scrollPane.setBounds(50, 100, 330, 150);

        frame.add(textField);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(scrollPane);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String item = textField.getText().trim();
                if (!item.isEmpty()) {
                    items.add(item);
                    updateList();
                    textField.setText("");
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = itemList.getSelectedIndex();
                if (selectedIndex != -1) {
                    items.remove(selectedIndex);
                    updateList();
                }
            }
        });

        frame.setSize(450, 300);
        frame.setVisible(true);
    }

    private void updateList() {
        itemList.setListData(items.toArray(new String[0]));
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListTest_swing();
            }
        });
    }
}

