package com.programacion.movil.estemanp.proyectobase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText number_in;
    Button submit;
    TextView result;
    String message_result = "";
    int attempts = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number_in = (EditText) findViewById(R.id.number_in);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);
        result = (TextView) findViewById(R.id.result);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit:
            int data = Integer.parseInt(number_in.getText().toString() );
            int random = (int) ( Math.random()*10 + 1);
            attempts ++;
            if(data == random){
                message_result = "El número ganador fue: "+random+ ". Felicitaciones, has acertado. \nIntentos: "+attempts;
            }else{
                message_result = "Lo siento, sigue intentando. "+"El número ganador fue: "+random+ ". \nIntentos: "+attempts;
            }
            result.setText(message_result);
            break;
        }
    }
}