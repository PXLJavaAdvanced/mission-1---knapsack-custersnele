package be.pxl.ja.citytrip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AttractionTest {

    @Test
    public void compareToReturnsZeroForAttractionsWithSameRating() {
        Attraction attraction1 = new Attraction("attraction1", 0.5, 5);
        Attraction attraction2 = new Attraction("attraction2", 1, 5);
        assertEquals(0, attraction1.compareTo(attraction2));
    }

    @Test
    public void compareToReturnsNegativeValueForAttractionWithHigherRating() {
        Attraction attraction1 = new Attraction("attraction1", 0.5, 7);
        Attraction attraction2 = new Attraction("attraction2", 1, 5);
        assertTrue(attraction1.compareTo(attraction2) < 0);
    }

    @Test
    public void compareToReturnsPositiveValueForAttractionWithLowerRating() {
        Attraction attraction1 = new Attraction("attraction1", 0.5, 3);
        Attraction attraction2 = new Attraction("attraction2", 1, 5);
        assertTrue(attraction1.compareTo(attraction2) > 0);
    }
}
