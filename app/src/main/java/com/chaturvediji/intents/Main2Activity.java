package com.chaturvediji.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView);

        Bundle myBundle=getIntent().getExtras();
        if(myBundle!=null){
            String myecho=myBundle.getString("name");
        Toast.makeText(Main2Activity.this,"Second Activity",Toast.LENGTH_LONG).show();
            tv.setText(myecho);
        }
//        String name=getIntent().getStringExtra("name");
//        tv.setText(name);
//        Toast.makeText(Main2Activity.this,"Second Activity",Toast.LENGTH_LONG).show();
    }
}
