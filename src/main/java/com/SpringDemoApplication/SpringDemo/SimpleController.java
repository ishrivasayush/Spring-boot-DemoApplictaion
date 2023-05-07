package com.SpringDemoApplication.SpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/hi")
    public String sayHi()
    {
        return "Hello From our Server!";
    }
    @GetMapping("/search")
    public String search(@RequestParam String q)
    {
        return "A Good Batsman.";
    }
    @GetMapping("/search2")
    public String search2(@RequestParam String q)
    {
        DataStore dataStore=new DataStore();
        return dataStore.dataFetch(q);
    }
}
