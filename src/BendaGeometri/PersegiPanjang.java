package BendaGeometri;
import java.io.*;
import java.util.*;
public class PersegiPanjang extends Benda2D {

	private double panjang;
	private double lebar;

	public PersegiPanjang() {
		this.panjang = 0;
		this.lebar = 0;
	}

	public PersegiPanjang(double panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public PersegiPanjang(int panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public PersegiPanjang(double panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public PersegiPanjang(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public void cetakPanjang() {
		System.out.println("Panjang: " + this.panjang);
	}

	public void cetakLebar() {
		System.out.println("Lebar: " + this.lebar);
	}

	public void aturPanjang(double panjang) {
		this.panjang = panjang;
	}

	public void aturPanjang(int panjang) {
		this.panjang = panjang;
	}

	public void aturLebar(double lebar) {
		this.lebar = lebar;
	}

	public void aturLebar(int lebar) {
		this.lebar = lebar;
	}
	public double getPanjang() {
		return panjang;
	}
	public double getLebar() {
		return lebar;
	}
	@Override
	public float menghitungLuas() {
		return (float)(this.panjang * this.lebar);
	}

	@Override
	public double menghitungLuas(double[] params) {
		if (params.length >= 2) {
			return params[0] * params[1];
		}
		return 0.0;
	}

	@Override
	public double menghitungLuas(int[] params) {
		if (params.length >= 2) {
			return params[0] * params[1];
		}
		return 0.0;
	}

	@Override
	public float menghitungKeliling() {
		return (float)(2 * (this.panjang + this.lebar));
	}

	@Override
	public double menghitungKeliling(double[] params) {
		if (params.length >= 2) {
			return 2 * (params[0] + params[1]);
		}
		return 0.0;
	}

	@Override
	public double menghitungKeliling(int[] params) {
		if (params.length >= 2) {
			return 2 * (params[0] + params[1]);
		}
		return 0.0;
	}

	@Override
	public void mencetakLuas() {
        System.out.printf("Luas Persegi Panjang: %.2f\n", menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
        System.out.printf("Keliling Persegi Panjang: %.2f\n", menghitungKeliling());
	}
}
