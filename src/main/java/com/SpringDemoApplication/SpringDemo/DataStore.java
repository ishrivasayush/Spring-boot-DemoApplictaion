package com.SpringDemoApplication.SpringDemo;

import java.util.HashMap;

public class DataStore {
    public HashMap<String,String> hashMap=new HashMap<>();
    public DataStore()
    {
        hashMap.put("Ayush","SDE");
        hashMap.put("Abhay","SE");
        hashMap.put("Aditi","Backend Developer");
        hashMap.put("Abha","Doctor");
    }
    public String dataFetch(String q)
    {
        return hashMap.get(q);
    }
}
