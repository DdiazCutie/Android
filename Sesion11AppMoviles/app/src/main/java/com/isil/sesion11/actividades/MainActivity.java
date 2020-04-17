package com.isil.sesion11.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.isil.sesion11.R;
import com.isil.sesion11.entidades.Alumno;
import com.isil.sesion11.entidades.AlumnoColegio;
import com.isil.sesion11.entidades.AlumnoInstituto;
import com.isil.sesion11.entidades.AlumnoUniversidad;
import com.isil.sesion11.entidades.Calificable;
import com.isil.sesion11.entidades.ClienteCertificacion;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvResult = findViewById(R.id.tvResult);

        AlumnoColegio alumnito = new AlumnoColegio(101, "Pedrito", "Bravo",
                20, 18, 0, 19, 15, 18.5, 13, 05);

        AlumnoInstituto alumnoISIL = new AlumnoInstituto(201217379, "Juan",
                "Perez", 9, 13, 17, 18, 10, 18);

        AlumnoUniversidad alumnoUniv = new AlumnoUniversidad(20072583, "Carla",
                "Arequipa", 0, 5, 7 ,9, 18, 20, 10);

        ClienteCertificacion cert = new ClienteCertificacion("Android Studio",
                "Carlos", "Moquegua", 521, 97);

        Alumno alumno = new AlumnoInstituto(543, "María", "Ramos",
                15,16,17,18, 14,18);

        String resultados = MostrarResultados(cert);
        tvResult.setText(resultados);
    }

    public String MostrarResultados(Calificable calificable){
        return "RESULTADOS FINALES: \n"+
                calificable.ObtenerDetalleCondicion();
    }
}
