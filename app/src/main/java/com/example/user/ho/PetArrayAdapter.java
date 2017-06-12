package com.example.user.ho;

import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by User on 2017/6/12.
 */

public class PetArrayAdapter extends ArrayAdapter<Pet> {
    Context context;
    public PetArrayAdapter(Context context, List<Pet> items) {
        super(context, 0, items);
        this. context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater. from(context);
        LinearLayout itemlayout = null;
        if (convertView == null) {
            itemlayout = (LinearLayout) itemlayout.inflate();
        } else {
            itemlayout = (LinearLayout) convertView;
        }
        Hotel item = (Hotel) getItem(position);
        TextView tvShelter = (TextView) itemlayout.findViewById(R.id. tv_shelter);
        tvShelter.setText(item.getShelter());
        TextView tvKind = (TextView) itemlayout.findViewById(R.id. tv_kind);
        tvKind.setText(item.getKind());
        ImageView ivPet = (ImageView) itemlayout.findViewById(R.id. iv_pet);
        ivPet.setImageBitmap(item.getImgUrl());
        return itemlayout;
    }
}
