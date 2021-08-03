package com.company;

public class GreetingsEs implements Greetings{

    @Override
    public String goodMorning() {
        return "buenos dias";
    }

    @Override
    public String goodAfternoon(){
        return "buenas tardes";
    }
}
