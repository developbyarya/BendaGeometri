
package bendageometri;
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Benda2D {

    /**
     * Default constructor
     */
    public Benda2D() {
    }

    /**
     * 
     */
    private float luas;

    /**
     * 
     */
    private float Keliling;

    /**
     * 
     */
    private String namaBenda;

    /**
     * 
     */
    private String warnaBenda;

    /**
     * @param warna 
     * @param namaBenda
     */
    public Benda2D(String warna, String namaBenda) {
        // TODO implement here
    }

    /**
     * @param params 
     * @return
     */
    public double menghitungLuas(double[] params) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param params 
     * @return
     */
    public double menghitungLuas(int[] params) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public float menghitungKeliling() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param params 
     * @return
     */
    public double menghitungKeliling(double[] params) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param params 
     * @return
     */
    public double menghitungKeliling(int[] params) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public void mencetakLuas() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public void mencetakKeliling() {
        // TODO implement here
    }

}