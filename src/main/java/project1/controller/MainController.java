package project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import project1.model.Member;
import project1.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/grace")
    public String gracePage() {
        return "grace";
    }

    @GetMapping("/aaron")
    public String aaronPage() {
        return "aaron";
    }

    @GetMapping("/praneeth")
    public String praneethPage() {
        return "praneeth";
    }

    @Autowired
    private MemberRepository memberRepo;

    @GetMapping("/members")
    public String members(Model model) {
        model.addAttribute("members", memberRepo.findAll());
        return "members";
    }

    @GetMapping("/add-member")
    public String showForm(Model model) {
        model.addAttribute("member", new Member());
        return "add-member";
    }

    @PostMapping("/add-member")
    public String addMember(Member member) {
        memberRepo.save(member);
        return "redirect:/members";
    }

    @GetMapping("/edit-member/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Member member = memberRepo.findById(id).orElseThrow();
        model.addAttribute("member", member);
        return "edit-member";
    }

    @PostMapping("/edit-member/{id}")
    public String updateMember(@PathVariable Long id, Member updatedMember) {
        Member member = memberRepo.findById(id).orElseThrow();

        member.setName(updatedMember.getName());
        member.setBio(updatedMember.getBio());

        memberRepo.save(member);

        return "redirect:/members";
    }
}