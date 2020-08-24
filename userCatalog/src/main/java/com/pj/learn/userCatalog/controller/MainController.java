package com.pj.learn.userCatalog.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    EurekaClient eurekaClient;

@GetMapping("/")
@HystrixCommand(fallbackMethod = "displayHomePage")
    public String getCourseAppHome()
    {
        String userClientAppMSG = "";
        RestTemplate rt =  new RestTemplate();
        InstanceInfo info = eurekaClient.getNextServerFromEureka("eureka-client-one", false);
       String  userAppUrl = info.getHomePageUrl();
        userClientAppMSG  = rt.getForObject(userAppUrl, String.class);
        return "Welcome to User Catalog : "+ userClientAppMSG;
    }

    @GetMapping("/users")
    @HystrixCommand(fallbackMethod = "displayErrorPage")
    public String getCourses()
    {
        String userDetails ="";
        RestTemplate rt =  new RestTemplate();
        InstanceInfo info = eurekaClient.getNextServerFromEureka("eureka-client-one", false);
        String  userAppUrl = info.getHomePageUrl();
        String allUsersURL = userAppUrl+"/users";
          userDetails  = rt.getForObject(allUsersURL, String.class);
        return "Our Users Are : "+userDetails;
    }

    public String displayHomePage()
    {
        return  "some thing is wrong please try after some time";
    }

    public String displayErrorPage()
    {
        return "DB application is down now please try after sometime";
    }
}
