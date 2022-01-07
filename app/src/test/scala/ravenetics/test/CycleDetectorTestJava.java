package ravenetics.test;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CycleDetectorTestJava {

    @Test
    public void findCycles() {
        // klasa CycleDetector zawiera krótką specyfikację działania algorytmu
        List<Character> chars = "ababab"
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        Optional<CycleDetectorJava.CycleDefinitionJava<Character>> cycles = CycleDetectorJava.findCycles(chars, 2);

        //todo impl
        assertTrue(!cycles.isEmpty());
        assertEquals("Optional[CycleDefinitionJava([a, b],3)]", cycles.toString());

    }
    @Test
    public void findCyclesEmpty() {
        // klasa CycleDetector zawiera krótką specyfikację działania algorytmu
        List<Character> chars = "abcde"
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        Optional<CycleDetectorJava.CycleDefinitionJava<Character>> cycles = CycleDetectorJava.findCycles(chars, 2);
        assertTrue(cycles.isEmpty());
    }
    @Test
    public void findCycles2() {
        // klasa CycleDetector zawiera krótką specyfikację działania algorytmu
        List<Character> chars = "abcabcabcabcabc"
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        Optional<CycleDetectorJava.CycleDefinitionJava<Character>> cycles = CycleDetectorJava.findCycles(chars, 2);
        assertEquals("Optional[CycleDefinitionJava([a, b, c],5)]", cycles.toString());
    }
}