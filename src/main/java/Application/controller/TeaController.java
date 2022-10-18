package Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Application.component.TeaSpider;

@RestController
public class TeaController {
    @Autowired
    private TeaSpider teaSpider;

    @RequestMapping("/crawler")
    public String crawler(){
        teaSpider.doCrawler();
        return "OK";
    }

}
