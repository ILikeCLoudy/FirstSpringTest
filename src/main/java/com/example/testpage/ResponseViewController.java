package com.example.testpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
@RestController
@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mv = new ModelAndView("/viewtemplates")
                .addObject("data", "hello!");
        return mv;
    }
    @RequestMapping("response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!");
        return "viewtemplates";
    }
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!");
    }
}
