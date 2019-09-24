package com.lambton;

import java.util.ArrayList;
import java.util.Iterator;

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
        /*for (int i=0; i<mStringArrayList.size(); i++)
        {
            System.out.println("Elements :"+mStringArrayList.get(i));
        }
        for (String num:mStringArrayList)
        {
            System.out.println(num);
        }*/
        //mStringArrayList.iterator()

        Iterator<String> iterator=mStringArrayList.iterator();
        while (iterator.hasNext())

        {
            String s=iterator.next();
            System.out.println(s);
        }
    }
}
