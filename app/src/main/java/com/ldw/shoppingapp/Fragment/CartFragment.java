package com.ldw.shoppingapp.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ldw.shoppingapp.Data.ProductBean;
import com.ldw.shoppingapp.Data.ProductDBHelper;
import com.ldw.shoppingapp.R;
import com.ldw.shoppingapp.Recycler.CartRecyclerAdapter;
import com.ldw.shoppingapp.Recycler.ItemClickListener;

import java.util.ArrayList;

public class CartFragment extends Fragment implements ItemClickListener {
    private View view;
    private RecyclerView recyclerView;
    private CartRecyclerAdapter adapter;
    private ArrayList<ProductBean> data;
    private ProductDBHelper dbHelper;

    @Nullable
    @androidx.annotation.Nullable
    @Override
    public View onCreateView(@NonNull @androidx.annotation.NonNull LayoutInflater inflater, @Nullable @androidx.annotation.Nullable ViewGroup container, @Nullable @androidx.annotation.Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_cart_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable @androidx.annotation.Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showProduct();
    }
    private void showProduct(){
        dbHelper=ProductDBHelper.getInstance(getContext());
        data=dbHelper.getAllProduct();

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new CartRecyclerAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View v, int position) {

    }
}
