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

public class SavedActivity extends AppCompatActivity implements View.OnClickListener {
    private Button homeButton;
    private Button fridgeButton;
    private Button profileButton;
    private Button completedButton;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<Recipe> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        recyclerView = (RecyclerView) findViewById(R.id.saved_list);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recipes = new ArrayList<Recipe>();

        adapter = new FavAdapter(this, recipes);
        recyclerView.setAdapter(adapter);

        loadRecipes();

        homeButton = (Button) findViewById(R.id.homes);
        homeButton.setVisibility(View.VISIBLE);
        homeButton.setBackgroundColor(Color.TRANSPARENT);
        homeButton.setOnClickListener(this);

        fridgeButton = (Button) findViewById(R.id.fridges);
        fridgeButton.setVisibility(View.VISIBLE);
        fridgeButton.setBackgroundColor(Color.TRANSPARENT);
        fridgeButton.setOnClickListener(this);

        profileButton = (Button) findViewById(R.id.profiles);
        profileButton.setVisibility(View.VISIBLE);
        profileButton.setBackgroundColor(Color.TRANSPARENT);
        profileButton.setOnClickListener(this);

        completedButton = (Button) findViewById(R.id.completed);
        completedButton.setVisibility(View.VISIBLE);
        completedButton.setBackgroundColor(Color.TRANSPARENT);
        completedButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.homes) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.fridges) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.profiles) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.completed) {
            Intent intent = new Intent(this, CompletedActivity.class);
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

    }




}
