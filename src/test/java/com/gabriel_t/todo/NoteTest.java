package com.gabriel_t.todo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NoteTest {

    private Note note;

    @Before
    public void initNote() {
        note = new Note(1, "Einkaufen", "Milch, Brot, Eier");
    }

    @Test
    public void testNoteCreation() {
        // Prüfen, ob ID korrekt ist
        assertEquals(Integer.valueOf(1), note.getID());

        // Prüfen, ob Titel korrekt ist
        assertEquals("Einkaufen", note.getTitle());

        // Prüfen, ob Beschreibung korrekt ist
        assertEquals("Milch, Brot, Eier", note.getDescription());
    }
}
