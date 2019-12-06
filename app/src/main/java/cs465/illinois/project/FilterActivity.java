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
    private HashMap<String, Boolean> clicked = new HashMap<String, Boolean>() {{
        put("italian", false); put("vegetarian", false); put("dinner", false); put("breakfast", false);
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        applyButton = (Button) findViewById(R.id.applyf);
        applyButton.setVisibility(View.VISIBLE);
        applyButton.setBackgroundColor(Color.TRANSPARENT);
        applyButton.setOnClickListener(this);

        italian = (Button) findViewById(R.id.italian);
        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = clicked.get("italian");
                if (click) {
                    //Drawable image = (Drawable)getResources().getDrawable(R.drawable.rounded_button_three);
                    italian.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    //Drawable image = (Drawable)getResources().getDrawable(R.drawable.rounded_button_three);
                    italian.setBackgroundResource(R.drawable.rounded_button_three);
                }
                clicked.put("italian", !click);
            }
        });

        vegetarian = (Button) findViewById(R.id.vegetarian);
        vegetarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = clicked.get("vegetarian");
                if (click) {
                    vegetarian.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    vegetarian.setBackgroundResource(R.drawable.rounded_button_three);
                }
                clicked.put("vegetarian", !click);
            }
        });

        dinner = (Button) findViewById(R.id.dinner);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = clicked.get("dinner");
                if (click) {
                    dinner.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    dinner.setBackgroundResource(R.drawable.rounded_button_three);
                }
                clicked.put("dinner", !click);
            }
        });

        breakfast = (Button) findViewById(R.id.breakfast);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = clicked.get("breakfast");
                if (click) {
                    breakfast.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    breakfast.setBackgroundResource(R.drawable.rounded_button_three);
                }
                clicked.put("breakfast", !click);
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