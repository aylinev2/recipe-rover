package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static cs465.illinois.project.MainActivity.getImage;

public class CompletedActivity extends AppCompatActivity implements View.OnClickListener {
    private Button homeButton;
    private Button fridgeButton;
    private Button profileButton;
    private Button favoritesButton;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<Recipe> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed);

        recyclerView = (RecyclerView) findViewById(R.id.completed_list);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recipes = new ArrayList<Recipe>();

        adapter = new FavAdapter(this, recipes);
        recyclerView.setAdapter(adapter);

        loadRecipes();

        homeButton = (Button) findViewById(R.id.homec);
        homeButton.setVisibility(View.VISIBLE);
        homeButton.setBackgroundColor(Color.TRANSPARENT);
        homeButton.setOnClickListener(this);

        fridgeButton = (Button) findViewById(R.id.fridgec);
        fridgeButton.setVisibility(View.VISIBLE);
        fridgeButton.setBackgroundColor(Color.TRANSPARENT);
        fridgeButton.setOnClickListener(this);

        profileButton = (Button) findViewById(R.id.profilec);
        profileButton.setVisibility(View.VISIBLE);
        profileButton.setBackgroundColor(Color.TRANSPARENT);
        profileButton.setOnClickListener(this);

        favoritesButton = (Button) findViewById(R.id.favorites);
        favoritesButton.setVisibility(View.VISIBLE);
        favoritesButton.setBackgroundColor(Color.TRANSPARENT);
        favoritesButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.homec) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.fridgec) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.profilec) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.favorites) {
            Intent intent = new Intent(this, SavedActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }

    private void loadRecipes(){
        recipes.add(new Recipe(
                "fettuccine alfredo",
                getImage(this, "recipe_alfredo"),
                "30 minutes",
                "easy",
                100,
                "You've got everything!"
        ));
        recipes.add(new Recipe(
                "grilled cheese",
                getImage(this, "recipe_grilledcheese"),
                "10 minutes",
                "easy",
                100,
                "You've got everything!"
        ));
        recipes.add(new Recipe(
                "broccoli and beef",
                getImage(this, "recipe_broccolibeef")
        ));
        recipes.add(new Recipe(
                "beef shwarma",
                getImage(this, "recipe_beefshwarma")
        ));
        recipes.add(new Recipe(
                "burrito",
                getImage(this, "recipe_burrito")
        ));
        recipes.add(new Recipe(
                "chocolate chip cookies",
                getImage(this, "recipe_cookies")
        ));
        recipes.add(new Recipe(
                "carne asada tacos",
                getImage(this, "recipe_tacos")
        ));
        recipes.add(new Recipe(
                "huevos rancheros",
                getImage(this, "recipe_huevosrancheros")
        ));
        recipes.add(new Recipe(
                "buttermilk pancakes",
                getImage(this, "recipe_pancakes")
        ));
        recipes.add(new Recipe(
                "cheese and chicken quesadilla",
                getImage(this, "recipe_quesadilla")
        ));
        recipes.add(new Recipe(
                "classic steak",
                getImage(this, "recipe_steak")
        ));
        recipes.add(new Recipe(
                "tuna sandwich",
                getImage(this, "recipe_tunasandwich")
        ));
        recipes.add(new Recipe(
                "chicken fajitas",
                getImage(this, "recipe_chickenfajitas")
        ));


    }
}
