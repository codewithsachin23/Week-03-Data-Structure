package com.problemstatement.stringconcatenationperformance;

public class StringComparison {
    public static void stringConcat(String string,int dataSize){
        String result=" ";
        for (int i=0;i<dataSize;i++){
            result+=string;
        }
    }
    public static void stringBuilderConcat(String string,int dataSize){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<dataSize;i++){
            stringBuilder.append(string);
        }
    }
    public static void stringBufferConcat(String string,int dataSize){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<dataSize;i++){
            stringBuffer.append(string);
        }
    }
}
