import java.awt.event.*;
import javax.swing.*;
import BendaGeometri.Lingkaran;

/**
 * Window for Lingkaran (Circle)
 */
public class LingkaranWindow extends ShapeWindow {
    private JTextField radiusField;
    private JButton hitungLuasButton;
    private JButton hitungKelilingButton;
    
    /**
     * Constructor
     */
    public LingkaranWindow() {
        super("Lingkaran (Circle)");
    }
    
    /**
     * Create input fields
     */
    @Override
    protected void createInputFields() {
        radiusField = new JTextField();
        addInputField("Radius", radiusField);
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
            double radius = parseDoubleValue(radiusField, "Radius");
            
            Lingkaran lingkaran = new Lingkaran(radius);
            double luas = lingkaran.menghitungLuas();
            
            showResult(String.format("Luas Lingkaran: %.2f", luas));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
    
    /**
     * Calculate perimeter
     */
    private void hitungKeliling() {
        try {
            double radius = parseDoubleValue(radiusField, "Radius");
            
            Lingkaran lingkaran = new Lingkaran(radius);
            double keliling = lingkaran.menghitungKeliling();
            
            showResult(String.format("Keliling Lingkaran: %.2f", keliling));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
} 