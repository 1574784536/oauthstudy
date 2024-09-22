package du.nf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YXD
 * @date 2024/9/22
 */
@RestController
@RequestMapping("/public")
public class PublicController {
    @RequestMapping("/public")
    public String publicIndex(){
        return "public public";
    }
}
