package com.example.demoobserverpattren;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import Observer.BinaryObserver;
import Observer.HexaObserver;
import Observer.OctalObserver;
import Subject.Subject;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3;
    EditText et;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControl();

        setEvent();
    }

    private void setEvent() {
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( et.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Chuỗi bạn nhập đang rỗng ( không hợp lệ )",Toast.LENGTH_SHORT).show();
                }
                else{
                    ConvertNumber(Integer.parseInt(et.getText().toString()));
                }
            }
        });
    }

    private void setControl() {
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        bt = findViewById(R.id.bt);
        et= findViewById(R.id.et);
    }

    private void ConvertNumber(int state) {
        Subject subject = new Subject();
        subject.setSate(state);

        BinaryObserver bo =new BinaryObserver();
        bo.setSubject(subject,tv1);
        HexaObserver ho = new HexaObserver();
        ho.setSubject(subject,tv2);
        OctalObserver oo = new OctalObserver();
        oo.setSubject(subject,tv3);

        subject.notifyAllObserver();
    }

}
