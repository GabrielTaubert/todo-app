package com.gabriel_t.todo;

public class ToDo {
    public static void main(String[] args) {
        Task firstNote = new Task(0, "first Note", "hey i am the first note");

        System.out.println(firstNote.getID());
        System.out.println(firstNote.getTitle());
        System.out.println(firstNote.getDescription());

    }
}
