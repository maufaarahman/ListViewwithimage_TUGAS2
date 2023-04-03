package id.ac.uinsuska.listviewwithimage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class programViewHolder {
    ImageView itemImage;
    TextView programTitle;
    TextView programDescription;
    programViewHolder(View v){
        itemImage = v.findViewById(R.id.imageView);
        programTitle = v.findViewById(R.id.textview1);
        programDescription = v.findViewById(R.id.textview2);
    }
}
