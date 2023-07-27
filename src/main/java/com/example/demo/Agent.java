package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Agent {
    
    private boolean isValue;
    private String name;

    public Agent(String name, boolean isValue) {
        this.name = name;
        this.isValue = isValue;
    }
}
