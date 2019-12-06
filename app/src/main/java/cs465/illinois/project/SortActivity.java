package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortActivity extends AppCompatActivity implements View.OnClickListener {
    private Button applyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);

        applyButton = (Button) findViewById(R.id.applys);
        applyButton.setVisibility(View.VISIBLE);
        applyButton.setBackgroundColor(Color.TRANSPARENT);
        applyButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.applys) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton1: // closest match
                if (checked)
                    Collections.sort(MainActivity.recipes, new Comparator<Recipe>() {
                        @Override
                        public int compare(Recipe lhs, Recipe rhs) {
                            return (int) (rhs.getPercentMatch() - lhs.getPercentMatch());
                        }
                    });
                    break;
            case R.id.radioButton2:  // prep time
                if (checked)
                    Collections.sort(MainActivity.recipes, new Comparator<Recipe>() {
                        @Override
                        public int compare(Recipe lhs, Recipe rhs) {
                            return (lhs.getPrepTimeInMinutes() - rhs.getPrepTimeInMinutes());
                        }
                    });
                    break;
            case R.id.radioButton3:  // difficulty
                final HashMap<String, Integer> difficultyOrder = new HashMap<>();
                difficultyOrder.put("easy", 1);
                difficultyOrder.put("medium", 2);
                difficultyOrder.put("hard", 3);
                if (checked)
                    Collections.sort(MainActivity.recipes, new Comparator<Recipe>() {
                        @Override
                        public int compare(Recipe lhs, Recipe rhs) {
                            return (difficultyOrder.get(lhs.getDifficulty()) - difficultyOrder.get(rhs.getDifficulty()));
                        }
                    });
                    break;
        }
    }
}
