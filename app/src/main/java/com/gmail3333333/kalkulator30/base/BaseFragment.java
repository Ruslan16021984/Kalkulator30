package com.gmail3333333.kalkulator30.base;

import android.content.Context;

import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {
    private String title;
    private Context context;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setContext(Context context) {
        this.context = context;
    }
}
