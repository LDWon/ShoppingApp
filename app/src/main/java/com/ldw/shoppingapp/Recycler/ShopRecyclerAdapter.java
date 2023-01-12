package com.ldw.shoppingapp.Recycler;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ldw.shoppingapp.BottomSheetDialog;
import com.ldw.shoppingapp.Data.ProductBean;
import com.ldw.shoppingapp.R;

import java.util.ArrayList;

public class ShopRecyclerAdapter extends RecyclerView.Adapter<ShopRecyclerAdapter.ShopViewHolder> {
    private ArrayList<ProductBean> data;
    private ItemClickListener listener;

    public ShopRecyclerAdapter(ArrayList<ProductBean> data, ItemClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

    @NonNull
    @androidx.annotation.NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_item_card,viewGroup,false);
        return new ShopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull ShopViewHolder shopViewHolder, int i) {
        ProductBean productBean=data.get(i);

        shopViewHolder.productImage.setImageDrawable(getima);
    }
    public Drawable getImage(byte[] bytes){
        Bitmap
    }
    public class ShopViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productName;
        TextView productPrice;
        private Context context;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.imageView);
            productName = itemView.findViewById(R.id.productNameTv);
            productPrice = itemView.findViewById(R.id.productPriceTv);
            context = itemView.getContext();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.getInstance();
                    bottomSheetDialog.show(((AppCompatActivity) context).getSupportFragmentManager(), "bottomSheet");
                }
            });
        }
    }
}
