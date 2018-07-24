package com.tvvbbb.objectboxlivedataswallowsexception;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

/**
 * Created by tvvbb on 2018/7/23.
 */
@Entity
public class Test<T> {

    @Id
    long id;

    int i;

    ToOne<T> t;

    public Test(int i) {
        this.i = i;
    }


}
