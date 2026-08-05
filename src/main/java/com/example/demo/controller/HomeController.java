package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "ปิยพันธ์ แก้วเก็บคำ");
         model.addAttribute("studentId", "สวัสดี ชื่อ ปิยพันธ์ แก้วเก็บคำ (รหัส 673380413-9)");
        return "home"; // ไม่ใช่ path ไฟล์ แค่ "ชื่อ view" เชิงตรรกะเท่านั้น
    }


        @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("message1", "ปิยพันธ์ แก้วเก็บคำ");
        model.addAttribute("message2", "ชื่อเล่น: แป๊ก ");
          model.addAttribute("message3", "ชอบสี แดงดำ");
          model.addAttribute("message4", "ชอบกินกะเพราหมูกรอบ");
         model.addAttribute("studentId", "สวัสดี ชื่อ ปิยพันธ์ แก้วเก็บคำ (รหัส 673380413-9)");
        return "about"; // ไม่ใช่ path ไฟล์ แค่ "ชื่อ view" เชิงตรรกะเท่านั้น
    }
}