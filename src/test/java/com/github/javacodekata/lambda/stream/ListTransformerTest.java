package com.github.javacodekata.lambda.stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class ListTransformerTest
{

    private static final String[] strings = { "a", "7", "4", "z", "T", "c", "10", "h", "2" };
    private static final String[] strings2 = { "a", "7", "4", "z", "T", "c", "10", "h", "2", "4", "7", "11", "10", "T", "z", "4" };
    private ListTransformerDone listTransformer;

    @Test
    public void testGetSortedStrings() throws Exception
    {
        listTransformer = ListTransformerDone.of(Arrays.asList(strings));
        assertThat(listTransformer.getSortedStrings(), is(equalTo(Arrays.asList("10", "2", "4", "7", "T", "a", "c", "h", "z"))));
    }

    @Test
    public void testGetSortedIntegers() throws Exception
    {
        listTransformer = ListTransformerDone.of(Arrays.asList(strings));
        assertThat(listTransformer.getSortedIntegers(), is(equalTo(Arrays.asList(2, 4, 7, 10))));
    }

    @Test
    public void testGetSortedDescendingIntegers() throws Exception
    {
        listTransformer = ListTransformerDone.of(Arrays.asList(strings));
        assertThat(listTransformer.getSortedDescendingIntegers(), is(equalTo(Arrays.asList(10, 7, 4, 2))));
    }

    @Test
    public void testGetSortedDistinctIntegersAboveFive() throws Exception
    {
        listTransformer = ListTransformerDone.of(Arrays.asList(strings2));
        assertThat(listTransformer.getSortedDistinctIntegersAboveFive(), is(equalTo(Arrays.asList(7, 10, 11))));
    }

    @Test
    public void testGetSumOfIntegersAboveFive()
    {
        listTransformer = ListTransformerDone.of(Arrays.asList(strings2));
        assertThat(listTransformer.getSumOfIntegersAboveFive(), is(equalTo(45)));
    }
}