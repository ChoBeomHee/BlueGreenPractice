package server.testsever;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/test/hello")
    @ResponseBody
    public String TEST(){
        return "<html>" +
                "<body>" +
                "<h1>Hello, World!!!12!</h1>" +
                "</body>" +
                "</html>";
    }


}