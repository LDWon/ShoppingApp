package com.ldw.shoppingapp.Fragment;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ldw.shoppingapp.Recycler.ItemClickListener;
import com.ldw.shoppingapp.Recycler.SelectRecyclerAdapter;

public class ShopFragment extends Fragment implements ItemClickListener {
    private static final String TYPE_TOP = "Top";
    private static final String TYPE_BOTTOM = "Bottom";
    private static final String TYPE_ACC = "Acc";

    private View view;
    private RecyclerView recyclerView;
    private SelectRecyclerAdapter tAdapter;
    private String[] tData;
    private Shopre
}
