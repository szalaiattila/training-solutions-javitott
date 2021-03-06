package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrainerTest {

    @Test
    void testCreate() {
        // Given
        Trainer trainer = new Trainer("John Doe");

        // When
        String name = trainer.getName();

        // Then
        assertEquals("John Doe", name);
    }

    @Test
    void testCreate2() {
        assertEquals( "John Doe", new Trainer("John Doe").getName());
    }

    @Test
    void testUpperCase(){
        assertEquals("JOHN DOE", new Trainer("John Doe").getNameUppercase());
    }

}
