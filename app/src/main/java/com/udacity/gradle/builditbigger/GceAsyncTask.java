package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

import lastchoice.ely.com.androidlibary.PresentJoke;

/**
 * Created by Lior on 5/27/2018.
 */

public class GceAsyncTask extends AsyncTask<Context, Void, String> {

    private static MyApi jokesApi = null;
    public Context context;

    @Override
    protected String doInBackground(Context... params) {
        if(jokesApi == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            jokesApi = builder.build();
        }

        context = params[0];


        try {
            return jokesApi.getJokeApi().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        Intent intent = new Intent(context,PresentJoke.class);
        intent.putExtra("gce_result",result);
        context.startActivity(intent);
    }
}