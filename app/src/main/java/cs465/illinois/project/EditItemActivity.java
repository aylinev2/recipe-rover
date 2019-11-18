package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity implements View.OnClickListener {
    private Button backButton;
    private Button deleteButton;
    private Button saveButton;
    private EditText ingredientNameEditText;
    private EditText qtyEditText;
    private EditText datepurchasedEditText;
    private EditText dateExpiredEditText;

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

        ingredientNameEditText = (EditText) findViewById(R.id.editIngredientName);
        String ingredientName = getIntent().getExtras().getString("ingredientName");
        ingredientNameEditText.setText(ingredientName);

        qtyEditText = (EditText) findViewById(R.id.editqty);
        String qty = getIntent().getExtras().getString("qty");
        qtyEditText.setText(qty);

        datepurchasedEditText = (EditText) findViewById(R.id.editpurchasedate);
        String datePurchased = getIntent().getExtras().getString("datePurchased");
        datepurchasedEditText.setText(datePurchased);

        dateExpiredEditText = (EditText) findViewById(R.id.editexp);
        String dateExpired = getIntent().getExtras().getString("dateExpired");
        dateExpiredEditText.setText(dateExpired);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.backe) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.deleteButton){
            String name = ingredientNameEditText.getText().toString();
            if("eggs".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.eggs, R.drawable.ingredient_egg));
            } else if("pasta".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.pasta, R.drawable.ingredient_pasta));
            } else if("tomato".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.tomato, R.drawable.ingredient_tomato));
            } else if("butter".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.butter, R.drawable.ingredient_butter));
            } else if("cheese".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.cheese, R.drawable.ingredient_cheese));
            } else if("chicken".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.chicken, R.drawable.ingredient_chicken));
            } else if("milk".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.milk, R.drawable.ingredient_milk));
            } else if("garlic".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.garlic, R.drawable.ingredient_garlic));
            } else if("cilantro".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.herb, R.drawable.ingredient_herb));
            } else if("Olive Oil".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.olive_oil, R.drawable.ingredient_olive_oil));
            } else if("onion".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.onion, R.drawable.ingredient_onion));
            } else if("bell pepper".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.paprika, R.drawable.ingredient_paprika));
            } else if("salt".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.salt, R.drawable.ingredient_salt));
            } else if("spice".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.spice, R.drawable.ingredient_spice));
            }
            else {
                FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.tortillas, R.drawable.ingredient_tortilla));
            }
//            ingredientsAdapter.notifyDataSetChanged();
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        } else if (v.getId() == R.id.saveButton) {

            String name = ingredientNameEditText.getText().toString();
            String qty = qtyEditText.getText().toString();
            String qtyUnits = "units";
            String datePurchased = datepurchasedEditText.getText().toString();
            String dateExpired = dateExpiredEditText.getText().toString();

            if("eggs".equalsIgnoreCase(name)) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.eggs, R.drawable.ingredient_egg))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.eggs, R.drawable.ingredient_egg));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.eggs, R.drawable.ingredient_egg, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.eggs, R.drawable.ingredient_egg, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("pasta".equalsIgnoreCase(name)) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.pasta, R.drawable.ingredient_pasta))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.pasta, R.drawable.ingredient_pasta));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.pasta, R.drawable.ingredient_pasta, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.pasta, R.drawable.ingredient_pasta, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("tomato".equalsIgnoreCase((name))) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.tomato, R.drawable.ingredient_tomato))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.tomato, R.drawable.ingredient_tomato));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.tomato, R.drawable.ingredient_tomato, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.tomato, R.drawable.ingredient_tomato, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("butter".equalsIgnoreCase(name)) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.butter, R.drawable.ingredient_butter))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.butter, R.drawable.ingredient_butter));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.butter, R.drawable.ingredient_butter, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.butter, R.drawable.ingredient_butter, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("cheese".equalsIgnoreCase((name))) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.cheese, R.drawable.ingredient_cheese))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.cheese, R.drawable.ingredient_cheese));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.cheese, R.drawable.ingredient_cheese, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.cheese, R.drawable.ingredient_cheese, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("chicken".equalsIgnoreCase(name)) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.chicken, R.drawable.ingredient_chicken))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.chicken, R.drawable.ingredient_chicken));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.chicken, R.drawable.ingredient_chicken, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.chicken, R.drawable.ingredient_chicken, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("milk".equalsIgnoreCase((name))) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.milk, R.drawable.ingredient_milk))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.milk, R.drawable.ingredient_milk));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.milk, R.drawable.ingredient_milk, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.milk, R.drawable.ingredient_milk, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("garlic".equalsIgnoreCase(name)) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.garlic, R.drawable.ingredient_garlic))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.garlic, R.drawable.ingredient_garlic));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.garlic, R.drawable.ingredient_garlic, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.garlic, R.drawable.ingredient_garlic, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("cilantro".equalsIgnoreCase((name))) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.herb, R.drawable.ingredient_herb))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.herb, R.drawable.ingredient_herb));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.herb, R.drawable.ingredient_herb, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.herb, R.drawable.ingredient_herb, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("Olive Oil".equalsIgnoreCase(name)) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.olive_oil, R.drawable.ingredient_olive_oil))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.olive_oil, R.drawable.ingredient_olive_oil));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.olive_oil, R.drawable.ingredient_olive_oil, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.olive_oil, R.drawable.ingredient_olive_oil, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("onion".equalsIgnoreCase((name))) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.onion, R.drawable.ingredient_onion))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.onion, R.drawable.ingredient_onion));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.onion, R.drawable.ingredient_onion, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.onion, R.drawable.ingredient_onion, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("bell pepper".equalsIgnoreCase(name)) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.paprika, R.drawable.ingredient_paprika))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.paprika, R.drawable.ingredient_paprika));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.paprika, R.drawable.ingredient_paprika, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.paprika, R.drawable.ingredient_paprika, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("salt".equalsIgnoreCase((name))) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.salt, R.drawable.ingredient_salt))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.salt, R.drawable.ingredient_salt));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.salt, R.drawable.ingredient_salt, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.salt, R.drawable.ingredient_salt, qty, qtyUnits, datePurchased, dateExpired));
                }
            } else if("spice".equalsIgnoreCase((name))) {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.spice, R.drawable.ingredient_spice))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.spice, R.drawable.ingredient_spice));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.spice, R.drawable.ingredient_spice, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.spice, R.drawable.ingredient_spice, qty, qtyUnits, datePurchased, dateExpired));
                }
            }
            else {
                if(FridgeActivity.ingredientArrayList.contains(new Ingredient(R.string.tortillas, R.drawable.ingredient_tortilla))) {
                    FridgeActivity.ingredientArrayList.remove(new Ingredient(R.string.tortillas, R.drawable.ingredient_tortilla));
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.tortillas, R.drawable.ingredient_tortilla, qty, qtyUnits, datePurchased, dateExpired));
                } else {
                    FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.tortillas, R.drawable.ingredient_tortilla, qty, qtyUnits, datePurchased, dateExpired));
                }
            }

            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}
