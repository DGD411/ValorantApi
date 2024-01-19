package com.example.springrestwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValorantController {

    private final ValorantApiService valorantApiService;

    public ValorantController(ValorantApiService valorantApiService) {
        this.valorantApiService = valorantApiService;
    }

    @GetMapping("/teams")
    public String getTeams(Model model) {
        ApiResponse apiResponse = valorantApiService.getTeams();
        model.addAttribute("teams", apiResponse.data());
        return "teams";
    }
}

