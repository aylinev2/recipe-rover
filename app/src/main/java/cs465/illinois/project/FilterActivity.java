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
    private Button italian, vegetarian, dinner, lunch;
    private HashMap<String, Boolean> clicks = new HashMap<String, Boolean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        clicks.put("italian", MainActivity.clicked.get("italian"));
        clicks.put("vegetarian", MainActivity.clicked.get("vegetarian"));
        clicks.put("dinner", MainActivity.clicked.get("dinner"));
        clicks.put("lunch", MainActivity.clicked.get("lunch"));

        applyButton = (Button) findViewById(R.id.applyf);
        applyButton.setVisibility(View.VISIBLE);
        applyButton.setBackgroundColor(Color.TRANSPARENT);
        applyButton.setOnClickListener(this);

        italian = (Button) findViewById(R.id.italian);
        if (clicks.get("italian")) {
            italian.setBackgroundResource(R.drawable.rounded_button_three);
        } else {
            italian.setBackgroundResource(R.drawable.rounded_button_four);
        }
        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = clicks.get("italian");
                if (click) {
                    italian.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    italian.setBackgroundResource(R.drawable.rounded_button_three);
                }
                clicks.put("italian", !click);
            }
        });

        vegetarian = (Button) findViewById(R.id.vegetarian);
        if (clicks.get("vegetarian")) {
            vegetarian.setBackgroundResource(R.drawable.rounded_button_three);
        } else {
            vegetarian.setBackgroundResource(R.drawable.rounded_button_four);
        }
        vegetarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = clicks.get("vegetarian");
                if (click) {
                    vegetarian.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    vegetarian.setBackgroundResource(R.drawable.rounded_button_three);
                }
                clicks.put("vegetarian", !click);
            }
        });

        dinner = (Button) findViewById(R.id.dinner);
        if (clicks.get("dinner")) {
            dinner.setBackgroundResource(R.drawable.rounded_button_three);
        } else {
            dinner.setBackgroundResource(R.drawable.rounded_button_four);
        }
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = clicks.get("dinner");
                if (click) {
                    dinner.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    dinner.setBackgroundResource(R.drawable.rounded_button_three);
                }
                clicks.put("dinner", !click);
            }
        });

        lunch = (Button) findViewById(R.id.lunch);
        if (clicks.get("lunch")) {
            lunch.setBackgroundResource(R.drawable.rounded_button_three);
        } else {
            lunch.setBackgroundResource(R.drawable.rounded_button_four);
        }
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean click = clicks.get("lunch");
                if (click) {
                    lunch.setBackgroundResource(R.drawable.rounded_button_four);
                } else {
                    lunch.setBackgroundResource(R.drawable.rounded_button_three);
                }
                clicks.put("lunch", !click);
            }
        });

    }

    public void onClick(View v) {
        if (v.getId() == R.id.applyf) {
            boolean l = clicks.get("lunch");
            boolean d = clicks.get("dinner");
            boolean ve = clicks.get("vegetarian");
            boolean i = clicks.get("italian");
            MainActivity.clicked.put("italian", i);
            MainActivity.clicked.put("lunch", l);
            MainActivity.clicked.put("dinner", d);
            MainActivity.clicked.put("vegetarian", ve);

            if (ve) {
                MainActivity.recipes.clear();
                MainActivity.recipes.add(MainActivity.originalRecipes.get(1));
            } else if (l) {
                MainActivity.recipes.clear();
                MainActivity.recipes.add(MainActivity.originalRecipes.get(2));
            } else if (d) {
                MainActivity.recipes.clear();
                MainActivity.recipes.add(MainActivity.originalRecipes.get(0));
                MainActivity.recipes.add(MainActivity.originalRecipes.get(1));
            } else if (i) {
                MainActivity.recipes = MainActivity.originalRecipes;
            }
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}
