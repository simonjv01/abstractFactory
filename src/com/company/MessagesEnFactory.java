package com.company;

public class MessagesEnFactory implements MessagesAbstractFactory{

    @Override
    public Greetings getGreetings() {
        return new GreetingsEn();
    }

    @Override
    public Questions getQuestions() {
        return new QuestionsEn();
    }
}
