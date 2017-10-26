package com.company;

import java.util.ArrayList;

public class Browser {
    private String name;

    public Browser(ArrayList<Tabs> tabs) {
        this.tabs = tabs;
    }

    ArrayList<Tabs> tabs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addTab(Tabs added)
    {
        tabs.add(added);
    }

    public ArrayList<Tabs> getTabs() {
        return tabs;
    }

    public void setTabs(ArrayList<Tabs> tabs) {
        this.tabs = tabs;
    }
}
