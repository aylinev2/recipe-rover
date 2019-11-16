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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        backButton = (Button) findViewById(R.id.backe);
        backButton.setVisibility(View.VISIBLE);
        backButton.setBackgroundColor(Color.TRANSPARENT);
        backButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.backe) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}
