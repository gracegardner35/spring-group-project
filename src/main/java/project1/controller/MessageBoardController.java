package project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project1.model.Message;
import project1.repository.MessageRepository;

@Controller
public class MessageBoardController {

    private final MessageRepository repo;

    public MessageBoardController(MessageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/messages")
    public String showMessages(Model model) {
        model.addAttribute("messages", repo.findAll());
        return "messages";
    }

    @PostMapping("/messages")
    public String addMessage(@RequestParam String author,
                             @RequestParam String content) {
        repo.save(new Message(author, content));
        return "redirect:/messages";
    }
}
