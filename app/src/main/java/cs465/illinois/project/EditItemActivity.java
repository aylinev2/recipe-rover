package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class EditItemActivity extends AppCompatActivity implements View.OnClickListener {
    private Button backButton;
    private Button deleteButton;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        backButton = (Button) findViewById(R.id.backe);
        backButton.setVisibility(View.VISIBLE);
        backButton.setBackgroundColor(Color.TRANSPARENT);
        backButton.setOnClickListener(this);

        deleteButton = (Button) findViewById(R.id.deleteButton);
        deleteButton.setVisibility(View.VISIBLE);
        deleteButton.setBackgroundColor(Color.TRANSPARENT);
        deleteButton.setOnClickListener(this);

        saveButton = (Button) findViewById(R.id.saveButton);
        saveButton.setVisibility(View.VISIBLE);
        saveButton.setBackgroundColor(Color.TRANSPARENT);
        saveButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.backe) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } /*else if (v.getId() == R.id.deleteButton){
            String name = actv.getText().toString();

            if("eggs".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.eggs, R.drawable.ingredient_egg));
            } else if("pasta".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.pasta, R.drawable.ingredient_pasta));
            } else if("tomato".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.tomato, R.drawable.ingredient_tomato));
            } else {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.tortillas, R.drawable.ingredient_tortilla));
            }

//            ingredientsAdapter.notifyDataSetChanged();
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } */else if (v.getId() == R.id.saveButton) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}
