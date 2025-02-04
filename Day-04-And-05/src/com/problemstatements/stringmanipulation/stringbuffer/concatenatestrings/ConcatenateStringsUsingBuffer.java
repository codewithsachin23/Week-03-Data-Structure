package com.problemstatements.stringmanipulation.stringbuffer.concatenatestrings;

public class ConcatenateStringsUsingBuffer {
    public static String concatenateStrings(String [] words){
        StringBuffer stringBuffer=new StringBuffer();
        for (String i:words){
            stringBuffer.append(i);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Have", " a", " nice", " day!"};
        System.out.println(concatenateStrings(words)); // Output: Hello World! Have a nice day!

    }
}
