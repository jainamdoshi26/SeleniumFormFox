package co.formfox.mcp.events;

import co.formfox.mcp.paths.Constants;

public class navigationEvent {

	events eventCall=new events();
	
	public void navigationPageEvent(String pagename) {

		String pagename1;
		pagename1 = pagename.toLowerCase();

		switch (pagename1) {

		case "sitesearch":
			eventCall.clickOnElementByXpath(Constants.SITE_SEARCH_PAGE);
			System.out.println("sitesearch");
			break;

		case "order":
			eventCall.clickOnElementByXpath(Constants.ORDER_PAGE);
			System.out.println("order");
			break;

		case "tracking":
			eventCall.clickOnElementByXpath(Constants.TRACKING_PAGE);
			System.out.println("tracking");
			break;

		case "completed":
			eventCall.clickOnElementByXpath(Constants.COMPLETED_PAGE);
			System.out.println("completed");
			break;

		case "pools":
			eventCall.clickOnElementByXpath(Constants.RANDOM_POOLS_PAGE);
			eventCall.clickOnElementByXpath(Constants.POOLS_PAGE);
			System.out.println("pools");
			break;

		case "personnel":
			eventCall.clickOnElementByXpath(Constants.RANDOM_POOLS_PAGE);
			eventCall.clickOnElementByXpath(Constants.PERSONNEL_PAGE);
			System.out.println("personnel");
			break;

		case "reports":
			eventCall.clickOnElementByXpath(Constants.REPORTS_PAGE);
			System.out.println("reports");
			break;

		case "all":
			eventCall.clickOnElementByXpath(Constants.SITE_SEARCH_PAGE);
			System.out.println("SiteSearch");
			eventCall.clickOnElementByXpath(Constants.ORDER_PAGE);
			System.out.println("Order Page");
			eventCall.clickOnElementByXpath(Constants.TRACKING_PAGE);
			System.out.println("Tracking Page");
			eventCall.clickOnElementByXpath(Constants.COMPLETED_PAGE);
			System.out.println("Completed Page");
			eventCall.clickOnElementByXpath(Constants.RANDOM_POOLS_PAGE);
			eventCall.clickOnElementByXpath(Constants.POOLS_PAGE);
			System.out.println("Pools Page");
			eventCall.clickOnElementByXpath(Constants.PERSONNEL_PAGE);
			System.out.println("Personnel Page");
			eventCall.clickOnElementByXpath(Constants.REPORTS_PAGE);
			System.out.println("Reports Page");
			break;

		default:
			System.out.println("spelling of page is wrong");
		}

	}

}
