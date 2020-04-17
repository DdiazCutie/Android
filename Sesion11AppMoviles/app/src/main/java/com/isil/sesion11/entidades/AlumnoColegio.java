package com.isil.sesion11.entidades;

public class AlumnoColegio extends Alumno {
    private double pc1, pc2, pc3, pc4;
    private double eb1, eb2, eb3, eb4;

    public AlumnoColegio(long codigo, String nombre, String apellido, double pc1, double pc2, double pc3, double pc4, double eb1, double eb2, double eb3, double eb4) {
        super(codigo, nombre, apellido);
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.pc4 = pc4;
        this.eb1 = eb1;
        this.eb2 = eb2;
        this.eb3 = eb3;
        this.eb4 = eb4;
    }


    @Override
    public double CalcularPromedio() {
        return 0.2*(pc1+pc2+pc3+pc4)/4.0 + 0.8*(eb1+eb2+eb3+eb4)/4.0;
    }

    @Override
    public String toString() {
        return "Alumno Colegio: "+super.toString();
    }

    @Override
    public String ObtenerDetalleCondicion() {
        return toString()+"\nCondición: "+((CalcularPromedio()>=11)?"APROBADO":"DESAPROBADO");
    }
}
