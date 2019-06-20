package cn.cyz.aigou.web.controller;

import cn.cyz.aigou.domain.Employee;
import cn.cyz.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){

        if ("admin".equals(employee.getUsername())&&"123".equals(employee.getPassword())){
            return AjaxResult.me().setObject(null);
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败").setObject(null);
        }
    }


    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult lget(){
        return AjaxResult.me();
    }

}
