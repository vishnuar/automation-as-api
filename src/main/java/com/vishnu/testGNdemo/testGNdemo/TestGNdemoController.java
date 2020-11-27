package com.vishnu.testGNdemo.testGNdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vishnu.testGNdemo.testGNdemo.TestGNGoogle;
import org.testng.TestNG;


@RestController
public class TestGNdemoController {

  @RequestMapping("/")
  public String Welcome() {
      return "Welcome";
  }

    @RequestMapping("/google")
    public String google() {

        TestGNGoogle.runGoogle();
        return "Google executed";
    }

    @RequestMapping("/testodev")
    public String datazoom() {

        TestGNGoogle.testodev();
        return "testodev executed ";
    }

}
