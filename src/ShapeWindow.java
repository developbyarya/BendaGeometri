import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Base window class for all shape windows
 */
public abstract class ShapeWindow {
    protected JFrame frame;
    protected JPanel mainPanel;
    protected JPanel inputPanel;
    protected JPanel buttonPanel;
    protected JPanel resultPanel;
    protected JLabel resultLabel;
    
    /**
     * Constructor
     * @param title Window title
     */
    public ShapeWindow(String title) {
        // Create frame
        frame = new JFrame(title);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Create main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        // Create input panel
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input Parameters"));
        
        // Create button panel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        // Create result panel
        resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Result"));
        
        resultLabel = new JLabel("Result will be displayed here");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        resultPanel.add(resultLabel, BorderLayout.CENTER);
        
        // Add panels to main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(resultPanel, BorderLayout.SOUTH);
        
        // Add main panel to frame
        frame.add(mainPanel);
        
        // Center frame on screen
        frame.setLocationRelativeTo(null);
        
        // Create input fields
        createInputFields();
        
        // Create buttons
        createButtons();
        
        // Display frame
        frame.setVisible(true);
    }
    
    /**
     * Create input fields
     */
    protected abstract void createInputFields();
    
    /**
     * Create buttons
     */
    protected abstract void createButtons();
    
    /**
     * Add an input field to the input panel
     * @param label Label text
     * @param field Input field
     */
    protected void addInputField(String label, JComponent field) {
        inputPanel.add(new JLabel(label + ":"));
        inputPanel.add(field);
    }
    
    /**
     * Display a result
     * @param result Result text
     */
    protected void showResult(String result) {
        resultLabel.setText(result);
    }
    
    /**
     * Display an error message
     * @param message Error message
     */
    protected void showError(String message) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Parse a double value from a text field
     * @param field Text field
     * @param fieldName Field name for error message
     * @return Parsed value
     * @throws NumberFormatException If the value cannot be parsed
     */
    protected double parseDoubleValue(JTextField field, String fieldName) throws NumberFormatException {
        String text = field.getText().trim();
        if (text.isEmpty()) {
            throw new NumberFormatException(fieldName + " cannot be empty");
        }
        return Double.parseDouble(text);
    }
} 