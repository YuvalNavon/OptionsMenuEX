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

public class secondScreen extends AppCompatActivity {
LinearLayout screen;
Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        screen = (LinearLayout) findViewById(R.id.screen2);
        btnBack = (Button) findViewById(R.id.lastsc);

    }
    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,4,"Yellow");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        String title = item.getTitle().toString();
        if (id == R.id.menuRed)
        {
            screen.setBackgroundColor(Color.RED);
            btnBack.setBackgroundColor(Color.RED);
        }
        if (id == R.id.menuGreen)
        {
            screen.setBackgroundColor(Color.GREEN);
            btnBack.setBackgroundColor(Color.GREEN);
        }
        if (id == R.id.menuBlue)
        {
            screen.setBackgroundColor(Color.BLUE);
            btnBack.setBackgroundColor(Color.BLUE);
        }
        if (title == "Yellow")
        {
            screen.setBackgroundColor(Color.YELLOW);
            btnBack.setBackgroundColor(Color.YELLOW);
        }
        return  true;
    }

    public void back (View view)
    {
        Intent si = new Intent(this, MainActivity.class);
        startActivity(si);
    }
}