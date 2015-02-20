package com.dragos.rectangleoverlap;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OverlappingTests {

    @Test
    public void test1(){
        Rectangle rectangle1 = new Rectangle(1, 3, 1, 2);
        Rectangle rectangle2 = new Rectangle(3, 2, 1, 1);
        assertFalse(rectangle1.checkRectanglesOverlap(rectangle2));
    }

    @Test
    public void test2(){
        Rectangle rectangle1=new Rectangle(0, 0, 10, 10);
        Rectangle rectangle2=new Rectangle(-1, 1, 10, 10);
        assertTrue(rectangle1.checkRectanglesOverlap(rectangle2));
    }

    @Test
    public void test3(){
        Rectangle rectangle1=new Rectangle(-1, -1, 1, 1);
        Rectangle rectangle2=new Rectangle(0, 0, 1, 1);
        assertTrue(rectangle1.checkRectanglesOverlap(rectangle2));
    }

    @Test
    public void test4(){
        Rectangle rectangle1=new Rectangle(-1, -1, 1, 1);
        Rectangle rectangle2=new Rectangle(1, 1, 1, 1);
        assertFalse(rectangle1.checkRectanglesOverlap(rectangle2));
    }
}
