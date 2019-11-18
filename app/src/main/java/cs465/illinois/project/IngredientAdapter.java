package cs465.illinois.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class IngredientAdapter extends BaseAdapter {

    private final Context mContext;
    private final List<Ingredient> ingredients;


    // 1
    public IngredientAdapter(Context context, List<Ingredient> ingredients) {
        this.mContext = context;
        this.ingredients = ingredients;
    }

    // 2
    @Override
    public int getCount() {
        return ingredients.size();
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        final Ingredient ingredient = ingredients.get(position);

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_ingredient, null);
        }

        // 3
        final ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview_ingredient_image);
        final TextView nameTextView = (TextView)convertView.findViewById(R.id.textview_ingredient_name);

        // 4
        imageView.setImageResource(ingredient.getImageResource());
        nameTextView.setText(mContext.getString(ingredient.getName()));

        return convertView;
    }

}
