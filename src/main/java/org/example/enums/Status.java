package org.example.enums;

import lombok.Getter;

@Getter
public enum Status {

    NEW("New"),
    ACTIVE("Active"),
    COMPLETE("Complete");

    private String label;
    Status(String label) {
        this.label = label;
    }

}
