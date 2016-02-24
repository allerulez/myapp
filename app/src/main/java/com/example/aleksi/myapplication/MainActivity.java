package com.example.aleksi.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //EditText editText;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send = (Button) findViewById(R.id.button);
        /*
        ListView listView = (ListView) findViewById(R.id.listView);
        String[] names = {"Apa", "Blubb", "Crab"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(), "Click", Toast.LENGTH_SHORT);
                toast.show();
                view.setBackgroundColor(Color.BLUE);
            }
        });
        */
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
               String tempEdit = editText.getText().toString();

               textView.setText(tempEdit + "\n" + temp);
               //textView.append(editText.getText().toString()+ "\n");
               editText.setText("");
           }
           }
        });


    }
    public void toastThis() {
        Toast.makeText(this, "Please input something!", Toast.LENGTH_LONG).show();
    }


}
