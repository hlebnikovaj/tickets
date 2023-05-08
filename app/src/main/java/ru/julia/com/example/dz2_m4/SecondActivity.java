package ru.julia.com.example.dz2_m4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    private User user;
    private Button button2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView3SecondActivity);
        Bundle bundle = getIntent().getExtras();
       // textView.setText(getText().toString());

        if (bundle!=null)
        {
            user = (User)bundle.getSerializable("user1");
            textView.setText("ID pass: " + user.getIdPass() +
                    "\n" + " станция отправления: " + user.getNameSt() + "\n"+
                    " дата отправления: " + user.getDate() + "\n" +
                    " время отправления: " + user.getTime() + "\n" +
                    " дата прибытия: " + user.getDate2() + "\n" +
                    " время прибытияя: " + user.getTime2() );

        }
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
            }
        });


    }
}