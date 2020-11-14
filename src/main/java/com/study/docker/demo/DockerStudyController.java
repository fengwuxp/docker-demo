package com.study.docker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxp
 */
@RestController
@RequestMapping("/docker")
public class DockerStudyController {

    @GetMapping("/hello")
    public String hello() {
        return "hello docker";
    }

    @GetMapping("/jib")
    public String jib() {
        return "hello jib";
    }
}
