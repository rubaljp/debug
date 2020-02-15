package com.example.cinebud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void SignUpFunc(View view){
        EditText edUn=findViewById(R.id.edUn);
        String user=edUn.getText().toString();
        Intent intent =new Intent(MainActivity.this,SignUp.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Welcome "+user,Toast.LENGTH_SHORT).show();

    }
}
