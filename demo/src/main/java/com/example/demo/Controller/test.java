package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class test {
    @RequestMapping("/{someID}")
    public @ResponseBody
    int getAttr(@PathVariable(value = "someID") String id,
                @RequestParam String someAttr) {
        return Integer.parseInt(someAttr);
    }
}
