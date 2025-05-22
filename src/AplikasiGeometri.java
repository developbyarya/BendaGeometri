import java.util.Scanner;
import BendaGeometri.*;

/**
 * Main application class for the Geometric Shapes calculator
 */
public class AplikasiGeometri {

	private Scanner scanner;
	private boolean running;

	/**
	 * Default constructor
	 */
	public AplikasiGeometri() {
		scanner = new Scanner(System.in);
		running = true;
		run();
	}

	/**
	 * Run the application
	 */
	private void run() {
		while (running) {
			displayMainMenu();
			int choice = getMenuChoice();
			
			switch (choice) {
				case 1:
					displayBenda2DMenu();
					break;
				case 2:
					displayBenda3DMenu();
					break;
				case 0:
					running = false;
					System.out.println("Terima kasih telah menggunakan Aplikasi Geometri!");
					break;
				default:
					System.out.println("Pilihan tidak valid, silakan coba lagi.");
			}
		}
		scanner.close();
	}
	
	/**
	 * Display the main menu
	 */
	private void displayMainMenu() {
		System.out.println("\n===== APLIKASI GEOMETRI =====");
		System.out.println("1. Benda 2D");
		System.out.println("2. Benda 3D");
		System.out.println("0. Keluar");
		System.out.print("Pilihan anda: ");
	}
	
	/**
	 * Display the 2D shapes menu
	 */
	private void displayBenda2DMenu() {
		boolean inSubmenu = true;
		
		while (inSubmenu) {
			System.out.println("\n===== BENDA 2D =====");
			System.out.println("1. Segitiga");
			System.out.println("2. Persegi");
			System.out.println("3. Persegi Panjang");
			System.out.println("4. Jajaran Genjang");
			System.out.println("5. Trapesium");
			System.out.println("6. Belah Ketupat");
			System.out.println("7. Layang-Layang");
			System.out.println("8. Lingkaran");
			System.out.println("9. Tembereng Lingkaran");
			System.out.println("10. Juring Lingkaran");
			System.out.println("0. Kembali ke Menu Utama");
			System.out.print("Pilihan anda: ");
			
			int choice = getMenuChoice();
			
			if (choice == 0) {
				inSubmenu = false;
			} else {
				processBenda2DChoice(choice);
			}
		}
	}
	
	/**
	 * Display the 3D shapes menu
	 */
	private void displayBenda3DMenu() {
		boolean inSubmenu = true;
		
		while (inSubmenu) {
			System.out.println("\n===== BENDA 3D =====");
			System.out.println("1. Prisma Segitiga");
			System.out.println("2. Limas Segitiga");
			System.out.println("3. Prisma Persegi");
			System.out.println("4. Limas Persegi");
			System.out.println("5. Prisma Persegi Panjang");
			System.out.println("6. Limas Persegi Panjang");
			System.out.println("7. Prisma Jajaran Genjang");
			System.out.println("8. Limas Jajaran Genjang");
			System.out.println("9. Prisma Trapesium");
			System.out.println("10. Limas Trapesium");
			System.out.println("11. Prisma Belah Ketupat");
			System.out.println("12. Limas Belah Ketupat");
			System.out.println("13. Prisma Layang-Layang");
			System.out.println("14. Limas Layang-Layang");
			System.out.println("15. Tabung");
			System.out.println("16. Kerucut");
			System.out.println("17. Kerucut Terpancung");
			System.out.println("18. Bola");
			System.out.println("19. Tembereng Bola");
			System.out.println("20. Juring Bola");
			System.out.println("21. Cincin Bola");
			System.out.println("0. Kembali ke Menu Utama");
			System.out.print("Pilihan anda: ");
			
			int choice = getMenuChoice();
			
			if (choice == 0) {
				inSubmenu = false;
			} else {
				processBenda3DChoice(choice);
			}
		}
	}
	
	/**
	 * Get the user's menu choice
	 * @return The menu choice as an integer
	 */
	private int getMenuChoice() {
		try {
			return Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			return -1; // Invalid choice
		}
	}
	
	/**
	 * Process the 2D shape choice
	 * @param choice The menu choice
	 */
	private void processBenda2DChoice(int choice) {
		switch (choice) {
			case 1:
				handleSegitiga();
				break;
			case 2:
				handlePersegi();
				break;
			case 3:
				System.out.println("Persegi Panjang belum diimplementasikan!");
				break;
			case 4:
				System.out.println("Jajaran Genjang belum diimplementasikan!");
				break;
			case 5:
				System.out.println("Trapesium belum diimplementasikan!");
				break;
			case 6:
				System.out.println("Belah Ketupat belum diimplementasikan!");
				break;
			case 7:
				System.out.println("Layang-Layang belum diimplementasikan!");
				break;
			case 8:
				System.out.println("Lingkaran belum diimplementasikan!");
				break;
			case 9:
				System.out.println("Tembereng Lingkaran belum diimplementasikan!");
				break;
			case 10:
				System.out.println("Juring Lingkaran belum diimplementasikan!");
				break;
			default:
				System.out.println("Pilihan tidak valid, silakan coba lagi.");
		}
		
		// Wait for user to press Enter before returning to menu
		System.out.println("\nTekan Enter untuk melanjutkan...");
		scanner.nextLine();
	}
	
