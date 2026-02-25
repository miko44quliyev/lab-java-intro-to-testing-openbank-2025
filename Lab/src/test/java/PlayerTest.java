import org.example.Elf;
import org.example.Warrior;
import org.example.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    private Warrior warrior;
    private Wizard wizard;
    private Elf elf;

    @BeforeEach
    void setUp() {
        warrior = new Warrior(100, 20, 3, 50);
        wizard = new Wizard(80, 25, 2, "Fireball");
        elf = new Elf(90, 15, 3, 40);
    }

    @Test
    void testAttack() {
        warrior.attack(wizard);
        assertEquals(60, wizard.getHealth());
        wizard.attack(warrior);
        assertEquals(75, warrior.getHealth());
    }

    @Test
    void testHealthAndLives() {
        warrior.setHealth(-10);
        warrior.checkHealth();
        assertEquals(2, warrior.getLives());
        assertEquals(100, warrior.getHealth());
    }

    @Test
    void testConvertToElf() {
        Elf fromWarrior = warrior.convertToElf();
        Elf fromWizard = wizard.convertToElf();
        assertEquals(warrior.getStrength(), fromWarrior.getStrength());
        assertEquals(wizard.getHealth(), fromWizard.getHealth());
    }

    @Test
    void testSetters() {
        elf.setHealth(80);
        elf.setStrength(20);
        elf.setLives(2);
        elf.setSpeed(50);
        assertEquals(80, elf.getHealth());
        assertEquals(50, elf.getSpeed());
    }
}