package com.codeclan.code.example.listview;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class TopCloudTechnologyTest {

    @Test
    public void canGetList(){
        TopCloudTechnology list = new TopCloudTechnology();
        assertEquals(8, list.getList().size());
    }

}