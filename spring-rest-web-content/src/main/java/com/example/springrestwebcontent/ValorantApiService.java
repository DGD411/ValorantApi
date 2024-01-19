package com.example.springrestwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ValorantApiService {

    private final String VALORANT_API_URL = "https://valorant-esports1.p.rapidapi.com/v1/teams";
    private final RestTemplate restTemplate;

    public ValorantApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ApiResponse getTeams() {
        return restTemplate.getForObject(VALORANT_API_URL, ApiResponse.class);
    }
}

