package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @ResponseBody
//    @RequestMapping("/list")
//    public List mySqlTest(){
//        String sql="select * from user";
//        //query()是JdbcTemplate对象中的方法，RowMapper对象可以查询数据库中的数据，此处将函数作为参数
//        //此处可替换为lambda，lambda表达式可简单理解为前端的箭头函数
//        List<User> users=jdbcTemplate.query(sql,new RowMapper<User>(){
//            @Override
//            //RowMapper对象通过调用mapRow()方法将数据库中的每一行数据封装成User对象，并返回
//            public User mapRow(ResultSet rs, int i)throws SQLException{
//                User user=new User();
//                user.setId(rs.getInt("id"));
//                user.setName(rs.getString("name"));
//                user.setPassword(rs.getString("password"));
//                return user;
//            }
//        });
//        System.out.println("查询成功："+users);
//        return users;
//    }

    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @PostMapping("/add")
    public String add(User user){
        int i= userService.addUser(user);
        if(i>0){
            return "success";
        }
        return "fail";
    }
}
