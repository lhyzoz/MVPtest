package com.lhy.dagger2test.mvpnettest.ui;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lhy.dagger2test.R;
import com.lhy.dagger2test.mvpnettest.service.entity.Book;
import com.lhy.dagger2test.mvpnettest.service.presenter.BookPresenter;
import com.lhy.dagger2test.mvpnettest.service.view.BookView;

public class SearchBooksActivity extends BaseActivity implements BookView, View.OnClickListener {
    private TextView mText;
    private Button mButton;
    private BookPresenter mPresenter;

    @Override
    public void setListener() {

    }

    @Override
    protected void initView(View contextView) {
        mText = find(R.id.text);
        mButton = find(R.id.btn);
        mPresenter = new BookPresenter(this);
        mPresenter.attachView(this);
        mPresenter.onCreat();
        mButton.setOnClickListener(this);
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_search_books;
    }

    @Override
    public void onSuccess(Book book) {
        mText.setText(book.toString());
    }

    @Override
    public void onError(String msg) {

    }


    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                mPresenter.getSearchBooks("西游记", null, 0, 1);
                break;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView(this);
    }

}
