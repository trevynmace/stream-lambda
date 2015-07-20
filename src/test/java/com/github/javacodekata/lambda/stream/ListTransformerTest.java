package com.github.javacodekata.lambda.stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ListTransformerTest
{

    private static final String[] strings = { "a", "7", "4", "z", "T", "c", "10", "h", "2" };

    private ListTransformerDone listTransformer;

    @Before
    public void setup()
    {
        listTransformer = ListTransformerDone.of(Arrays.asList(strings));
    }

    @Test
    public void testGetSortedStrings() throws Exception
    {
        assertThat(listTransformer.getSortedStrings(), is(equalTo(Arrays.asList("10", "2", "4", "7", "T", "a", "c", "h", "z"))));
    }

    @Test
    public void testGetSortedIntegers() throws Exception
    {
        assertThat(listTransformer.getSortedIntegers(), is(equalTo(Arrays.asList(2, 4, 7, 10))));
    }

    @Test
    public void testGetSortedDescendingIntegers() throws Exception
    {
        assertThat(listTransformer.getSortedDescendingIntegers(), is(equalTo(Arrays.asList(10, 7, 4, 2))));
    }

}
