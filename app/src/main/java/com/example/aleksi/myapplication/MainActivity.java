package com.example.aleksi.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //EditText editText;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send = (Button) findViewById(R.id.button);
        send.setOnClickListener(new View.OnClickListener() {
       @Override
        public void onClick(View v) {
               //do_click();
           EditText editText = (EditText) findViewById(R.id.editText);
           TextView textView = (TextView) findViewById(R.id.textView);
           if (editText.getText().toString().length() < 1){
               toastThis();
           } else {
               String temp = textView.getText().toString();
               textView.setText(editText.getText().toString() + "\n" + temp);
               //textView.append(editText.getText().toString()+ "\n");
               editText.setText("");
           }
           }
        });


    }
    public void toastThis() {
        Toast.makeText(this, "Please input something!", Toast.LENGTH_LONG).show();
    }


/*    public void do_click() {
        TextView textView;
        String temp_str = textView.getText();
        textView.text.append(editText.getText().toString());

    }*/
}
