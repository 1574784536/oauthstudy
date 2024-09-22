package du.nf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YXD
 * @date 2024/9/22
 */
@RestController
public class UserInfoController {

    @RequestMapping("/userinfo")
    public String info() {
        return "hello world";
    }
}
