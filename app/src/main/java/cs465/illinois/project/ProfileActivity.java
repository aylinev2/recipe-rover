package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private Button fridgeButton;
    private Button savedButton;
    private Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        fridgeButton = (Button) findViewById(R.id.fridgep);
        fridgeButton.setVisibility(View.VISIBLE);
        fridgeButton.setBackgroundColor(Color.TRANSPARENT);
        fridgeButton.setOnClickListener(this);

        savedButton = (Button) findViewById(R.id.savedp);
        savedButton.setVisibility(View.VISIBLE);
        savedButton.setBackgroundColor(Color.TRANSPARENT);
        savedButton.setOnClickListener(this);

        homeButton = (Button) findViewById(R.id.homep);
        homeButton.setVisibility(View.VISIBLE);
        homeButton.setBackgroundColor(Color.TRANSPARENT);
        homeButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.fridgep) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.savedp) {
            Intent intent = new Intent(this, SavedActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.homep) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}
