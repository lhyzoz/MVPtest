package com.lhy.dagger2test.mvptest;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lhy.dagger2test.R;
import com.lhy.dagger2test.mvptest.base.BaseActivity;

public class MVPActivity extends BaseActivity implements MVPView {
    TextView mText;
    MVPPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        initview();
        mPresenter = new MVPPresenter();
        mPresenter.attachView(this);
    }

    private void initview() {
        mText = findViewById(R.id.text);
    }

    @Override
    public void showToast(String msg) {
        super.showToast(msg);
    }

    public void getData(View view) {
        mPresenter.getDate("normal");
    }

    public void getDataForFailure(View view) {
        mPresenter.getDate("failure");
    }

    public void getDataForError(View view) {
        mPresenter.getDate("error");
    }

    @Override
    public void showData(String data) {
        mText.setText(data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView(this);
    }
}
