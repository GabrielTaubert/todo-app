package com.gabriel_t.todo;

import java.util.ArrayList;

public class NoteGroup {

    private String groupName;
    private ArrayList<Note> notes;

    public NoteGroup(String groupName) {
        this.groupName = groupName;
        this.notes = new ArrayList<Note>();
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void listNotes() {
        for (Note note: notes) {
            System.out.println(note.getTitle());
        }
    }

    public void createNote(Integer id, String title, String description) {
        this.notes.add(new Note(id, title, description));
    }

    public void deleteNote(Integer id) {

        Integer noteID;

        for (int i = 0; i < this.notes.size(); i++) {
            noteID = notes.get(i).getID();
            if (noteID.equals(id)) {
                this.notes.remove(i);
            }
        }
    }

}
