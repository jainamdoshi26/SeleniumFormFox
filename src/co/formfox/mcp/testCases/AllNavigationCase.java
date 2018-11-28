package co.formfox.mcp.testCases;

import org.testng.annotations.Test;

import co.formfox.mcp.events.navigationEvent;

public class AllNavigationCase {

	navigationEvent tempnavigation=new navigationEvent();

  @Test
  public void testAllNavigation() {
		tempnavigation.navigationPageEvent("all");
  }
}
