package com.example.ac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class MainActivity extends AppCompatActivity {
MultiAutoCompleteTextView autoCompleteTextView;
TextView textView;
String[] Names={"Sobirjon","MUstafo","Abror","Asilbek","Bobohon","Murot","Amirbek","SayidMuhammad","Muhammad","Artur","Vladimer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        textView=findViewById(R.id.text);


        StringBuilder edittext=new StringBuilder();
        edittext.append("Qiymat kiriting").append("\n");

        for (String value:Names){

            edittext.append(value).append(",");

        }
        textView.setText(edittext);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Names);

        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);
        //
        autoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}