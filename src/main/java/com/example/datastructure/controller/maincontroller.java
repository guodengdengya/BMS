package com.example.datastructure.controller;

import com.example.datastructure.mapper.UserMapper;
import com.example.datastructure.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        System.out.println(username);
        if(username!=null && password!=null){
           // System.out.println("进来了");
            User loginuser = userMapper.login(username, password);
           if(loginuser!=null){
               return "left";
           }
        }
        return "login";
    }


    @RequestMapping("/updateuser")
    public String updata(HttpServletRequest request,Map<String,Object> map){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String nepassword  = request.getParameter("newpassword");
        User getuser = userMapper.login(username,password);
        if(getuser!=null){
            userMapper.updateuser(username,nepassword);
             return"login";
        }else{
            map.put("msg4","您输入的用户名不存在或原密码错误" );
            return"imgtable";
        }
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
