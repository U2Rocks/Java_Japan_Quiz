package com.mycitrus;

public class Question {
    protected String prompt;
    protected String anwser;

    public Question(String prompt, String anwser){
        this.setPrompt(prompt);
        this.setAnwser(anwser);

    }

    public void setPrompt(String prompt){
        this.prompt = prompt;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public void setAnwser(String anwser){
        this.anwser = anwser;
    }

    public String getAnwser() {
        return this.anwser;
    }
}