	/**
	 * Process the 3D shape choice
	 * @param choice The menu choice
	 */
	private void processBenda3DChoice(int choice) {
		switch (choice) {
			case 1:
				System.out.println("Prisma Segitiga belum diimplementasikan!");
				break;
			case 2:
				System.out.println("Limas Segitiga belum diimplementasikan!");
				break;
			case 3:
				System.out.println("Prisma Persegi belum diimplementasikan!");
				break;
			case 4:
				System.out.println("Limas Persegi belum diimplementasikan!");
				break;
			case 5:
				System.out.println("Prisma Persegi Panjang belum diimplementasikan!");
				break;
			case 6:
				System.out.println("Limas Persegi Panjang belum diimplementasikan!");
				break;
			case 7:
				System.out.println("Prisma Jajaran Genjang belum diimplementasikan!");
				break;
			case 8:
				System.out.println("Limas Jajaran Genjang belum diimplementasikan!");
				break;
			case 9:
				System.out.println("Prisma Trapesium belum diimplementasikan!");
				break;
			case 10:
				System.out.println("Limas Trapesium belum diimplementasikan!");
				break;
			case 11:
				System.out.println("Prisma Belah Ketupat belum diimplementasikan!");
				break;
			case 12:
				System.out.println("Limas Belah Ketupat belum diimplementasikan!");
				break;
			case 13:
				System.out.println("Prisma Layang-Layang belum diimplementasikan!");
				break;
			case 14:
				System.out.println("Limas Layang-Layang belum diimplementasikan!");
				break;
			case 15:
				System.out.println("Tabung belum diimplementasikan!");
				break;
			case 16:
				System.out.println("Kerucut belum diimplementasikan!");
				break;
			case 17:
				System.out.println("Kerucut Terpancung belum diimplementasikan!");
				break;
			case 18:
				System.out.println("Bola belum diimplementasikan!");
				break;
			case 19:
				System.out.println("Tembereng Bola belum diimplementasikan!");
				break;
			case 20:
				System.out.println("Juring Bola belum diimplementasikan!");
				break;
			case 21:
				System.out.println("Cincin Bola belum diimplementasikan!");
				break;
			default:
				System.out.println("Pilihan tidak valid, silakan coba lagi.");
		}
		
		// Wait for user to press Enter before returning to menu
		System.out.println("\nTekan Enter untuk melanjutkan...");
		scanner.nextLine();
	}
	
	/**
	 * Handle Segitiga calculations
	 */
	private void handleSegitiga() {
		System.out.println("\n===== SEGITIGA =====");
		
		try {
			System.out.print("Masukkan panjang sisi a: ");
			double sisiA = Double.parseDouble(scanner.nextLine());
			
			System.out.print("Masukkan panjang sisi b: ");
			double sisiB = Double.parseDouble(scanner.nextLine());
			
			System.out.print("Masukkan panjang sisi c: ");
			double sisiC = Double.parseDouble(scanner.nextLine());
			
			System.out.print("Masukkan tinggi: ");
			double tinggi = Double.parseDouble(scanner.nextLine());
			
			// Calculate area and perimeter
			double keliling = sisiA + sisiB + sisiC;
			double luas = 0.5 * sisiA * tinggi;
			
			System.out.println("\nHasil Perhitungan:");
			System.out.println("Keliling Segitiga: " + keliling);
			System.out.println("Luas Segitiga: " + luas);
			
		} catch (NumberFormatException e) {
			System.out.println("Input tidak valid! Masukkan angka yang benar.");
		}
	}
	
	/**
	 * Handle Persegi calculations
	 */
	private void handlePersegi() {
		System.out.println("\n===== PERSEGI =====");
		
		try {
			System.out.print("Masukkan panjang sisi: ");
			double sisi = Double.parseDouble(scanner.nextLine());
			
			// Calculate area and perimeter
			double keliling = 4 * sisi;
			double luas = sisi * sisi;
			
			System.out.println("\nHasil Perhitungan:");
			System.out.println("Keliling Persegi: " + keliling);
			System.out.println("Luas Persegi: " + luas);
			
		} catch (NumberFormatException e) {
			System.out.println("Input tidak valid! Masukkan angka yang benar.");
		}
	}

	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String args[]) {
		new AplikasiGeometri();
	}
}