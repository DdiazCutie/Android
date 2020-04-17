package com.isil.ejemploswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        tvResult = findViewById(R.id.tvResult);
    }

    public void Mostrar(View v){
        //Toast.makeText(this, "ID: "+v.getId(), Toast.LENGTH_SHORT).show();
        int selected = radioGroup.getCheckedRadioButtonId();

        switch (selected){
            case R.id.rb1:
                tvResult.setText("Playstation Code: PS10177A");
                break;
            case R.id.rb2:
                tvResult.setText("Nintendo Switch Code: NS12288B");
                break;
            case R.id.rb3:
                tvResult.setText("Xbox One Code: XBW10077X");
                break;
            case R.id.rb4:
                tvResult.setText("Nvidia Shield Code: NVS55098J");
                break;
            case R.id.rb5:
                tvResult.setText("Dreamcast Code: DC20076W");
                break;
            default:
                tvResult.setText("Debe seleccionar una opción");
        }
    }
}
