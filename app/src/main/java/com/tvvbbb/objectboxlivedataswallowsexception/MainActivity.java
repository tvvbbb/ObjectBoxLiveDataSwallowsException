package com.tvvbbb.objectboxlivedataswallowsexception;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.android.ObjectBoxLiveData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BoxStore boxStore = ((App)getApplication()).getBoxStore();
        final Box<Test> testBox  =boxStore.boxFor(Test.class);
        ObjectBoxLiveData<Test> testObjectBoxLiveData = new ObjectBoxLiveData<>(testBox.query().build());
        testObjectBoxLiveData.observe(this, new Observer<List<Test>>() {
            @Override
            public void onChanged(@Nullable List<Test> tests) {
                Log.i("a",tests.size() + "");
            }
        });


        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //run this testObjectBoxLiveData no call-back
                //testBox.put(new Test(1));

                //run this will make exception.
                //List<Test> testList = testBox.query().build().find();

            }
        });

    }
}
