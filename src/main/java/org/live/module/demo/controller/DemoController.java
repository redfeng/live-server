package org.live.module.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by KAM on 2017/3/28.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String test(@RequestParam("account") String accoount, @RequestParam("password") String password) {
        System.out.println(accoount + ":" + password);
        return "{'name':'test'}";
    }

    @Value("${system.localServerIp}")
    private String localServerIp ;

    @Value("${system.rtmpAddrPrefix}")
    private String rtmpAddrPrefix ;

    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {

        System.out.println("localServerIp ---> "+ localServerIp) ;
        System.out.println("rtmpAddrPrefix --->"+ rtmpAddrPrefix) ;
        return null ;
    }

    @RequestMapping("/websocketTest")
    public ModelAndView websocketTest(String account, String chatroom, String nickname, String anchor) {

        ModelAndView mv = new ModelAndView() ;
        mv.addObject("account", account) ;
        mv.addObject("chatroom", chatroom) ;
        mv.addObject("nickname", nickname) ;
        if(anchor != null) mv.addObject("anchor", anchor) ;
        mv.setViewName("websocket_test") ;
        return mv ;
    }

}
