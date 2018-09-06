package com.lhy.dagger2test.mvpnettest.service;

import com.lhy.dagger2test.mvpnettest.service.entity.Book;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by lhy on 2018/9/6 0006.
 * Description:
 */
public interface RetrofitService {
    @GET("book/search")
    Observable<Book> getSearchBooks(@Query("q") String name,@Query("tag") String tag,
                                    @Query("start") int start,
                                    @Query("count") int count);
}
