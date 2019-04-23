package com.netcraker.edu.backend.controller;

import com.netcraker.edu.backend.entities.UserInfo;
import com.netcraker.edu.backend.service.interfaces.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/info")
public class UserInfoController {

    private UserInfoService userInfoService;

    @Autowired
    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @RequestMapping(value = "/login/{phoneNumber}", method = RequestMethod.GET)
    public ResponseEntity<UserInfo> getUserInfoByPhoneNumber(@PathVariable(name = "phoneNumber") String phoneNumber) {
        UserInfo userInfo = userInfoService.findByPhoneNumber(phoneNumber);
        return ResponseEntity.ok(userInfo);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<UserInfo> getAllInfo() {
        return userInfoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserInfo saveInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.save(userInfo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteLog(@PathVariable(name = "id") Long id) {
        userInfoService.delete(id);
    }
}
