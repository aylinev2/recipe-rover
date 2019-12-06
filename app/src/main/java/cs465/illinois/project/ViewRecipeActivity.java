package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ViewRecipeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button fridgeButton;
    private Button savedButton;
    private Button profileButton;
    private Button backButton;
    private Button finishButton;
    private ImageView recipePicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recipe);

        fridgeButton = (Button) findViewById(R.id.fridger);
        fridgeButton.setVisibility(View.VISIBLE);
        fridgeButton.setBackgroundColor(Color.TRANSPARENT);
        fridgeButton.setOnClickListener(this);

        savedButton = (Button) findViewById(R.id.savedr);
        savedButton.setVisibility(View.VISIBLE);
        savedButton.setBackgroundColor(Color.TRANSPARENT);
        savedButton.setOnClickListener(this);

        profileButton = (Button) findViewById(R.id.profiler);
        profileButton.setVisibility(View.VISIBLE);
        profileButton.setBackgroundColor(Color.TRANSPARENT);
        profileButton.setOnClickListener(this);

        backButton = (Button) findViewById(R.id.backr);
        backButton.setVisibility(View.VISIBLE);
        backButton.setBackgroundColor(Color.TRANSPARENT);
        backButton.setOnClickListener(this);

        finishButton = (Button) findViewById(R.id.finishr);
        finishButton.setVisibility(View.VISIBLE);
        finishButton.setBackgroundColor(Color.TRANSPARENT);
        finishButton.setOnClickListener(this);

        recipePicture = (ImageView) findViewById(R.id.recipePicture);

        Intent intent = getIntent();
        String recipeName = intent.getExtras().getString("recipeName");
        if("fettuccine alfredo".equalsIgnoreCase(recipeName)) {
            recipePicture.setImageResource(R.drawable.fettucinerecipe);
        } else if ("spaghetti and meatballs".equalsIgnoreCase(recipeName)) {
            recipePicture.setImageResource(R.drawable.spaghettirecipe);
        } else {
            recipePicture.setImageResource(R.drawable.pizzarecipe);
        }
    }

    public void onClick(View v) {
        if (v.getId() == R.id.fridger) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.savedr) {
            Intent intent = new Intent(this, SavedActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.profiler) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.backr) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.finishr) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}