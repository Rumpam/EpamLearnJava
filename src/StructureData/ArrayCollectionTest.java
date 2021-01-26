package StructureData;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.Collection;

public class ArrayCollectionTest {
    private static final int ELEMENTS_AMOUNT = 10_000;

    @Benchmark
    public void testArrayListAddMethod() {
        final Collection<Integer> intList = new ArrayCollection<>();

        for (int i = 0; i < ELEMENTS_AMOUNT; i++) {
            intList.add(i);
        }
    }
}