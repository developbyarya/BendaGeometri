package BendaGeometri;

import java.io.*;
import java.util.*;

public class JuringLingkaran extends Lingkaran {

	private double sudut;

	public JuringLingkaran() {
		this.sudut = 0;
	}

	public JuringLingkaran(double radius, double sudut) {
		super(radius); 
		this.sudut = sudut;
	}

	public JuringLingkaran(int radius, int sudut) {
		super(radius);
		this.sudut = sudut;
	}

	public void cetakSudut() {
		System.out.println("Sudut juring: " + sudut + " derajat");
	}

	public void aturSudut(double sudut) {
		this.sudut = sudut;
	}

	public void aturSudut(int sudut) {
		this.sudut = sudut;
	}

	public double getSudut() {
		return sudut;
	}

	public double getRadius() {
		return super.getRadius();
	}

	@Override
	public float menghitungLuas() {
		double r = getRadius();
		return (float) ((sudut / 360.0) * Math.PI * r * r);
	}
	@Override
	public double menghitungLuas(double[] params) {
		if (params.length >= 2) {
			double r = params[0];
			double sudut = params[1];
			return (sudut / 360.0) * Math.PI * r * r;
		}
		return 0.0;
	}

	@Override
	public double menghitungLuas(int[] params) {
		if (params.length >= 2) {
			return menghitungLuas(new double[]{params[0], params[1]});
		}
		return 0.0;
	}

	@Override
	public float menghitungKeliling() {
		double r = getRadius();
		double kelilingBusur = 2 * Math.PI * r * (sudut / 360.0);
		return (float) (kelilingBusur + 2 * r);
	}

	@Override
	public double menghitungKeliling(double[] params) {
		if (params.length >= 2) {
			double r = params[0];
			double sudut = params[1];
			double busur = 2 * Math.PI * r * (sudut / 360.0);
			return busur + 2 * r;
		}
		return 0.0;
	}

	@Override
	public double menghitungKeliling(int[] params) {
		if (params.length >= 2) {
			return menghitungKeliling(new double[]{params[0], params[1]});
		}
		return 0.0;
	}

	@Override
	public void mencetakLuas() {
		System.out.printf("Luas Juring Lingkaran: %.2f\n", menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.printf("Keliling Juring Lingkaran: %.2f\n", menghitungKeliling());
	}
}
