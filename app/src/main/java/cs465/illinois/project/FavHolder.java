package cs465.illinois.project;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FavHolder extends RecyclerView.ViewHolder {

    private TextView txtRecipeName;
    private ImageView imgRecipePicture;

    public FavHolder(View itemView){
        super(itemView);
        txtRecipeName = itemView.findViewById(R.id.txtRecipeName);
        imgRecipePicture = itemView.findViewById(R.id.imgRecipePicture);
    }

    public void setInfo(Recipe recipe) {
        txtRecipeName.setText(recipe.getRecipeName());
        imgRecipePicture.setImageDrawable(recipe.getRecipePicture());
    }

}
