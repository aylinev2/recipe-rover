package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class FilterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button applyButton;
    private Button italian, vegetarian, dinner, breakfast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        applyButton = (Button) findViewById(R.id.applyf);
        applyButton.setVisibility(View.VISIBLE);
        applyButton.setBackgroundColor(Color.TRANSPARENT);
        applyButton.setOnClickListener(this);

        italian = (Button) findViewById(R.id.italian);
        if (MainActivity.clicked.get("italian")) {
            italian.setBackgroundResource(R.drawable.rounded_button_three);
        } else {
            italian.setBackgroundResource(R.drawable.rounded_button_four);
        }
        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = MainActivity.clicked.get("italian");
                if (click) {
                    italian.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    italian.setBackgroundResource(R.drawable.rounded_button_three);
                }
                MainActivity.clicked.put("italian", !click);
            }
        });

        vegetarian = (Button) findViewById(R.id.vegetarian);
        if (MainActivity.clicked.get("vegetarian")) {
            vegetarian.setBackgroundResource(R.drawable.rounded_button_three);
        } else {
            vegetarian.setBackgroundResource(R.drawable.rounded_button_four);
        }
        vegetarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = MainActivity.clicked.get("vegetarian");
                if (click) {
                    vegetarian.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    vegetarian.setBackgroundResource(R.drawable.rounded_button_three);
                }
                MainActivity.clicked.put("vegetarian", !click);
            }
        });

        dinner = (Button) findViewById(R.id.dinner);
        if (MainActivity.clicked.get("dinner")) {
            dinner.setBackgroundResource(R.drawable.rounded_button_three);
        } else {
            dinner.setBackgroundResource(R.drawable.rounded_button_four);
        }
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = MainActivity.clicked.get("dinner");
                if (click) {
                    dinner.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    dinner.setBackgroundResource(R.drawable.rounded_button_three);
                }
                MainActivity.clicked.put("dinner", !click);
            }
        });

        breakfast = (Button) findViewById(R.id.breakfast);
        if (MainActivity.clicked.get("breakfast")) {
            breakfast.setBackgroundResource(R.drawable.rounded_button_three);
        } else {
            breakfast.setBackgroundResource(R.drawable.rounded_button_four);
        }
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = MainActivity.clicked.get("breakfast");
                if (click) {
                    breakfast.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    breakfast.setBackgroundResource(R.drawable.rounded_button_three);
                }
                MainActivity.clicked.put("breakfast", !click);
            }
        });

    }

    public void onClick(View v) {
        if (v.getId() == R.id.applyf) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}
