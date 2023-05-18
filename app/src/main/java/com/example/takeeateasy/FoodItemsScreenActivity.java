package com.example.takeeateasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodItemsScreenActivity extends AppCompatActivity {

    Button s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_items_screen);

        s1=findViewById(R.id.sbtn1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FoodItemsScreenActivity.this, Food1Activity.class);
                startActivity(intent);
            } //888GodsOwnNumber
            //888GodsOwnNumber
        });  //888GodsOwnNumber
    }
}