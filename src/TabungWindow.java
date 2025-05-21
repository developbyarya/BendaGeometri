import java.awt.event.*;
import javax.swing.*;
import BendaGeometri.*;

/**
 * Window for Tabung (Cylinder)
 */
public class TabungWindow extends ShapeWindow {
    private JTextField radiusField;
    private JTextField tinggiField;
    private JButton hitungVolumeButton;
    private JButton hitungLuasPermukaanButton;
    
    /**
     * Constructor
     */
    public TabungWindow() {
        super("Tabung (Cylinder)");
    }
    
    /**
     * Create input fields
     */
    @Override
    protected void createInputFields() {
        radiusField = new JTextField();
        addInputField("Radius", radiusField);
        
        tinggiField = new JTextField();
        addInputField("Tinggi", tinggiField);
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
            double tinggi = parseDoubleValue(tinggiField, "Tinggi");
            
            Tabung tabung = new Tabung(radius, tinggi);
            double volume = tabung.menghitungVolume();
            
            showResult(String.format("Volume Tabung: %.2f", volume));
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
            double tinggi = parseDoubleValue(tinggiField, "Tinggi");
            
            Tabung tabung = new Tabung(radius, tinggi);
            double luasPermukaan = tabung.menghitungLuasPermukaan();
            
            showResult(String.format("Luas Permukaan Tabung: %.2f", luasPermukaan));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
} 