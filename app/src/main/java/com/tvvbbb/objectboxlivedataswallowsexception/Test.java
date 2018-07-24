package com.tvvbbb.objectboxlivedataswallowsexception;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by tvvbb on 2018/7/23.
 */
@Entity
public class Test {

    @Id
    long id;

    int i;

    public Test(int i) {
        this.i = i;
    }

}
