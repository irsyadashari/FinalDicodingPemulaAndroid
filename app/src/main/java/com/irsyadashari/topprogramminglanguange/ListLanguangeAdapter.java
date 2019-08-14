package com.irsyadashari.topprogramminglanguange;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLanguangeAdapter extends RecyclerView.Adapter<ListLanguangeAdapter.ListViewHolder>{

    private ArrayList<Languange> listLanguange;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public  ListLanguangeAdapter (ArrayList<Languange> list){this.listLanguange = list;}

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_languange, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, int i) {


        Languange languange = listLanguange.get(i);
        Glide.with(listViewHolder.itemView.getContext())
                .load(languange.getPhoto())
                .apply(new RequestOptions().override(80,80))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvName.setText((languange.getName()));
        listViewHolder.tvDeveloper.setText(languange.getDeveloper());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listLanguange.get(listViewHolder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listLanguange.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDeveloper;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDeveloper = itemView.findViewById(R.id.tv_item_developer);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Languange data);
    }
}
