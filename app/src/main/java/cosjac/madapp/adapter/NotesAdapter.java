package cosjac.madapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cosjac.madapp.R;
import cosjac.madapp.model.ListItem;

/**
 * Created by Sam on 07/05/2016.
 */
public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesHolder> {

    private List<ListItem> listData;
    private LayoutInflater layoutInflater;

    public NotesAdapter (List<ListItem> _listData, Context c){
        this.layoutInflater = LayoutInflater.from(c);
        listData = _listData;
    }

    @Override
    public NotesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);

        return new NotesHolder(view);
    }

    @Override
    public void onBindViewHolder(NotesHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class NotesHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView icon;
        private View container;

        public NotesHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.label_item_textTitle);
            icon = (ImageView)itemView.findViewById(R.id.im_item_icon);
            container =itemView.findViewById(R.id.cont_item_root);
        }
    }
}
