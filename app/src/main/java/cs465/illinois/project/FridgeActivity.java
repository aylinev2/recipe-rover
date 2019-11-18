package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FridgeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button homeButton;
    private Button savedButton;
    private Button profileButton;
    private Button recipesButton;
    private FloatingActionButton addButton;

    public static Ingredient[] ingredients = {
            new Ingredient(R.string.butter, R.drawable.ingredient_butter),
            new Ingredient(R.string.cheese, R.drawable.ingredient_cheese),
            new Ingredient(R.string.chicken, R.drawable.ingredient_chicken),
            new Ingredient(R.string.milk, R.drawable.ingredient_milk),
            new Ingredient(R.string.garlic,R.drawable.ingredient_garlic),
            new Ingredient(R.string.herb, R.drawable.ingredient_herb),
            new Ingredient(R.string.olive_oil, R.drawable.ingredient_olive_oil),
            new Ingredient(R.string.onion, R.drawable.ingredient_onion),
            new Ingredient(R.string.paprika, R.drawable.ingredient_paprika),
            new Ingredient(R.string.salt, R.drawable.ingredient_salt),
            new Ingredient(R.string.spice, R.drawable.ingredient_spice)
    };
    public static List<Ingredient> ingredientArrayList = new ArrayList<>(Arrays.asList(ingredients));
    public IngredientAdapter ingredientsAdapter = new IngredientAdapter(this, ingredientArrayList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);
        GridView gridView = (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(ingredientsAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Ingredient ingredient = ingredientArrayList.get(position);
                String ingredientName = getString(ingredient.getName());

                Intent intent = new Intent(FridgeActivity.this, EditItemActivity.class);
                Ingredient clickedIngredient = findIngredientUsingIterator(ingredientName, ingredientArrayList);

                intent.putExtra("ingredientName", ingredientName);
                intent.putExtra("qty", clickedIngredient.getQty());
                intent.putExtra("qtyUnit", clickedIngredient.getQtyUnit());
                intent.putExtra("datePurchased", clickedIngredient.getDatePurchased());
                intent.putExtra("dateExpired", clickedIngredient.getDateExpired());
                startActivity(intent);
                overridePendingTransition(0,0);

            }
        });

        homeButton = (Button) findViewById(R.id.homef);
        homeButton.setVisibility(View.VISIBLE);
        homeButton.setBackgroundColor(Color.TRANSPARENT);
        homeButton.setOnClickListener(this);

        savedButton = (Button) findViewById(R.id.savedf);
        savedButton.setVisibility(View.VISIBLE);
        savedButton.setBackgroundColor(Color.TRANSPARENT);
        savedButton.setOnClickListener(this);

        profileButton = (Button) findViewById(R.id.profilef);
        profileButton.setVisibility(View.VISIBLE);
        profileButton.setBackgroundColor(Color.TRANSPARENT);
        profileButton.setOnClickListener(this);

        addButton = (FloatingActionButton) findViewById(R.id.floatingAddButton);
        addButton.setOnClickListener(this);

        recipesButton = (Button) findViewById(R.id.recipes);
        recipesButton.setVisibility(View.VISIBLE);
        recipesButton.setBackgroundColor(Color.TRANSPARENT);
        recipesButton.setOnClickListener(this);
    }

    public Ingredient findIngredientUsingIterator(String name, List<Ingredient> customers) {
        Iterator<Ingredient> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Ingredient ingredient = iterator.next();
            if (name.equalsIgnoreCase(getString(ingredient.getName()))) {
                return ingredient;
            }
        }
        return null;
    }

    public void onClick(View v) {
        if (v.getId() == R.id.homef) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.savedf) {
            Intent intent = new Intent(this, SavedActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.profilef) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.floatingAddButton) {
            Intent intent = new Intent(this, AddItemActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.recipes) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }

    }
}
