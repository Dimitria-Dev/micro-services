package com.microservice.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class WebController {
    private final StudentService studentService;

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("message", new Student());
        return "form";
    }


    @PostMapping("/form")
    public String save(@ModelAttribute Student student, Model model) {
        studentService.save(student);
        model.addAttribute("message", student);
        return "result";
    }
}
