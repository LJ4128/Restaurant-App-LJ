package org.balitmorecityschools.restaurantapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OrderScreen extends AppCompatActivity {
    Button pizzaBTN, toppingsBTN, doneBTN;
    LinearLayout pizzaPanel, toppingsPanel;
    ArrayList<Pizza> pizzaList = new ArrayList<>();
    Spinner sizeSpinner;
    CheckBox pepperoniCB, sausageCB, hamCB, extracheeseCB, stuffedcrustCB;
    String toppings;
    Pizza temp;
    boolean extraCheese, stuffedCrust;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);
        pizzaPanel = findViewById(R.id.pizzaPanel);
        toppingsPanel = findViewById(R.id.toppingsPanel);
        sizeSpinner = findViewById(R.id.sizeSpinner);
        pizzaBTN = findViewById(R.id.pizzaBTN);
        toppingsBTN = findViewById(R.id.toppingsBTN);
        pepperoniCB = findViewById(R.id.pepperoniCB);
        sausageCB = findViewById(R.id.sausageCB);
        hamCB = findViewById(R.id.hamCB);
        extracheeseCB = findViewById(R.id.extracheeseCB);
        stuffedcrustCB = findViewById(R.id.stuffedcrustCB);
        doneBTN = findViewById(R.id.doneBTN);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.size_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pizzaPanel.setVisibility(View.INVISIBLE);
        pizzaBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizzaPanel.setVisibility(View.VISIBLE);
                toppingsPanel.setVisibility(View.INVISIBLE);
            }
        });
        toppingsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toppingsPanel.setVisibility(View.VISIBLE);
            }
        });
        doneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizzaPanel.setVisibility(View.INVISIBLE);
                toppings = "";
                if (pepperoniCB.isChecked()){
                    toppings += "Pepperoni ";
                }
                if (sausageCB.isChecked()){
                    toppings += "Sausage ";
                }
                if (hamCB.isChecked()){
                    toppings += "Ham ";
                }

                if (stuffedcrustCB.isChecked()){
                    stuffedCrust = true;
                }
                else {
                    stuffedCrust = false;
                }

                if (extracheeseCB.isChecked()){
                    extraCheese = true;
                }
                else {
                    extraCheese = false;
                }
                temp = new Pizza((sizeSpinner.getSelectedItem().toString()), toppings, extraCheese, stuffedCrust);
                pizzaList.add(temp);

            }
        });
        sizeSpinner.setAdapter(adapter);


    }
}