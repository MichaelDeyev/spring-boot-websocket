package com.javatechie.spring.ws.api.controller;

import com.javatechie.spring.ws.api.model.ChatMessage;
import com.javatechie.spring.ws.api.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HistoryController {

    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/history")
    public String history(Model model) {
        Iterable<ChatMessage> allMessage = messageRepo.findAll();
        model.addAttribute("messages", allMessage);
        return "history";
    }


}



//@GetMapping("/history")
//    public List<String> history(){
//        Iterable<ChatMessage> all = messageRepo.findAll();
//        List<String> stringList = new ArrayList<>();
//
//        for (ChatMessage message :
//                all) {
//            stringList.add(message.toString());
//        }
//        return stringList;