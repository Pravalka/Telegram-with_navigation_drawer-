package com.example.telegram;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.riya, R.drawable.rishika, R.drawable.rahul,
            R.drawable.madhav, R.drawable.john, R.drawable.malavika,R.drawable.preeti,R.drawable.cherry};

    String[] texts = {"Riya", "Rishika", "Rahul", "Madhav", "John", "Malavika","Preeti","Cherry"};


    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;


    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), images, texts);
        listView.setAdapter(customAdapter);
        navigationView = findViewById(R.id.navigation_drawer);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

               // Navigation drawer item click listener
                switch (item.getItemId()) {
                    case R.id.android:
                        Toast.makeText(MainActivity.this, "Android", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mail:
                        Toast.makeText(MainActivity.this, "Mail", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.share:
                        Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rate:
                        Toast.makeText(MainActivity.this, "Rate", Toast.LENGTH_SHORT).show();

                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
        toolbar = findViewById(R.id.toolBar);
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar.setTitle("Telegram");

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // If you need to set image to navigation header image or setText for header textView follow the  code below

        View headerView = navigationView.getHeaderView(0);

        TextView textView = headerView.findViewById(R.id.header_textView);
        ImageView imageView = headerView.findViewById(R.id.header_imageView);

        // Set navigation header text
        textView.setText("Pravalika");

        // Set navigation header image
        imageView.setImageResource(R.drawable.baseline_pravalika);


    }
}