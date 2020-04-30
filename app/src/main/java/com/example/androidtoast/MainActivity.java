package com.example.androidtoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
      public void toastmessage(View v)
      {
          Toast toast=Toast.makeText(MainActivity.this,"Killer_instinct",Toast.LENGTH_SHORT);
          toast.show();
      }
}
