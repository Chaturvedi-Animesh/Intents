package com.chaturvediji.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText) findViewById(R.id.editText);
        bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myname=et.getText().toString();
                Toast.makeText(MainActivity.this,"Leaving First Activity",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",myname);
                startActivity((intent));
            }
        });
    }
}
