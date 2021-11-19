package com.example.optionsmenuex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout screen;
Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (LinearLayout) findViewById(R.id.screen);
        btnNext = (Button) findViewById(R.id.nextsc);
    }

    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.menuRed)
        {
            screen.setBackgroundColor(Color.RED);
            btnNext.setBackgroundColor(Color.RED);
        }
        if (id == R.id.menuGreen)
        {
            screen.setBackgroundColor(Color.GREEN);
            btnNext.setBackgroundColor(Color.GREEN);
        }
        if (id == R.id.menuBlue)
        {
            screen.setBackgroundColor(Color.BLUE);
            btnNext.setBackgroundColor(Color.BLUE);
        }
        return  true;
    }

    public void nextscreen (View view)
    {
        Intent si = new Intent(this, secondScreen.class);
        startActivity(si);
    }
}