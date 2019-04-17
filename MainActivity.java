package com.example.pv.hohagiang_17it2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String s1 = "khong nhap du du lieu";

    double a,b;
    double s;

    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> strings;
    EditText textView1,textView2;
    TextView tt;
    ListView listView;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (EditText) findViewById(R.id.txt1);
        textView2 = (EditText) findViewById(R.id.txt2);
        tt = (TextView) findViewById(R.id.tt);
        listView = findViewById(R.id.item);



        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textView1.getText().toString().equals("") ||
                        textView2.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();

                }else{
                    a = Double.parseDouble(textView1.getText().toString());
                    b = Double.parseDouble(textView2.getText().toString());
                    s = a/b;
                    System.out.println(s);
                    String kk = a+"/"+b+"="+s;
                    strings = new ArrayList<String>();
                    strings.add(kk);
                    tt.setText(a+"/"+b+"="+s);
//                        arrayAdapter = new ArrayAdapter<String>();
                }


            }
        });
    }
//    public void hien(){
//        ListView listView = (ListView) findViewById(R.id.item);
//
//    }
}