package org.balitmorecityschools.restaurantapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button foodBTN;
    Button locationBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodBTN = (Button) findViewById(R.id.foodBTN);
        locationBTN = findViewById(R.id.locationBTN);
        foodBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodScreen = new Intent(MainActivity.this, FoodBrowser.class);
                startActivity(foodScreen);
            }
        });
        locationBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewMap = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:39.2905742,-76.5374844,16?z=15"));
                startActivity(viewMap);

            }
        });

    }

}
