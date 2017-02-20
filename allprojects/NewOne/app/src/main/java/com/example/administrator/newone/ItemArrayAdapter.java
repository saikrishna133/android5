package com.example.administrator.newone;


import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2/9/2017.
 */

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder> {

//All methods in this adapter are required for a bare minimum recyclerview adapter
private int listItemLayout;
private ArrayList<ClipData.Item> itemList;
// Constructor of the class
public ItemArrayAdapter(int layoutId, ArrayList<ClipData.Item> itemList) {
        listItemLayout = layoutId;
        this.itemList = itemList;
        }

// get the size of the list
@Override
public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
        }


// specify the row layout file and click for each row
@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
        }

// load data in each row element
@Override
public void onBindViewHolder(final ViewHolder holder, final int listPosition) {
        TextView item = holder.item;
        item.setText(itemList.get(listPosition).getName());
        }

// Static inner class to initialize the views of rows
static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView item;
    public ViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        item = (TextView) itemView.findViewById(R.id.row_item);
    }
    @Override
    public void onClick(View view) {
        Log.d("onclick", "onClick " + getLayoutPosition() + " " + item.getText());
    }
}
}

