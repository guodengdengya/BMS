package com.example.datastructure.controller;



import com.example.datastructure.mapper.UserMapper;
import com.example.datastructure.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class maincontroller {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/loginHtml")
    public String login(HttpServletRequest request,Map<String,Object> map){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User loginuser = userMapper.login(username, password);
        System.out.println(loginuser);
        //map.put("msg2","the user "+loginuser+"login");
        return "login";
    }
    @RequestMapping("/leftHtml")
    public String reg1(){
        return "left";
    }
    @RequestMapping("/imgtableHtml")
    public String reg2(){
        return "imgtable";
    }
    @RequestMapping("/tabHtml")
    public String reg3(){
        return "tab";
    }
    @RequestMapping("/paixuHtml")
    public String reg4(){
        return "paixu";
    }
    @RequestMapping("/chazhaoHtml")
    public String reg5(){
        return "chaozhao";
    }
    @RequestMapping("/shuHtml")
    public String reg6(){
        return "shu";
    }
    @RequestMapping("/xianxingbiaoHtml")
    public String reg7(){
        return "xianxingbiao";
    }
    @RequestMapping("/duilieHtml")
    public String reg8(){
        return "duilie";
    }
    @RequestMapping("/jiheHtml")
    public String reg9(){
        return "jihe";
    }
    @RequestMapping("/tuHtml")
    public String reg10(){
        return "tu";
    }
}
