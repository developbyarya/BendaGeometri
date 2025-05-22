import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import BendaGeometri.*;

/**
 * Main application class for the Geometric Shapes calculator
 */
public class AplikasiGeometri {

	private JFrame mainFrame;
	private JPanel benda2DPanel;
	private JPanel benda3DPanel;

	/**
	 * Default constructor
	 */
	public AplikasiGeometri() {
		initializeUI();
	}

	/**
	 * Initialize the user interface
	 */
	private void initializeUI() {
		// Create main frame
		mainFrame = new JFrame("Aplikasi Geometri");
		mainFrame.setSize(800, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new BorderLayout());

		// Create main panel with scroll capability
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		// Create 2D shapes section
		JLabel benda2DLabel = new JLabel("Benda 2D");
		benda2DLabel.setFont(new Font("Arial", Font.BOLD, 20));
		benda2DLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPanel.add(benda2DLabel);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		
		// Create 2D shapes panel
		benda2DPanel = new JPanel();
		benda2DPanel.setLayout(new GridLayout(0, 3, 10, 10));
		
		// Add buttons for 2D shapes
		addBenda2DButtons();
		
		mainPanel.add(benda2DPanel);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		
		// Create 3D shapes section
		JLabel benda3DLabel = new JLabel("Benda 3D");
		benda3DLabel.setFont(new Font("Arial", Font.BOLD, 20));
		benda3DLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPanel.add(benda3DLabel);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		
		// Create 3D shapes panel
		benda3DPanel = new JPanel();
		benda3DPanel.setLayout(new GridLayout(0, 3, 10, 10));
		
		// Add buttons for 3D shapes
		addBenda3DButtons();
		
		mainPanel.add(benda3DPanel);
		
		// Add scroll pane
		JScrollPane scrollPane = new JScrollPane(mainPanel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		mainFrame.add(scrollPane, BorderLayout.CENTER);
		
		// Display the frame
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
	/**
	 * Add buttons for 2D shapes
	 */
	private void addBenda2DButtons() {
		// Create buttons for each 2D shape
		String[] benda2DNames = {
			"Segitiga", "Persegi", "Persegi Panjang", "Jajaran Genjang", 
			"Trapesium", "Belah Ketupat", "Layang-Layang", "Lingkaran", 
			"Tembereng Lingkaran", "Juring Lingkaran"
		};
		
		for (String name : benda2DNames) {
			JButton button = new JButton(name);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					openBenda2DWindow(name);
				}
			});
			benda2DPanel.add(button);
		}
	}
	
	/**
	 * Add buttons for 3D shapes
	 */
	private void addBenda3DButtons() {
		// Create buttons for each 3D shape
		String[] benda3DNames = {
			"Prisma Segitiga", "Limas Segitiga", "Prisma Persegi", "Limas Persegi",
			"Prisma Persegi Panjang", "Limas Persegi Panjang", "Prisma Jajaran Genjang",
			"Limas Jajaran Genjang", "Prisma Trapesium", "Limas Trapesium",
			"Prisma Belah Ketupat", "Limas Belah Ketupat", "Prisma Layang-Layang",
			"Limas Layang-Layang", "Tabung", "Kerucut", "Kerucut Terpancung",
			"Bola", "Tembereng Bola", "Juring Bola", "Cincin Bola"
		};
		
		for (String name : benda3DNames) {
			JButton button = new JButton(name);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					openBenda3DWindow(name);
				}
			});
			benda3DPanel.add(button);
		}
	}
	
	/**
	 * Open a window for a 2D shape
	 * @param shapeName The name of the shape
	 */
	private void openBenda2DWindow(String shapeName) {
		switch (shapeName) {
			case "Segitiga":
				new SegitigaWindow();
				break;
			case "Persegi":
				new PersegiWindow();
				break;
//			case "Persegi Panjang":
//				new PersegiPanjangWindow();
//				break;
//			case "Jajaran Genjang":
//				new JajaranGenjangWindow();
//				break;
//			case "Trapesium":
//				new TrapesiumWindow();
//				break;
//			case "Belah Ketupat":
//				new BelahKetupatWindow();
//				break;
//			case "Layang-Layang":
//				new LayangLayangWindow();
//				break;
//			case "Lingkaran":
//				new LingkaranWindow();
//				break;
//			case "Tembereng Lingkaran":
//				new TemberengLingkaranWindow();
//				break;
//			case "Juring Lingkaran":
//				new JuringLingkaranWindow();
//				break;
			default:
				JOptionPane.showMessageDialog(mainFrame, "Shape not implemented yet!");
		}
	}
	
	/**
	 * Open a window for a 3D shape
	 * @param shapeName The name of the shape
	 */
	private void openBenda3DWindow(String shapeName) {
		switch (shapeName) {
//			case "Prisma Segitiga":
//				new PrismaSegitigaWindow();
//				break;
//			case "Limas Segitiga":
//				new LimasSegitigaWindow();
//				break;
//			case "Prisma Persegi":
//				new PrismaPersegiWindow();
//				break;
//			case "Limas Persegi":
//				new LimasPersegiWindow();
//				break;
//			case "Prisma Persegi Panjang":
//				new PrismaPersegiPanjangWindow();
//				break;
//			case "Limas Persegi Panjang":
//				new LimasPersegiPanjangWindow();
//				break;
//			case "Prisma Jajaran Genjang":
//				new PrismaJajaranGenjangWindow();
//				break;
//			case "Limas Jajaran Genjang":
//				new LimasJajaranGenjangWindow();
//				break;
//			case "Prisma Trapesium":
//				new PrismaTrapesiumWindow();
//				break;
//			case "Limas Trapesium":
//				new LimasTrapesiumWindow();
//				break;
//			case "Prisma Belah Ketupat":
//				new PrismaBelahKetupatWindow();
//				break;
//			case "Limas Belah Ketupat":
//				new LimasBelahKetupatWindow();
//				break;
//			case "Prisma Layang-Layang":
//				new PrismaLayangLayangWindow();
//				break;
//			case "Limas Layang-Layang":
//				new LimasLayangLayangWindow();
//				break;
//			case "Tabung":
//				new TabungWindow();
//				break;
//			case "Kerucut":
//				new KerucutWindow();
//				break;
//			case "Kerucut Terpancung":
//				new KerucutTerpancungWindow();
//				break;
//			case "Bola":
//				new BolaWindow();
//				break;
//			case "Tembereng Bola":
//				new TemberengBolaWindow();
//				break;
//			case "Juring Bola":
//				new JuringBolaWindow();
//				break;
//			case "Cincin Bola":
//				new CincinBolaWindow();
//				break;
			default:
				JOptionPane.showMessageDialog(mainFrame, "Shape not implemented yet!");
		}
	}

	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String args[]) {
		// Set look and feel to system default
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Create application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new AplikasiGeometri();
			}
		});
	}
}