package com.example.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name=findViewById(R.id.name);
        final EditText password=findViewById(R.id.password);
        Button button=findViewById(R.id.button);
        final Intent intent= new Intent(this,Main2Activity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().equals("admin") &&
                        password.getText().equals("student")) {

                    Toast.makeText(MainActivity.this, "successful", Toast.LENGTH_LONG).show();
                    startActivity(intent);

                }
                else
                    {
                        Toast.makeText(MainActivity.this,"failed",Toast.LENGTH_LONG).show();




                }







            }

        });

    }
}
