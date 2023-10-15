package com.example.md4_bai1_baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ChangeController {
    @GetMapping("/change")
    public ModelAndView showChange() {
        return new ModelAndView("list");
    }

    @PostMapping("/change")
    public ModelAndView change(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("list");
        int usd = Integer.parseInt(request.getParameter("usd"));
        int rate = Integer.parseInt(request.getParameter("rate"));
        int vnd = usd * rate;
        modelAndView.addObject("change", vnd);
        return modelAndView;
    }
}
