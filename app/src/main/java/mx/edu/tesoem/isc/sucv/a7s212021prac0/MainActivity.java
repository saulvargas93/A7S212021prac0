package mx.edu.tesoem.isc.sucv.a7s212021prac0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnom = findViewById(R.id.editTextTextPersonName2);



    }

      public void saluda ( View v){

          Toast.makeText(Context this, text "BIENVENIDO" + txtnom.getText(),Toast.LENGTH_LONG).show();
    }


}

