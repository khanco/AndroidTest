package com.example.test.screens.starcharacterlist.mvvm.views;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.test.R;
import com.example.test.databinding.ListItemCharacterBinding;
import com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter;
import java.util.List;

public class StarCharacterAdapter extends RecyclerView.Adapter<StarCharacterAdapter.Item> {

    private List<StarCharacter> data;
    private LayoutInflater layoutInflater;
    private IStarCharacterListCallback callback;

    StarCharacterAdapter(List<StarCharacter> data) {
        this.data = data;
    }

    @NonNull @Override
    public Item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        return new Item((ListItemCharacterBinding) DataBindingUtil.inflate(layoutInflater, R.layout.list_item_character, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final Item holder, final int position) {
        holder.binding.setModel(data.get(holder.getAdapterPosition()));
        holder.binding.itemContainer.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                callback.onStarCharacterSelected(data.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override public int getItemCount() {
        return data.size();
    }

    public class Item extends RecyclerView.ViewHolder {

        ListItemCharacterBinding binding;

        Item(ListItemCharacterBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public void setInterface(IStarCharacterListCallback callback) {
        this.callback = callback;
    }

    public interface IStarCharacterListCallback {
        void onStarCharacterSelected(StarCharacter character);
    }
}
