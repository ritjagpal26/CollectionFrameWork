package com.lambton;

import java.util.ArrayList;

public class CollectionFrameworkExample
{
    public static void main(String [] args) {
        ArrayList<String> mStringArrayList = new ArrayList<>();

        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("D");
        mStringArrayList.add("A");
        mStringArrayList.add("A");
        for (int i=0; i<mStringArrayList.size(); i++)
        {
            System.out.println("Elements :"+mStringArrayList.get(i));
        }

    }

}
