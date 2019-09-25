package com.lambton;

import javafx.collections.transformation.SortedList;
import sun.applet.resources.MsgAppletViewer;

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

        Iterator<String> iterator = mStringArrayList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        Set<String> mySet = new HashSet<>();

        mySet.add("India");
        mySet.add("USA");
        mySet.add("Canada");
        mySet.add("China");
        mySet.add("Pakistan");
        System.out.println(mySet);

        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("IND", "India");
        stringStringMap.put("CAD", "Canada");
        stringStringMap.put("USA", "United State");
        stringStringMap.put("PAK", "Pakistan");
        System.out.println(stringStringMap);
        stringStringMap.put("CAD", "Canada");
        System.out.println(stringStringMap);

        ArrayList<String> statesOfIndia = new ArrayList<>();

        statesOfIndia.add("PB");
        statesOfIndia.add("HP");
        statesOfIndia.add("AP");

        ArrayList<String> statesOfUsa = new ArrayList<>();

        statesOfUsa.add("NY");
        statesOfUsa.add("CA");
        statesOfIndia.add("NJ");

        ArrayList<String> statesOfCAD = new ArrayList<>();
        statesOfCAD.add("ON");
        statesOfCAD.add("SK");


        Map<String, ArrayList> stringStringMap1 = new HashMap<>();

        stringStringMap1.put("IND", statesOfIndia);
        stringStringMap1.put("USA", statesOfUsa);
        stringStringMap1.put("CAD", statesOfCAD);
        System.out.println(stringStringMap1.get("CAD"));

        ArrayList<String> checkData = new ArrayList<>();

        checkData.add("abc");
        checkData.add("cab");
        checkData.add("cat");
        checkData.add("mate");
        checkData.add("Atem");
        checkData.add("bac");
        checkData.add("tac");
        checkData.add("atc");
        checkData.add("pop");
        checkData.add("pat");
        checkData.add("123");
        checkData.add("231");
        checkData.add("431");

        /*for (int i=0;i>checkData.size();i++)
        {

            if (checkData.equals(i) == Character.isLetter(c)) {
                System.out.println(checkData.get(i));
            }
        }
        char a = 0;
        for (int i = 0; i < checkData.size(); i++) {
            if (Character.isLetter(a) && a == 'a' && a == 'c' && a == 'b') {
                Character.isLetter(a);
                Character.valueOf(checkData.get(i))= Character.isLetter(a);
                System.out.println(checkData.get(i));
            }*/
        Map<String, ArrayList> map = new HashMap<>();
        for (String s : checkData) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String t = new String(c);
            ArrayList<String> al = map.get(t);
            if (al == null) {
                al = new ArrayList<>();
            }
            al.add(s);
            map.put(t, al);
        }
        System.out.println(map);

        }


