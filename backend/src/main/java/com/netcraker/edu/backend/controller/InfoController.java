package com.netcraker.edu.backend.controller;

import com.netcraker.edu.backend.entities.Info;
import com.netcraker.edu.backend.service.interfaces.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/info")
public class InfoController {

    private InfoService infoService;

    @Autowired
    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Info> getAllInfos() {
        return infoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Info saveInfo(@RequestBody Info info) {
        return infoService.save(info);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteInfo(@PathVariable(name = "id") Long id) {
        infoService.delete(id);
    }

    @RequestMapping(value = "/find/{phoneNumber}", method = RequestMethod.GET)
    public ResponseEntity<Info> getInfoByPhoneNumber(@PathVariable(name = "phoneNumber") String phoneNumber) {
        Info info = infoService.findByPhoneNumber(phoneNumber);
        return ResponseEntity.ok(info);
    }
}