package ve.org.cev.caminoalosaltaresv3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luis on 13/02/2016.
 */
public class MyCustomBaseAdapter extends BaseAdapter {
    private static ArrayList<SearchResults> searchArrayList;

    private LayoutInflater mInflater;

    public MyCustomBaseAdapter(Context context, ArrayList<SearchResults> results) {
        searchArrayList = results;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custom_row_view, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.name);
            holder.txtDescription = (TextView) convertView.findViewById(R.id.description);
            holder.ImgPersImage = (ImageView) convertView.findViewById(R.id.perImage);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtName.setText(searchArrayList.get(position).getNombre());
        holder.txtDescription.setText(searchArrayList.get(position).getDescripcion());
        holder.ImgPersImage.setImageResource(searchArrayList.get(position).getImage());

        return convertView;
    }

    static class ViewHolder {
        TextView txtName;
        TextView txtDescription;
        ImageView ImgPersImage;
    }
}
