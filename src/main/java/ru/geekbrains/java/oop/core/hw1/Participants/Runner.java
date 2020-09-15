package ru.geekbrains.java.oop.core.hw1.Participants;

public interface Runner {

    String getName();

    int getMaxLength();

    int getMaxWeight();

    boolean getSuccess();

    void setSuccess(boolean success);
    void run();

    void jump();


}