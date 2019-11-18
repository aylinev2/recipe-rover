package cs465.illinois.project;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeHolder extends RecyclerView.ViewHolder {

    private TextView txtRecipeName, txtPrepTime, txtDifficulty, txtMissingIngredients, txtPercentMatch;
    private ImageView imgRecipePicture;

    public RecipeHolder(View itemView){
        super(itemView);
        txtRecipeName = itemView.findViewById(R.id.txtRecipeName);
        imgRecipePicture = itemView.findViewById(R.id.imgRecipePicture);
        txtPrepTime = itemView.findViewById(R.id.txtPrepTime);
        txtDifficulty = itemView.findViewById(R.id.txtDifficulty);
        txtMissingIngredients = itemView.findViewById(R.id.txtMissingIngredients);
        txtPercentMatch = itemView.findViewById(R.id.txtPercentMatch);
    }

    public void setInfo(Recipe recipe) {
        txtRecipeName.setText(recipe.getRecipeName());
        imgRecipePicture.setImageDrawable(recipe.getRecipePicture());
        txtPrepTime.setText(recipe.getPrepTime());
        txtDifficulty.setText(recipe.getDifficulty());
        txtMissingIngredients.setText("missing: " + recipe.getMissingIngredients());
        txtPercentMatch.setText(recipe.getPercentMatch() + "% match");
    }

}
