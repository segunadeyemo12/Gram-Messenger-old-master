package com.example.texgram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WT1nSAUVYvctWQM3Ed4aXONS0GANcH7uA01vLNUk")
                .clientKey("mWt6v6E62tc7bwS97hUZgHBRvyzuOxMCsWwzrZyk")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}