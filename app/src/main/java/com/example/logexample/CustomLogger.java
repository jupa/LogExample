package com.example.logexample;

import android.content.Context;
import android.os.Environment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CustomLogger {

    public void appendLog(Context c, String t){
        File logDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
        if (!logDir.exists()) {

            logDir.mkdir();
        }
        File logFile = new File(logDir, "log.txt");
        // /storage/emulated/0/Documents/log.txt
        try{
            BufferedWriter buf = new BufferedWriter(new FileWriter(logFile,true));
            buf.append(t);
            buf.newLine();
            buf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
