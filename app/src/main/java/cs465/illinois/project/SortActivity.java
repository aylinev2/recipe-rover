package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
}
