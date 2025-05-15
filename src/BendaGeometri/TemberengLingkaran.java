package BendaGeometri;

import java.io.*;
import java.util.*;

public class TemberengLingkaran extends JuringLingkaran {

	private double sudut;

	public TemberengLingkaran() {
		this.sudut = 0;
	}

	public TemberengLingkaran(double radius, double sudut) {
		super(radius, sudut);
		this.sudut = sudut;
	}

	public TemberengLingkaran(int radius, int sudut) {
		super(radius, sudut);
		this.sudut = sudut;
	}

	public void cetakSudut() {
		System.out.println("Sudut: " + sudut + " derajat");
	}

	public void aturSudut(double sudut) {
		this.sudut = sudut;
	}

	public void aturSudut(int sudut) {
		this.sudut = sudut;
	}

	private double hitungLuasSegitigaDariSudut(double radius, double sudutDerajat) {
		return Segitiga.menghitungLuasDuaSisiSudut(radius, radius, sudutDerajat);
	}

	@Override
	public float menghitungLuas() {
		double radius = getRadius();
		double luasJuring = (sudut / 360.0) * Math.PI * radius * radius;
		double luasSegitiga = hitungLuasSegitigaDariSudut(radius, sudut);
		return (float) (luasJuring - luasSegitiga);
	}

	@Override
	public double menghitungLuas(double[] params) {
		if (params.length >= 2) {
			double radius = params[0];
			double sudut = params[1];
			double luasJuring = (sudut / 360.0) * Math.PI * radius * radius;
			double luasSegitiga = 0.5 * radius * radius * Math.sin(Math.toRadians(sudut));
			return luasJuring - luasSegitiga;
		}
		return 0.0;
	}

	@Override
	public double menghitungLuas(int[] params) {
		if (params.length >= 2) {
			return menghitungLuas(new double[] { params[0], params[1] });
		}
		return 0.0;
	}

	@Override
	public float menghitungKeliling() {
		double radius = getRadius();
		double busur = 2 * Math.PI * radius * (sudut / 360.0);
		double chord = 2 * radius * Math.sin(Math.toRadians(sudut / 2.0));
		return (float) (busur + chord);
	}

	@Override
	public double menghitungKeliling(double[] params) {
		if (params.length >= 2) {
			double r = params[0];
			double s = params[1];
			double busur = 2 * Math.PI * r * (s / 360.0);
			double chord = 2 * r * Math.sin(Math.toRadians(s / 2.0));
			return busur + chord;
		}
		return 0.0;
	}

	@Override
	public double menghitungKeliling(int[] params) {
		if (params.length >= 2) {
			return menghitungKeliling(new double[] { params[0], params[1] });
		}
		return 0.0;
	}

	@Override
	public void mencetakLuas() {
		System.out.printf("Luas Tembereng Lingkaran: %.2f\n", menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.printf("Keliling Tembereng Lingkaran: %.2f\n", menghitungKeliling());
	}
}
