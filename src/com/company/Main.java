package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Browser> browsers = new ArrayList<Browser>();
        ArrayList<Tabs> tab = new ArrayList<Tabs>();
        String explorer = "", yes="";
        Scanner keyboard = new Scanner(System.in);
        Browser browser = new Browser(tab);


        System.out.println("Please choose your browser");
        explorer = keyboard.nextLine();

        if (!explorer.equalsIgnoreCase("Internet Explorer"))
        {
            browser.setName(keyboard.nextLine());
            do {

                Tabs tabs = new Tabs();
                System.out.println("Add your titles");
                tabs.setTitle(keyboard.nextLine());
                System.out.println("Add your url");
                tabs.setUrl(keyboard.nextLine());
                System.out.println("would you like to add titles and urls? (Y/N)");
                browser.addTab(tabs);
                yes=keyboard.nextLine();


            }while (yes.equalsIgnoreCase("y")&& !yes.equalsIgnoreCase("n"));

        }

        else
        System.out.println("the system doesn't support Internet Explorer ");

        //System.out.println(browser.getName());

        for(Tabs x: browser.getTabs())
        {
            System.out.println("Browser name: "+browser.getName());
            System.out.println("Title: "+x.getTitle());
            System.out.println("The url address: "+x.getUrl());

        }
    }
}
