package BendaGeometri;
import java.io.*;
import java.util.*;
public class BelahKetupat extends Benda2D {

	private double diagonal1;
	private double diagonal2;
	private double sisi;

	public BelahKetupat() {
		this.diagonal1 = 0;
		this.diagonal2 = 0;
		this.sisi = 0;
	}
	public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.sisi = sisi;
	}

	public BelahKetupat(int diagonal1, int diagonal2, int sisi) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.sisi = sisi;
	}

	public void cetakDiagonal1() {
		System.out.println("Diagonal 1: " + this.diagonal1);
	}

	public void cetakDiagonal2() {
		System.out.println("Diagonal 2: " + this.diagonal2);
	}

	public void cetakSisi() {
		System.out.println("Sisi: " + this.sisi);
	}

	public void aturDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public void aturDiagonal1(int diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public void aturDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public void aturDiagonal2(int diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public void aturSisi(double sisi) {
		this.sisi = sisi;
	}

	public void aturSisi(int sisi) {
		this.sisi = sisi;
	}
	public double getDiagonal1() {
		return diagonal1;
	}
	public double getDiagonal2() {
		return diagonal2;
	}
	public double getSisi() {
		return sisi;
	}

	@Override
	public float menghitungLuas() {
		return (float) ((diagonal1 * diagonal2) / 2);
	}

	@Override
	public double menghitungLuas(double[] params) {
		if (params.length >= 2) {
			return (params[0] * params[1]) / 2;
		}
		return 0.0;
	}

	@Override
	public double menghitungLuas(int[] params) {
		if (params.length >= 2) {
			return (params[0] * params[1]) / 2.0;
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
		System.out.println("Luas Belah Ketupat: " + menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.println("Keliling Belah Ketupat: " + menghitungKeliling());
	}
}
