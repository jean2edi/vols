package com.hb.formation.vols;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.hb.formation.vols.datas.Vols;

public class TestVols {

    private Vols vols;

    @Before
    public void init() {
        vols = Vols.getInstance();
    }
    
    @Test
    public void test1() {
        assertNotNull(vols.getDatas());
        assertEquals(2, vols.getDatas().size());
    }
    
    @Test
    public void test2() {
        assertNull(vols.getVol(0));
    }
    @Test
    public void test3() {
        assertNotNull(vols.getVol(1));
    }
}
