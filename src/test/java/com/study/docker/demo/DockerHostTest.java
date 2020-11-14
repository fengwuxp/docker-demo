package com.study.docker.demo;


import org.junit.jupiter.api.Test;

public class DockerHostTest {


    @Test
    public void testGetDockerHost(){
        System.out.printf(System.getenv("DOCKER_HOST"));
    }
}
