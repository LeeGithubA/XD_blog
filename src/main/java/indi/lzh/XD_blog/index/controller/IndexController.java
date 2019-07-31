package indi.lzh.XD_blog.index.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLASSNAME IndexController
 * @DESCRIPTION TODO
 * @AUTHOR Administrator
 * @DATE 2019/7/31 15:32
 * @VERSIONI 1.0
 **/
@RestController
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "Hello World";
    }
}
