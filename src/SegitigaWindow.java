import java.awt.event.*;
import javax.swing.*;
import BendaGeometri.Segitiga;

/**
 * Window for Segitiga (Triangle)
 */
public class SegitigaWindow extends ShapeWindow {
    private JTextField alasField;
    private JTextField tinggiField;
    private JTextField sisiMiring1Field;
    private JTextField sisiMiring2Field;
    private JButton hitungLuasButton;
    private JButton hitungKelilingButton;
    
    /**
     * Constructor
     */
    public SegitigaWindow() {
        super("Segitiga (Triangle)");
    }
    
    /**
     * Create input fields
     */
    @Override
    protected void createInputFields() {
        alasField = new JTextField();
        addInputField("Alas", alasField);
        
        tinggiField = new JTextField();
        addInputField("Tinggi", tinggiField);
        
        sisiMiring1Field = new JTextField();
        addInputField("Sisi Miring 1", sisiMiring1Field);
        
        sisiMiring2Field = new JTextField();
        addInputField("Sisi Miring 2", sisiMiring2Field);
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
            double alas = parseDoubleValue(alasField, "Alas");
            double tinggi = parseDoubleValue(tinggiField, "Tinggi");
            
            Segitiga segitiga = new Segitiga();
            segitiga.aturAlas(alas);
            segitiga.aturTinggi(tinggi);
            
            double luas = segitiga.menghitungLuas();
            
            showResult(String.format("Luas Segitiga: %.2f", luas));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
    
    /**
     * Calculate perimeter
     */
    private void hitungKeliling() {
        try {
            double alas = parseDoubleValue(alasField, "Alas");
            double sisiMiring1 = parseDoubleValue(sisiMiring1Field, "Sisi Miring 1");
            double sisiMiring2 = parseDoubleValue(sisiMiring2Field, "Sisi Miring 2");
            
            Segitiga segitiga = new Segitiga();
            segitiga.aturAlas(alas);
            segitiga.aturSisiMiring1(sisiMiring1);
            segitiga.aturSisiMiring2(sisiMiring2);
            
            double keliling = segitiga.menghitungKeliling();
            
            showResult(String.format("Keliling Segitiga: %.2f", keliling));
        } catch (NumberFormatException e) {
            showError(e.getMessage());
        }
    }
} 