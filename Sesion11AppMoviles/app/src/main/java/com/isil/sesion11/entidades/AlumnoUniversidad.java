package com.isil.sesion11.entidades;

public class AlumnoUniversidad extends Alumno {
    private double pc1,pc2,pc3,pc4;
    private double ep, ef, pl;

    public AlumnoUniversidad(long codigo, String nombre, String apellido, double pc1, double pc2, double pc3, double pc4, double ep, double ef, double pl) {
        super(codigo, nombre, apellido);
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.pc4 = pc4;
        this.ep = ep;
        this.ef = ef;
        this.pl = pl;
    }

    public double getEp() {
        return ep;
    }

    public void setEp(double ep) {
        this.ep = ep;
    }

    public double getEf() {
        return ef;
    }

    public void setEf(double ef) {
        this.ef = ef;
    }

    public double getPl() {
        return pl;
    }

    public void setPl(double pl) {
        this.pl = pl;
    }

    @Override
    public double CalcularPromedio() {
        double promPC = (pc1+pc2+pc3+pc4)/4.0;
        return 0.4*promPC + 0.20*ep + 0.3*ef + 0.1*pl;
    }

    @Override
    public String toString() {
        return "Alumno Universidad: "+super.toString();
    }

    @Override
    public String ObtenerDetalleCondicion() {
        return toString()+"\nCondición: "+((CalcularPromedio()>=12)?"APROBADO":"DESAPROBADO");
    }
}
