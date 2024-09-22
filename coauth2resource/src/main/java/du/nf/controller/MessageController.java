package du.nf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YXD
 * @date 2024/9/22
 */
@RestController
public class MessageController {
    @GetMapping("/message")
    public String message() {
        return "hello message";
    }
}
