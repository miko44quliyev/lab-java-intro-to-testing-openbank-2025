import org.example.SpellLibrary;
import org.example.Wizard;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// Initialize Mockito annotations
@ExtendWith(MockitoExtension.class)
public class WizardMockitoTest {
    @Mock
    private SpellLibrary spellLibrary;
    @InjectMocks
    private Wizard wizard = new Wizard(80, 25, 2, "Fireball");
    @Test
    void castRandomSpell_returnsExpectedString() {
        when(spellLibrary.getRandomSpell()).thenReturn("Fireball");
        String result = wizard.castRandomSpell();
        assertEquals("Casting Fireball", result);
        verify(spellLibrary, times(1)).getRandomSpell();
    }
}