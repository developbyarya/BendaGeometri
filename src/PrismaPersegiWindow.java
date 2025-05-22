import java.awt.event.*;
import javax.swing.*;
import BendaGeometri.*;

/**
 * Window for PrismaPersegi (Square Prism)
 */
public class PrismaPersegiWindow extends ShapeWindow {
    private JTextField sisiField;
    private JTextField tinggiField;
    private JButton hitungVolumeButton;
    private JButton hitungLuasPermukaanButton;
    
    /**
     * Constructor
     */
    public PrismaPersegiWindow() {
        super("Prisma Persegi (Square Prism)");
    }
    
    /**
     * Create input fields
     */
    @Override
    protected void createInputFields() {
        sisiField = new JTextField();
        addInputField("Sisi Alas", sisiField);
        
        tinggiField = new JTextField();
        addInputField("Tinggi Prisma", tinggiField);
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
            double sisi = parseDoubleValue(sisiField, "Sisi Alas");
            double tinggi = parseDoubleValue(tinggiField, "Tinggi Prisma");
            
            Persegi alas = new Persegi(sisi);
            PrismaPersegi prismaPersegi = new PrismaPersegi(alas, tinggi);
            
            double volume = prismaPersegi.menghitungVolume();
            
            showResult(String.format("Volume Prisma Persegi: %.2f", volume));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
    
    /**
     * Calculate surface area
     */
    private void hitungLuasPermukaan() {
        try {
            double sisi = parseDoubleValue(sisiField, "Sisi Alas");
            double tinggi = parseDoubleValue(tinggiField, "Tinggi Prisma");
            
            Persegi alas = new Persegi(sisi);
            PrismaPersegi prismaPersegi = new PrismaPersegi(alas, tinggi);
            
            double luasPermukaan = prismaPersegi.menghitungLuasPermukaan();
            
            showResult(String.format("Luas Permukaan Prisma Persegi: %.2f", luasPermukaan));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
} 