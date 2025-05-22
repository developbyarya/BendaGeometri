import java.awt.event.*;
import javax.swing.*;
import BendaGeometri.Persegi;

/**
 * Window for Persegi (Square)
 */
public class PersegiWindow extends ShapeWindow {
    private JTextField sisiField;
    private JButton hitungLuasButton;
    private JButton hitungKelilingButton;
    
    /**
     * Constructor
     */
    public PersegiWindow() {
        super("Persegi (Square)");
    }
    
    /**
     * Create input fields
     */
    @Override
    protected void createInputFields() {
        sisiField = new JTextField();
        addInputField("Sisi", sisiField);
    }
    
    /**
     * Create buttons
     */
    @Override
    protected void createButtons() {
        hitungLuasButton = new JButton("Hitung Luas");
        hitungLuasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungLuas();
            }
        });
        
        hitungKelilingButton = new JButton("Hitung Keliling");
        hitungKelilingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungKeliling();
            }
        });
        
        buttonPanel.add(hitungLuasButton);
        buttonPanel.add(hitungKelilingButton);
    }
    
    /**
     * Calculate area
     */
    private void hitungLuas() {
        try {
            double sisi = parseDoubleValue(sisiField, "Sisi");
            
            Persegi persegi = new Persegi(sisi);
            double luas = persegi.menghitungLuas();
            
            showResult(String.format("Luas Persegi: %.2f", luas));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
    
    /**
     * Calculate perimeter
     */
    private void hitungKeliling() {
        try {
            double sisi = parseDoubleValue(sisiField, "Sisi");
            
            Persegi persegi = new Persegi(sisi);
            double keliling = persegi.menghitungKeliling();
            
            showResult(String.format("Keliling Persegi: %.2f", keliling));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
} 