package com.example.appclass1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   public int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador=0;
    }
    public void incrementa(View vista){
        contador++;
        resultado();
    }
    public void decrementa(View vista){
        contador--;
        resultado();

    }
    public void resetear(View vista){
       contador=0;
       resultado();
    }
    public void resultado(){
        TextView txtRslt= (TextView)findViewById(R.id.txtResultado);
        txtRslt.setText(" "+contador);

    }

    public void general(){

    }
}
