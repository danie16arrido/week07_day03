package com.codeclan.code.example.listview;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopCloudTechnology {

    private ArrayList<CloudTechnology> list;

    public TopCloudTechnology(){
        list = new ArrayList<>();
        list.add(new CloudTechnology("OpenStack", "Infrastructure", 2010, 1));
        list.add(new CloudTechnology("CloudFoundry", "Platform", 2011, 2));
        list.add(new CloudTechnology("KVM", "Virtualization", 2007, 3));
        list.add(new CloudTechnology("Docker", "Virtualization", 2013, 4));
        list.add(new CloudTechnology("ApacheMesos", "Infrastructure", 2012, 5));
        list.add(new CloudTechnology("MongoDB", "Database", 2009, 6));
        list.add(new CloudTechnology("Puppet", "DevOps", 2005, 7));
        list.add(new CloudTechnology("Chef", "DevOps", 2009, 8));
        list.add(new CloudTechnology("OpenShift", "Platform", 2011, 9));
        list.add(new CloudTechnology("Jenkins", "DevOps", 2011, 10));
        list.add(new CloudTechnology("Ceph", "Storage", 2011, 11));
        list.add(new CloudTechnology("Salt", "DevOps", 2011, 12));
        list.add(new CloudTechnology("CloudStack", "Infrastructure", 2010, 13));
        list.add(new CloudTechnology("CoreOS", "Infrastructure", 2014, 14));
        list.add(new CloudTechnology("CouchDB", "Database", 2005, 15));

    }

    public ArrayList<CloudTechnology> getList() {
        return new ArrayList<CloudTechnology>(list);
    }
}
