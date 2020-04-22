package com.clicks.yogi.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText editText1,editText2;
    String Transfer1,Transfer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.edt1);
        editText2 = (EditText)findViewById(R.id.edt2);
        button1 = (Button)findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                Transfer1 = editText1.getText().toString();
                intent.putExtra("Value1",Transfer1);
                Transfer2 = editText2.getText().toString();
                intent.putExtra("Value2",Transfer2);
                startActivity(intent);
            }
        });
    }
}