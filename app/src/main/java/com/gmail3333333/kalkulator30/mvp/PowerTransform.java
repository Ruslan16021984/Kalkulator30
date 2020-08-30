package com.gmail3333333.kalkulator30.mvp;

import android.view.View;

import com.gmail3333333.kalkulator30.repository.dao.PowerTransDao;

public interface PowerTransform {
    interface View{
        void showOpenFileDialog();
    }
    interface Presenter{
        void makeCount(float x);
        void initViewElement();
        void click(android.view.View view);

    }
    interface Repository{
        String[] getFiles(String dirPath);
        void openFile(String fileName);
        void saveState();
        void insertPOwerTrans(PowerTransDao dao);
    }
}
