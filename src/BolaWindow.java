import java.awt.event.*;
import javax.swing.*;
import BendaGeometri.*;

/**
 * Window for Bola (Sphere)
 */
public class BolaWindow extends ShapeWindow {
    private JTextField radiusField;
    private JButton hitungVolumeButton;
    private JButton hitungLuasPermukaanButton;
    
    /**
     * Constructor
     */
    public BolaWindow() {
        super("Bola (Sphere)");
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
        hitungVolumeButton = new JButton("Hitung Volume");
        hitungVolumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungVolume();
            }
        });
        
        hitungLuasPermukaanButton = new JButton("Hitung Luas Permukaan");
        hitungLuasPermukaanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungLuasPermukaan();
            }
        });
        
        buttonPanel.add(hitungVolumeButton);
        buttonPanel.add(hitungLuasPermukaanButton);
    }
    
    /**
     * Calculate volume
     */
    private void hitungVolume() {
        try {
            double radius = parseDoubleValue(radiusField, "Radius");
            
            Bola bola = new Bola(radius);
            double volume = bola.menghitungVolume();
            
            showResult(String.format("Volume Bola: %.2f", volume));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
    
    /**
     * Calculate surface area
     */
    private void hitungLuasPermukaan() {
        try {
            double radius = parseDoubleValue(radiusField, "Radius");
            
            Bola bola = new Bola(radius);
            double luasPermukaan = bola.menghitungLuasPermukaan();
            
            showResult(String.format("Luas Permukaan Bola: %.2f", luasPermukaan));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
} 