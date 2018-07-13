package com.hb.formation.vols;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hb.formation.vols.datas.Vols;
import com.hb.formation.vols.model.Place;

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
    @Test
    public void test4() {
    	List<Place> places = vols.getVol(2).getPlaces();
    	boolean trouve = false;
    	for (Place place : places) {
			if(place.getVente() == 0) {
				trouve = true;
			}
		}
    	assertTrue(trouve);
    }
    @Test
    public void test5() {
    	List<Place> places = vols.getVol(2).getPlaces();
    	assertFalse(places.stream().anyMatch(place -> place.getVente() == 0));
    }
}
