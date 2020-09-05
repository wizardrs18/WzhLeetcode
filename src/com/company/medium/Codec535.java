package com.company.medium;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codec535 {
    // Encodes a URL to a shortened URL.
    Map<String,String> map=new HashMap<>();
    String code="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public String encode(String longUrl) {
        String shortURL="";
        String[] str=StringUtils.splitString(longUrl,"/");
        Random random=new Random();
        shortURL+=str[0]+"//";
        for(int i=1;i<str.length;i++){
            StringBuffer name=new StringBuffer();
            for(int j=0;j<3;j++){
            name.append(code.charAt(random.nextInt(62)));
            }
            map.put(String.valueOf(name),str[i]);
            shortURL+=String.valueOf(name);
        }
        return shortURL;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String longUrl="";
        String[] str=StringUtils.splitString(shortUrl,"/");
        Random random=new Random();
        longUrl+=str[0]+"//";
        for(int i=1;i<str.length;i++){
            longUrl+=map.get(str[i]);
        }
        return longUrl;
    }
}
