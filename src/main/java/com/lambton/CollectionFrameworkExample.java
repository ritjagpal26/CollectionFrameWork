package com.lambton;

import java.util.*;

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

        Set<String> mySet=new HashSet<>();

        mySet.add("India");
        mySet.add("USA");
        mySet.add("Canada");
        mySet.add("China");
        mySet.add("Pakistan");
        System.out.println(mySet);

        Map<String, String> stringStringMap=new HashMap<>();
        stringStringMap.put("IND", "India");
        stringStringMap.put("CAD", "Canada");
        stringStringMap.put("USA", "United State");
        stringStringMap.put("PAK", "Pakistan");
        System.out.println(stringStringMap);
        stringStringMap.put("CAD", "Canada");
        System.out.println(stringStringMap);

        ArrayList <String> statesOfIndia=new ArrayList<>();

        statesOfIndia.add("PB");
        statesOfIndia.add("HP");
        statesOfIndia.add("AP");

        ArrayList <String> statesOfUsa=new ArrayList<>();

        statesOfUsa.add("NY");
        statesOfUsa.add("CA");
        statesOfIndia.add("NJ");

        ArrayList <String> statesOfCAD=new ArrayList<>();
        statesOfCAD.add("ON");
        statesOfCAD.add("SK");


        Map<String,ArrayList > stringStringMap1=new HashMap<>();

        stringStringMap1.put("IND",statesOfIndia);
        stringStringMap1.put("USA",statesOfUsa);
        stringStringMap1.put("CAD",statesOfCAD);
        System.out.println(stringStringMap1);

    }
}
