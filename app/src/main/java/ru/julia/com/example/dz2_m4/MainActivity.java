package ru.julia.com.example.dz2_m4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editId;
    private EditText name;
    private EditText editTextDate;
    private EditText editTextTime;
    private EditText editTextDate2;
    private EditText editTextTime2;

    private Button button;

    private String nameSt;
    private String idPass;
    private String date;
    private String date2;
    private String time;
    private String time2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.name);
        editId = findViewById(R.id.editId);
        editTextDate = findViewById(R.id.editTextDate);
        editTextTime = findViewById(R.id.editTextTime);
        editTextDate2 = findViewById(R.id.editTextDate2);
        editTextTime2 = findViewById(R.id.editTextTime2);

        button = findViewById(R.id.button);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                nameSt = name.getText().toString();
                idPass = editId.getText().toString();
                date = editTextDate.getText().toString();
                time = editTextTime.getText().toString();
                date2 = editTextDate2.getText().toString();
                time2 = editTextTime2.getText().toString();

                User user = new User(nameSt, idPass, date, time, date2, time2);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);


                intent.putExtra("user1", user);
                startActivity(intent);



            }
        });
    }
}