package com.github.wangwei86609.weitool;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;

public class PlaceHolder {

    public static void main(String[] args) {
        //org.slf4j.helpers.MessageFormatter.arrayFormat(msg,args).getMessage();
        //      Object[] arr=new Object[]{"this"};
       //String msg= MessageFormatter.arrayFormat("this is {},",arr).getMessage();

        Map<String, String> values = new HashMap<String, String>();
        values.put("value", "x");
        values.put("column", "y");
        StrSubstitutor sub = new StrSubstitutor(values, "%(", ")");
        String result = sub.replace("There's an incorrect value '%(value)' in column # %(column)");
        System.out.println(result);
    }
    
}
