package BendaGeometri;
import java.io.*;
import java.util.*;
public class Persegi extends Benda2D {

	private double sisi;

	public Persegi() {
		this.sisi = 0;
	}

	public Persegi(double sisi) {
		this.sisi = sisi;
	}

	public Persegi(int sisi) {
		this.sisi = sisi;
	}

	public void cetakSisi() {
		System.out.println("Sisi: " + this.sisi);
	}

	public void aturSisi(double sisi) {
		this.sisi = sisi;
	}

	public void aturSisi(int sisi) {
		this.sisi = sisi;
	}
	public double getSisi() {
        return sisi;
    }

	@Override
	public float menghitungLuas() {
		return (float) (this.sisi * this.sisi);
	}

	public double menghitungLuas(double sisi) {
		return sisi * sisi;
	}

	public double menghitungLuas(int sisi) {
		if (params.length >= 1) {
			return params[0] * params[0];
		}
		return 0.0;
	}

	@Override
	public float menghitungKeliling() {
		return (float) (4 * this.sisi);
	}

	@Override
	public double menghitungKeliling(double[] params) {
		if (params.length >= 1) {
			return 4 * params[0];
		}
		return 0.0;
	}

	@Override
	public double menghitungKeliling(int[] params) {
		if (params.length >= 1) {
			return 4 * params[0];
		}
		return 0.0;
	}

	@Override
	public void mencetakLuas() {
		System.out.println("Luas Persegi: " + menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.println("Keliling Persegi: " + menghitungKeliling());
	}
}
