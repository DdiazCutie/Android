package com.isil.sesion11.entidades;

public class AlumnoInstituto extends Alumno {
    private double pc1,pc2, pc3, pc4;
    private double ep, ef;

    public AlumnoInstituto(long codigo, String nombre, String apellido, double pc1, double pc2, double pc3, double pc4, double ep, double ef) {
        super(codigo, nombre, apellido);
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.pc4 = pc4;
        this.ep = ep;
        this.ef = ef;
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

    @Override
    public double CalcularPromedio() {
        double promPC = (pc1+pc2+pc3+pc4)/4.0;
        return promPC*0.4+ep*0.25+ef*0.35;
    }

    @Override
    public String toString() {
        return "Alumno Instituto: "+super.toString();
    }

    @Override
    public String ObtenerDetalleCondicion() {
        return toString()+"\nCondición: "+((CalcularPromedio()>=12.5)?"APROBADO":"DESAPROBADO");
    }
}
