package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Filter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button fridgeButton;
    private Button savedButton;
    private Button profileButton;
    private Button filterButton;
    private Button sortButton;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<Recipe> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fridgeButton = (Button) findViewById(R.id.fridge);
        fridgeButton.setVisibility(View.VISIBLE);
        fridgeButton.setBackgroundColor(Color.TRANSPARENT);
        fridgeButton.setOnClickListener(this);

        savedButton = (Button) findViewById(R.id.saved);
        savedButton.setVisibility(View.VISIBLE);
        savedButton.setBackgroundColor(Color.TRANSPARENT);
        savedButton.setOnClickListener(this);

        profileButton = (Button) findViewById(R.id.profile);
        profileButton.setVisibility(View.VISIBLE);
        profileButton.setBackgroundColor(Color.TRANSPARENT);
        profileButton.setOnClickListener(this);

        filterButton = (Button) findViewById(R.id.filter);
        filterButton.setVisibility(View.VISIBLE);
        filterButton.setBackgroundColor(Color.TRANSPARENT);
        filterButton.setOnClickListener(this);

        sortButton = (Button) findViewById(R.id.sort);
        sortButton.setVisibility(View.VISIBLE);
        sortButton.setBackgroundColor(Color.TRANSPARENT);
        sortButton.setOnClickListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.suggestion_list);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recipes = new ArrayList<Recipe>();

        adapter = new RecipeAdapter(this, recipes);
        recyclerView.setAdapter(adapter);
        loadRecipes();
    }

    public void onClick(View v) {
        if (v.getId() == R.id.fridge) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.saved) {
            Intent intent = new Intent(this, SavedActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.profile) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.sort) {
            Intent intent = new Intent(this, SortActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.filter) {
            Intent intent = new Intent(this, FilterActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }

    private void loadRecipes(){
        recipes.add(new Recipe(
                "fettuccine alfredo",
                getImage(this, "alfredo"),
                "30 minutes",
                "easy",
                100,
                "You've got everything!"
        ));
        recipes.add(new Recipe(
                "spaghetti and meatballs",
                getImage(this, "spaghetti"),
                "35 minutes",
                "easy",
                95,
                "Worcestershire sauce"
        ));
        recipes.add(new Recipe(
                "pepperoni pizza",
                getImage(this, "pizza"),
                "2 hours 20 minutes",
                "medium",
                80,
                "active dry yeast, chopped fresh oregano"
        ));
    }

    public static Drawable getImage(Context c, String ImageName) {
        return c.getResources().getDrawable(c.getResources().getIdentifier(ImageName, "drawable", c.getPackageName()));
    }
}
