package pt.openshift.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/opshift/v1")
public class TestController {

    @GetMapping("/getTest")
    public Name getTestName() {

        Name nomeObj = new Name("Fabio", "Santos");
        return nomeObj;
    }
}