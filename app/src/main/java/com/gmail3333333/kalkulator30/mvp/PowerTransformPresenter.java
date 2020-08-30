package com.gmail3333333.kalkulator30.mvp;

import android.graphics.Color;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gmail3333333.kalkulator30.R;
import com.gmail3333333.kalkulator30.mathCount.MathCount;

import java.io.File;

import javax.inject.Inject;

public class PowerTransformPresenter implements PowerTransform.Presenter {
    private static final String DIRECTORY_DOCS = "/documents";
    private static final String TAG = "TAG";
    private View viewLayout;
    private PowerTransform.View mView;
    private PowerTransform.Repository repository;

    private String mCurFileName = ""; // имя текущего файла для работы
    private String mPath; // путь к файлу
    private int mPos = 0; // позиция при выборе имени файла в диалоговом окне
    //    private ToDoDatabase mDbHelper;
    private EditText etNam1;
    private EditText etNam3;
    private EditText etEtNam2;
    private EditText etNam4;
    private TextView tvResult;
    private TextView tvResult2;
    private TextView tvResult5;
    private TextView tv2;

    @Inject
    public PowerTransformPresenter(View viewLayout, PowerTransform.View mView) {
        this.viewLayout = viewLayout;
        this.mView = mView;
        initViewElement();
        Log.d(TAG, "ImplPowerTransform: INIT");
    }

    @Override
    public void makeCount(float x) {
        float result = 0;
        float result2 = 0;
        float result3 = 0;
        //проаеряем поля на пустоту
        if (TextUtils.isEmpty(etNam1.getText().toString()) || TextUtils.isEmpty(etEtNam2.getText().toString())) {
            return;
        } else if (TextUtils.isEmpty(etNam3.getText().toString()) || TextUtils.isEmpty(etNam4.getText().toString())) {
            return;

        }
        result = (float) MathCount.makeCount10Amper(etNam1,etEtNam2, x);
        tvResult.setText(result + " " + "Ом");

        result2 = MathCount.ROUND_HALF_UP(etNam3);
        tvResult2.setText(result2 + " " + "Ом");

        result3 = MathCount.makeCount20degrees(etNam4,result2);
        tvResult5.setText(result3 + " "+"%");

        if (result3 != 0) {
            float i = result3;
            if (i > -1 && i < 1) tvResult5.setTextColor(Color.GREEN);
            else tvResult5.setTextColor(Color.RED);
        }
    }

    @Override
    public void initViewElement() {
        etNam4 = viewLayout.findViewById(R.id.etNam4);
        etNam1 = viewLayout.findViewById(R.id.etNam1);
        etNam3 = viewLayout.findViewById(R.id.etNam3);
        etEtNam2 = viewLayout.findViewById(R.id.etNam2);
        tvResult = viewLayout.findViewById(R.id.tvResultSnSave);
        tvResult2 = viewLayout.findViewById(R.id.resultSn2Save);
        tvResult5 = viewLayout.findViewById(R.id.resultSn5);
        tv2 = viewLayout.findViewById(R.id.textView);
        mPath = Environment.getExternalStorageDirectory().toString() + DIRECTORY_DOCS;
        File folder = new File(mPath);
        if(!folder.exists()) {
            folder.mkdir();
        }

    }

    @Override
    public void click(View view) {

    }
}
