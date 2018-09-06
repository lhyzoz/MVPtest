package com.lhy.dagger2test.mvpnettest.service.presenter;

import android.content.Context;

import com.lhy.dagger2test.mvpnettest.service.entity.Book;
import com.lhy.dagger2test.mvpnettest.service.manager.DateManager;
import com.lhy.dagger2test.mvpnettest.service.view.BookView;

import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by lhy on 2018/9/5 0005.
 * Description:
 */
public class BookPresenter extends BasePresenter<BookView> {
    private DateManager mDateManager;
    private CompositeSubscription mSubscription;
    private Context mContext;
    private BookView mView;
    private Book mBook;
    public BookPresenter(Context context){
        this.mContext=context;
    }

    @Override
    public void onCreat() {
        mDateManager=new DateManager(mContext);
        mSubscription=new CompositeSubscription();
    }

    @Override
    public void onStop() {
        if (mSubscription.hasSubscriptions()){
            mSubscription.unsubscribe();
        }
    }

    public void getSearchBooks(String name,String tag,int start,int count){
        mSubscription.add(mDateManager.getSearchBooks(name, tag, start, count)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Book>() {
                    @Override
                    public void onCompleted() {
                        if (mBook!=null){
                            getView().onSuccess(mBook);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Book book) {
                        mBook=book;
                    }
                }));

    }
}
