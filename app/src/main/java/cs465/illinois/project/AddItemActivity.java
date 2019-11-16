package cs465.illinois.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class AddItemActivity extends AppCompatActivity implements View.OnClickListener {
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        backButton = (Button) findViewById(R.id.backa);
        backButton.setVisibility(View.VISIBLE);
        backButton.setBackgroundColor(Color.TRANSPARENT);
        backButton.setOnClickListener(this);


        String[] food = {"asparagus", "apples", "avacado", "alfalfa", "acorn squash", "almond", "arugala", "artichoke", "applesauce", "asian noodles", "antelope", "ahi tuna", "albacore tuna", "Apple juice", "Avocado roll", "bruscetta", "butter", "bacon", "black beans", "bagels", "baked beans", "BBQ", "bell peppers", "bison", "barley", "beer", "bisque", "bluefish", "bread", "broccoli", "buritto", "babaganoosh", "cheddar cheese", "Cabbage", "cake", "carrots", "carne asada", "celery", "cheese", "chicken", "catfish", "chips", "chocolate", "chowder", "clams", "coffee", "cookies", "corn", "cupcakes", "crab", "curry", "cereal", "chimichanga", "dates", "dips", "duck", "dumplings", "donuts", "eggs", "enchilada", "eggrolls", "English muffins", "edimame", "eel sushi", "fajita", "falafel", "fish", "franks", "fondu", "French toast", "French dip", "garlic powder", "Garlic", "ginger", "gnocchi", "goose", "granola", "grapes", "green beans", "Guancamole", "gumbo", "grits", "Graham crackers", "ham", "halibut", "hamburger", "honey", "huenos rancheros", "hash browns", "hot dogs", "haiku roll", "hummus", "ice cream", "Irish stew", "Indian food", "Italian bread", "jambalaya", "jelly / jam", "jerky", "jalapeño", "kale", "kabobs", "ketchup", "kiwi", "kidney beans", "kingfish", "lobster", "Lamb", "Linguine", "Lasagna", "mozzarella cheese", "Meatballs", "Moose", "Milk", "Milkshake", "Noodles", "olive oil", "oregano", "Ostrich", "onions", "pasta", "parmesan cheese", "Pizza", "pepper", "Pepperoni", "Porter", "Pancakes", "Quesadilla", "Quiche", "Reuben", "salt", "Spinach", "Spaghetti", "Tater tots", "tortillas", "tomato", "Toast", "Venison", "Waffles", "Wine", "Walnuts", "Yogurt", "Ziti", "Zucchini"};
        //Creating the instance of ArrayAdapter containing list of fruit names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, food);
        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
    }

    public void onClick(View v) {
        if (v.getId() == R.id.backa) {
            Intent intent = new Intent(this, FridgeActivity.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}
