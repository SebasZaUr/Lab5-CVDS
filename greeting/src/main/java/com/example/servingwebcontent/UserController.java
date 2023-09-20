package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
public class UserController {

    @RequestMapping("/hola")
    @ResponseBody
    private String hola() {
        return "Hola mundo";
    }
    @RequestMapping("/user /{id} ")
    @ResponseBody
    private String getUser(@PathVariable Integer id) {
        String uri = "https://jsonplaceholder.typicode.com/users/1";
        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(uri, User.class);
//        System.out.println("User: " + user);
        System.out.println("Userid: " + user.getUserId());
        System.out.println("id: " + user.getId());
        System.out.println("title: " + user.getTitle());
        System.out.println("complete: " + user.getComplete());
        return "User detail page.";
    }
}
