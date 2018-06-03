package com.udacity.gradle.builditbigger.builditbigger;

import android.support.test.InstrumentationRegistry;

import com.udacity.gradle.builditbigger.GceAsyncTask;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEmptyString.isEmptyString;

/**
 * Created by Lior on 5/29/2018.
 */

public class GceAsyncTaskTest {


    @Test
    public void is_valid_string() throws Exception {

        GceAsyncTask gceAsyncTaskTest = new GceAsyncTask();
        new GceAsyncTask().execute(InstrumentationRegistry.getContext());
        String jokesTest =gceAsyncTaskTest.get(4, TimeUnit.SECONDS);
        assertThat(jokesTest,is(not(isEmptyString())));

    }
}
