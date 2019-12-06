package cs465.illinois.project;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static cs465.illinois.project.MainActivity.getImage;
import static cs465.illinois.project.MainActivity.recipes;

public class RecipeHolder extends RecyclerView.ViewHolder {

    private TextView txtRecipeName, txtPrepTime, txtDifficulty, txtMissingIngredients, txtPercentMatch;
    private ImageView imgRecipePicture;
    private Button btnMainFavorited;
    private Button btnViewRecipe;
    private View item;
    private Context context;

    public RecipeHolder(View itemView, Context context){
        super(itemView);
        item = itemView;
        txtRecipeName = itemView.findViewById(R.id.txtRecipeName);
        imgRecipePicture = itemView.findViewById(R.id.imgRecipePicture);
        txtPrepTime = itemView.findViewById(R.id.txtPrepTime);
        txtDifficulty = itemView.findViewById(R.id.txtDifficulty);
        txtMissingIngredients = itemView.findViewById(R.id.txtMissingIngredients);
        txtPercentMatch = itemView.findViewById(R.id.txtPercentMatch);
        btnMainFavorited = itemView.findViewById(R.id.btnMainFavorited);
        btnViewRecipe = itemView.findViewById(R.id.btnViewRecipe);

        btnMainFavorited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecipeAdapter.onClickListener.favouriteButtonOnClick(v, getAdapterPosition());
            }
        });

        btnViewRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecipeAdapter.onClickListener.viewRecipeButtonOnClick(v, getAdapterPosition());
            }
        });

        this.context = context;
    }

    public void setInfo(Recipe recipe, int position) {
        item.setId(position);
        txtRecipeName.setText(recipe.getRecipeName());
        imgRecipePicture.setImageDrawable(recipe.getRecipePicture());
        txtPrepTime.setText(recipe.getPrepTime());
        txtDifficulty.setText(recipe.getDifficulty());
        txtMissingIngredients.setText("missing: " + recipe.getMissingIngredients());
        txtPercentMatch.setText(recipe.getPercentMatch() + "% match");
        if (recipes.get(position).getFavorited() == true){
            btnMainFavorited.setBackgroundDrawable(getImage(context, "icon_heartfilled"));
        } else {
            btnMainFavorited.setBackgroundDrawable(getImage(context, "icon_heart"));
        }

    }

}
