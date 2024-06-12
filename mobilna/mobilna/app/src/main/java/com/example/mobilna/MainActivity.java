package com.example.mobilna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int liczbaLikow = 0;
    TextView polubieniaTextView;
    Button polubButton;
    Button usunButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        polubieniaTextView = findViewById(R.id.polubieniaTextView);
        polubButton = findViewById(R.id.polubButton);
        usunButton = findViewById(R.id.usunButton);

        polubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liczbaLikow++;
                zaktualizujLicznikPolubien();
            }
        });

        usunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (liczbaLikow > 0){
                    liczbaLikow--;
                    zaktualizujLicznikPolubien();
                }
            }
        });
    }

    private void zaktualizujLicznikPolubien(){
        polubieniaTextView.setText(liczbaLikow + " polubień");
    }

}