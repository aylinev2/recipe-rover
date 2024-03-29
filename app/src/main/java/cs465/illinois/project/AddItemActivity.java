package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class AddItemActivity extends AppCompatActivity implements View.OnClickListener {
    private Button backButton;
    private Button addButton;

    AutoCompleteTextView actv;
    DatePickerDialog picker;
    EditText datePurchaseEntry;
    EditText expiryDateEntry;
    EditText qtyEntry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        backButton = (Button) findViewById(R.id.backa);
        backButton.setVisibility(View.VISIBLE);
        backButton.setBackgroundColor(Color.TRANSPARENT);
        backButton.setOnClickListener(this);

        addButton = (Button) findViewById(R.id.addButton);
        addButton.setVisibility(View.VISIBLE);
        addButton.setBackgroundColor(Color.TRANSPARENT);
        addButton.setOnClickListener(this);

        datePurchaseEntry=(EditText) findViewById(R.id.datePurchased);
        datePurchaseEntry.setInputType(InputType.TYPE_NULL);
        datePurchaseEntry.setOnClickListener(this);

        expiryDateEntry=(EditText) findViewById(R.id.expirationDate);
        expiryDateEntry.setInputType(InputType.TYPE_NULL);
        expiryDateEntry.setOnClickListener(this);

        qtyEntry = (EditText) findViewById(R.id.addqty);

        String[] food = {"asparagus", "apples", "avacado", "alfalfa", "acorn squash", "almond", "arugala", "artichoke", "applesauce", "asian noodles", "antelope", "ahi tuna", "albacore tuna", "Apple juice", "Avocado roll", "bruscetta", "butter", "bacon", "black beans", "bagels", "baked beans", "BBQ", "bell peppers", "bison", "barley", "beer", "bisque", "bluefish", "bread", "broccoli", "buritto", "babaganoosh", "cheddar cheese", "Cabbage", "cake", "carrots", "carne asada", "celery", "cheese", "chicken", "catfish", "chips", "chocolate", "chowder", "clams", "coffee", "cookies", "corn", "cupcakes", "crab", "curry", "cereal", "chimichanga", "dates", "dips", "duck", "dumplings", "donuts", "eggs", "enchilada", "eggrolls", "English muffins", "edimame", "eel sushi", "fajita", "falafel", "fish", "franks", "fondu", "French toast", "French dip", "garlic powder", "Garlic", "ginger", "gnocchi", "goose", "granola", "grapes", "green beans", "Guancamole", "gumbo", "grits", "Graham crackers", "ham", "halibut", "hamburger", "honey", "huenos rancheros", "hash browns", "hot dogs", "haiku roll", "hummus", "ice cream", "Irish stew", "Indian food", "Italian bread", "jambalaya", "jelly / jam", "jerky", "jalapeño", "kale", "kabobs", "ketchup", "kiwi", "kidney beans", "kingfish", "lobster", "Lamb", "Linguine", "Lasagna", "mozzarella cheese", "Meatballs", "Moose", "Milk", "Milkshake", "Noodles", "olive oil", "oregano", "Ostrich", "onions", "pasta", "parmesan cheese", "Pizza", "pepper", "Pepperoni", "Porter", "Pancakes", "Quesadilla", "Quiche", "Reuben", "salt", "Spinach", "Spaghetti", "Tater tots", "tortillas", "tomato", "Toast", "Venison", "Waffles", "Wine", "Walnuts", "Yogurt", "Ziti", "Zucchini"};
        //Creating the instance of ArrayAdapter containing list of fruit names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, food);
        //Getting the instance of AutoCompleteTextView
        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adap = ArrayAdapter.createFromResource(this,
                R.array.units_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adap);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.backa) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
        else if (v.getId() == R.id.addButton){
            String name = actv.getText().toString();
            String qty = qtyEntry.getText().toString();
            String datePurchased = datePurchaseEntry.getText().toString();
            String dateExpired = expiryDateEntry.getText().toString();
            String qtyUnits = "units";


            if("eggs".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.eggs, R.drawable.ingredient_egg, qty, qtyUnits, datePurchased, dateExpired));
            } else if("pasta".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.pasta, R.drawable.ingredient_pasta, qty, qtyUnits, datePurchased, dateExpired));
            } else if("tomato".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.tomato, R.drawable.ingredient_tomato, qty, qtyUnits, datePurchased, dateExpired));
            } else if("butter".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.butter, R.drawable.ingredient_butter, qty, qtyUnits, datePurchased, dateExpired));
            } else if("cheese".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.cheese, R.drawable.ingredient_cheese, qty, qtyUnits, datePurchased, dateExpired));
            } else if("chicken".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.chicken, R.drawable.ingredient_chicken, qty, qtyUnits, datePurchased, dateExpired));
            } else if("milk".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.milk, R.drawable.ingredient_milk, qty, qtyUnits, datePurchased, dateExpired));
            } else if("garlic".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.garlic, R.drawable.ingredient_garlic, qty, qtyUnits, datePurchased, dateExpired));
            } else if("cilantro".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.herb, R.drawable.ingredient_herb, qty, qtyUnits, datePurchased, dateExpired));
            } else if("Olive Oil".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.olive_oil, R.drawable.ingredient_olive_oil, qty, qtyUnits, datePurchased, dateExpired));
            } else if("onion".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.onion, R.drawable.ingredient_onion, qty, qtyUnits, datePurchased, dateExpired));
            } else if("bell pepper".equalsIgnoreCase(name)) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.paprika, R.drawable.ingredient_paprika, qty, qtyUnits, datePurchased, dateExpired));
            } else if("salt".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.salt, R.drawable.ingredient_salt, qty, qtyUnits, datePurchased, dateExpired));
            } else if("spice".equalsIgnoreCase((name))) {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.spice, R.drawable.ingredient_spice, qty, qtyUnits, datePurchased, dateExpired));
            } else {
                FridgeActivity.ingredientArrayList.add(new Ingredient(R.string.tortillas, R.drawable.ingredient_tortilla, qty, qtyUnits, datePurchased, dateExpired));
            }

//            ingredientsAdapter.notifyDataSetChanged();
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
        else if (v.getId() == R.id.datePurchased){
            final Calendar cldr = Calendar.getInstance();
            int day = cldr.get(Calendar.DAY_OF_MONTH);
            int month = cldr.get(Calendar.MONTH);
            int year = cldr.get(Calendar.YEAR);
            // date picker dialog
            picker = new DatePickerDialog(AddItemActivity.this, R.style.DatePickerTheme,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            datePurchaseEntry.setText((monthOfYear + 1) + "/" + dayOfMonth + "/" + year);
                        }
                    }, year, month, day);
            picker.show();
        }
        else if (v.getId() == R.id.expirationDate){
            final Calendar cldr = Calendar.getInstance();
            int day = cldr.get(Calendar.DAY_OF_MONTH);
            int month = cldr.get(Calendar.MONTH);
            int year = cldr.get(Calendar.YEAR);
            // date picker dialog
            picker = new DatePickerDialog(AddItemActivity.this, R.style.DatePickerTheme,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            expiryDateEntry.setText((monthOfYear + 1) + "/" + dayOfMonth + "/" + year);
                        }
                    }, year, month, day);
            picker.show();
        }
    }
}
