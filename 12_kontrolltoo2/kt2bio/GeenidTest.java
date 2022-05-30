package kt2bio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeenidTest {
    Geenid geen1;
    Geenid geen2;
    Geenid geen3;
    Geenid geen4;
    Alleelid beetusPos;
    Alleelid beetusNeg;
    Alleelid neetusPos;
    Alleelid neetusNeg;
    @Test
    void createGene() {
        beetusPos = new Alleelid("beetus", "pos");
        beetusNeg = new Alleelid("beetus", "neg");
        neetusPos = new Alleelid("neetus", "pos");
        neetusNeg = new Alleelid("neetus", "neg");
        geen1 = new Geenid(beetusNeg, beetusNeg);
        geen2 = new Geenid(beetusPos, beetusPos);
        geen3 = new Geenid(beetusNeg, beetusPos);
        geen4 = new Geenid(beetusPos, beetusNeg);

        assertEquals(false, geen1.createGene());
        assertEquals(true, geen2.createGene());
        assertEquals(true, geen3.createGene());
        assertEquals(true, geen4.createGene());
    }
}