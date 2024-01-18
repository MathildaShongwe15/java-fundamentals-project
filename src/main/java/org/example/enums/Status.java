package org.example.enums;

public enum Status {

    NEW("New"),
    ACTIVE("Active"),
    COMPLETE("Complete");

    private String label;
    Status(String label) {
        this.label = label;
    }
    public String getlabel(){

        return label;}
}
