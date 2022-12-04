package com.wangwenjun.cicd.chapter01;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 * @program: cicd
 * @description:
 * @author: bikang
 * @create: 2022-12-04 22:42
 */
public class AddClassTest   {

    private AddClass addClass = null;


    @Before
    public void setUp() throws Exception {
       addClass = AddClass.builder().build();
    }

    @After
    public void tearDown() throws Exception {
        addClass = null;
    }


    @Test
    public void testAdd() {
        assertThat( addClass.add(1f,2f), equalTo(3.0));
    }

    @Test(expected= IllegalArgumentException.class)
    public void testSub1() {
        assertThat( addClass.sub(1f,0f), equalTo(0f));
    }

    @Test
    public void testSub2() {
        assertThat( addClass.sub(1f,2f), equalTo(0.5));
    }
}
