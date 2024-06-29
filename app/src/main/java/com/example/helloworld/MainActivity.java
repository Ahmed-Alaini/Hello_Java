package com.example.helloworld;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Oncreate() is called. ", Toast.LENGTH_SHORT).show();
        findViewById(R.id.button).setOnClickListener(new MyClickListener());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart() is called. ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume() is called. ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause() is called. ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop() is called. ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy() is called. ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart() is called. ", Toast.LENGTH_SHORT).show();

    }
//    public void buttonIsClicked(View buttonView){
//        buttonView.setBackgroundColor(Color.RED);
//        findViewById(R.id.main).setBackgroundColor(Color.YELLOW);
//        Toast.makeText(this,"The button is clicked!",Toast.LENGTH_SHORT).show();
//
//    }

}