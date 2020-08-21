package com.example.santiago;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class GlobalClass extends Application {
    private List<Integer> globalArrayList = new ArrayList<>();

    public List<Integer> getGlobalArrayList() {
        return globalArrayList;
    }

    public void setGlobalArrayList(List<Integer> globalArrayList) {
        this.globalArrayList = globalArrayList;
    }
}
