package com.company.medium;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codec535 {
    // Encodes a URL to a shortened URL.
    Map<String,String> map=new HashMap<>();
    String code="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    int flag=0;
    public String encode(String longUrl) {
        if("/".equals(((Character)longUrl.charAt(longUrl.length()-1)).toString())){
            flag=1;
        }
        String shortURL="";
        String[] str=longUrl.split("/");
        Random random=new Random();
        shortURL+=str[0]+"//";
        for(int i=2;i<str.length;i++){
            StringBuffer name=new StringBuffer();
            for(int j=0;j<3;j++){
            name.append(code.charAt(random.nextInt(62)));
            }
            map.put(String.valueOf(name),str[i]);
            shortURL+=name+"/";
        }
        return shortURL;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String longUrl="";
        String[] str=shortUrl.split("/");
        Random random=new Random();
        longUrl+=str[0]+"/";
        for(int i=2;i<str.length;i++){
            longUrl+="/"+map.get(str[i]);
        }
        if (flag==1) {
            longUrl += "/";
        }
        return longUrl;
    }
}
