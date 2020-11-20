package com.ramesh.coding;

import arrays.ArrayQuestions;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] a = new String[]{"a","a","a" ,"b","b","b","b","c"};
        int index =ArrayQuestions.compress(a);
        System.out.print(index);
    }
}
