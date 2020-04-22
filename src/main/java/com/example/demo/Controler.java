package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Controler {

    @Autowired
    private ParticipantService participantService;

    @RequestMapping("/index")
    public String allParticipants(HttpServletRequest req) {
        req.setAttribute("participants", participantService.getAll());
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getCreate() {
        return "create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createParticipant(@ModelAttribute ParticipantRequest participantRequest, HttpServletRequest req) {
        participantService.save(participantRequest);
        req.setAttribute("participants", participantService.getAll());
        return "index";
    }

    @GetMapping("/delete")
    public String deleteParticipant(@RequestParam(name = "id") int Id, HttpServletRequest req) {
        participantService.delete(Id);
        req.setAttribute("participants", participantService.getAll());
        return "index";
    }
}
