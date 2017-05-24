package com.codeclan.code.example.listview;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class CloudTechnologyTest {

    @Test
    public void canCreateCloudTechnology(){
        CloudTechnology technology = new CloudTechnology("OpenShift");
        assertEquals(true, technology instanceof CloudTechnology);
    }

    @Test
    public void canGetName(){
        CloudTechnology technology = new CloudTechnology("OpenStack");
        assertEquals("OpenStack", technology.getName());
    }

    @Test
    public void canSetName(){
        CloudTechnology technology = new CloudTechnology("OpenStack");
        technology.setName("Docker");
        assertEquals("Docker", technology.getName());
    }

    @Test
    public void canSetCategory(){
        CloudTechnology technology = new CloudTechnology("OpenStack");
        technology.setCategory("Infrastructure");
        assertEquals("Infrastructure", technology.getCategory());
    }

    @Test
    public void canSetYear(){
        CloudTechnology technology = new CloudTechnology("KVM");
        technology.setYear(2007);
        assertEquals(2007, technology.getYear());
    }

    @Test
    public void canOverloadInitializer(){
        CloudTechnology technology = new CloudTechnology("Docker", "Virtualization", 2013);
        assertEquals("Docker", technology.getName());
        assertEquals(2013, technology.getYear());
    }
}