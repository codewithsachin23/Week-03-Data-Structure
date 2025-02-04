package com.problemstatements.search.linearsearch.searchspecificwordinlist;

public class SearchForASpecificWordInList {
    public static String searchWord(String [] sentences,String word){
        for (String s:sentences){
            if (s.contains(word)){
                return s;
            }
        }
        return "Not Found";

    }

    public static void main(String[] args) {
        String[] sentences = {
                "I love programming.",
                "Java is a great language.",
                "Linear search is simple to implement.",
                "Searching for a word is easy."
        };
        String word = "Java";
        System.out.println(searchWord(sentences,word));


    }
}
