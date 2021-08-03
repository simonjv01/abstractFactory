package com.company;

public class QuestionsEs implements Questions{

    @Override
    public String askTime() {
        return "?que hora es?";
    }

    @Override
    public String askWeather() {
        return "que tiempo hace?";
    }
}
