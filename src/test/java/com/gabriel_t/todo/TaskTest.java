package com.gabriel_t.todo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {

    private Task task;

    @Before
    public void initTask() {
        task = new Task(1, "Einkaufen", "Milch, Brot, Eier");
    }

    @Test
    public void testNoteCreation() {
        // Prüfen, ob ID korrekt ist
        assertEquals(Integer.valueOf(1), task.getID());

        // Prüfen, ob Titel korrekt ist
        assertEquals("Einkaufen", task.getTitle());

        // Prüfen, ob Beschreibung korrekt ist
        assertEquals("Milch, Brot, Eier", task.getDescription());
    }
}
