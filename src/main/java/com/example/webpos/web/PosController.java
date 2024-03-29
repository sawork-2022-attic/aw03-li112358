package com.example.webpos.web;

import com.example.webpos.biz.PosService;
import com.example.webpos.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PosController {

    private PosService posService;

    @Autowired
    public void setPosService(PosService posService) {
        this.posService = posService;
    }

    @GetMapping("/")
    public String pos(Model model) {
        model.addAttribute("products", posService.products());
        model.addAttribute("cart", posService.getCart());
        return "index";
    }

    @GetMapping("/modify")
    public String modify(@RequestParam(name="pid") String pid, @RequestParam(name="add") boolean add, Model model){
        if(add) posService.modify(pid, 1);
        else posService.modify(pid, -1);
        model.addAttribute("products", posService.products());
        model.addAttribute("cart", posService.getCart());
        return "index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(name="pid") String pid, Model model){
        posService.delete(pid);
        model.addAttribute("products",posService.products());
        model.addAttribute("cart",posService.getCart());
        return "index";
    }

    @GetMapping("/empty")
    public String empty(Model model){
        posService.newCart();
        model.addAttribute("products", posService.products());
        model.addAttribute("cart", posService.getCart());
        return "index";
    }

    @GetMapping("/charge")
    public String charge(@RequestParam(name="sum")int sum, Model model){
        posService.newCart();
        model.addAttribute("products", posService.products());
        model.addAttribute("cart", posService.getCart());
        return "index";
    }
}
