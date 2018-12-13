package com.example.himanshu.exosearch;

import android.nfc.Tag;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.util.Scanner;

public class ReadJson extends AsyncTask<InputStream,Void,String> {
    public static final String TAG="RJ";
    @Override
    protected String doInBackground(InputStream... inputStreams) {
        Scanner scanner=new Scanner(inputStreams[0]);
        StringBuilder stringBuilder=new StringBuilder();
        while(scanner.hasNextLine())
        stringBuilder.append(scanner.nextLine());
        String json=stringBuilder.toString();
        Log.d(TAG, "doInBackground: "+json);
        return json;
    }
}
