package com.example.user.primerappmovil;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.user.primerappmovil.R.id.editText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent =new Intent(this,DisplayMessageActivity.class);
        EditText editTex = (EditText)findViewById(editText);
        String message = editTex.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void VentanaImagen(View view){
        Intent intent =new Intent(this,DisplayImageActivity.class);
        //EditText editTex = (EditText)findViewById(editText);
        //String message = editTex.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
