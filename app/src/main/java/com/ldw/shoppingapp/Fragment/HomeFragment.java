package com.ldw.shoppingapp.Fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.GridView;
import android.widget.ViewFlipper;

import com.ldw.shoppingapp.Data.ProductBean;
import com.ldw.shoppingapp.Recycler.HomeGridAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private static final int INTERVAL_TIME=3800;

    private View view;
    private ViewFlipper viewFlipper;
    private GridView gridView;
    private HomeGridAdapter adapter;
    private ArrayList<ProductBean> data;
    private
}
