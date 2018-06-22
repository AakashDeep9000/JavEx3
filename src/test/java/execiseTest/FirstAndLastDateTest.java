package test.java.execiseTest;

import static org.junit.Assert.*;
import java.util.*;
import main.java.exercise3.*;

import org.junit.Test;

public class FirstAndLastDateTest {

	@Test
	public void FirstDateTest() {
	    Calendar calendar = Calendar.getInstance();
	    FirstAndLastDate obj = new FirstAndLastDate();
	    Date now = obj.getWeekStartDate();
	}
	
	@Test
	public void LastDateTest() {
	    Calendar calendar = Calendar.getInstance();
	    FirstAndLastDate obj = new FirstAndLastDate();
	    Date now = obj.getWeekEndDate();
	}

}