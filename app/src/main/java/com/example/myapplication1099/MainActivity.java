package com.example.myapplication1099;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
button=findViewById(R.id.button);
textView=findViewById(R.id.textView);
radioGroup=findViewById(R.id.grupa);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int kliknietyRadioId = radioGroup.getCheckedRadioButtonId();
        if(kliknietyRadioId == R.id.radioButton2){
            Toast.makeText(MainActivity.this,
                            "Prawidłowa odpowiedź",
                            Toast.LENGTH_SHORT)
                    .show();
        }
        else{
            Toast.makeText(MainActivity.this,
                            "Zła odpowiedź",
                            Toast.LENGTH_SHORT)
                    .show();
        }
    }
});

    }
}