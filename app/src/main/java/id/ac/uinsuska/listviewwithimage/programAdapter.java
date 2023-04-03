package id.ac.uinsuska.listviewwithimage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class programAdapter extends ArrayAdapter<String> {
    Context context;
    int[] images;
    String[] programName;
    String[] programDescription;
    String[] urls;
    public programAdapter( Context context, String[] programName,int[] images,String[] programDescription, String []urls) {
        super(context, R.layout.singel_item, R.id.textview1, programName);
        this.context = context;
        this.images = images;
        this.programName = programName;
        this.programDescription = programDescription;
        this.urls = urls;
    }



    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View singleItem = convertView;
        programViewHolder holder = null;
        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.singel_item,parent, false);
            holder = new programViewHolder(singleItem);
            singleItem.setTag(holder);

        }
        else {
            holder = (programViewHolder) singleItem.getTag();
        }
        holder.itemImage.setImageResource(images[position]);
        holder.programTitle.setText(programName[position]);
        holder.programDescription.setText(programDescription[position]);
        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Kamu Tekan :" + programName[position], Toast.LENGTH_SHORT).show();
                Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                context.startActivities(new Intent[]{openlinkIntent});
            }
        });
        return singleItem;
    }
}
