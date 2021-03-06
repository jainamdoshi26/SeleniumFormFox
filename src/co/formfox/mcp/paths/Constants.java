package co.formfox.mcp.paths;

/**
 * It will provide the Xpath of the elements, from class called constants.
 * 
 * @Syntex: Constants."variable_name"
 */
public class Constants {

	public static String CSVFILE = "C:/Users/Tudip/Downloads/csvdata.csv";
	public static String URL = "http://63.236.215.40/webapp/#/login?clientFolder=RAPromotionQATest";
	public static String USERNAME_TEXT_FIELD = "//*[@id='inputEmail3']";
	public static String PASSWORD_TEXT_FIELD = "//*[@id='inputPassword3']";
	public static String LOGIN_BUTTON = "/html/body/app/main/login/div/div[2]/div/div[2]/div[2]/form/div[3]/button";
	public static String ORDER_PAGE = "//*[@id='headerNavBar']/ul[1]/li[2]/a"; 
	public static String COMPANY_TEXT_FIELD = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div/div/input";
	public static String SELECT_COMPANY_OPTION = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div/div/ngui-auto-complete/div/ul/li[3]";
	public static String REASON_TEXT_FIELD = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[1]/div[4]/div/div/div/input";
	public static String SELECT_REASON_COMPANY = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[1]/div[4]/div/div/div/ngui-auto-complete/div/ul/li[4]";
	public static String DRUG_TAB = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/button[1]";
	public static String ALCOHOL_TEST_TAB = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/button[2]";
	public static String PHYSICAL_EXAM_TAB = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/button[3]";
	public static String POINT_OF_CARE_TEST_TAB = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/button[4]";
	public static String BACKGROUND_CHECK_TAB = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/button[4]";
	public static String SERVICE_ORDER_CONFIRM_BUTTON = "//*[@id='orderPage']/div[1]/div[3]/form/div[2]/div/div[3]/div[2]/button";
	public static String NEXT_BUTTON_ORDER_PAGE_1 = "//*[@id='orderPage']/div[1]/div[3]/form/div[3]/div[1]/div[3]/button";
	public static String CANCEL_BUTTON_ORDER_PAGE_1 = "//*[@id='orderPage']/div[1]/div[3]/form/div[3]/div[1]/div[1]/button";
	public static String DONOR_ID_TEXT_FIELD = "//*[@id='donor-id']";
	public static String SEARCH_BUTTON_DONOR_ID = "//*[@id='orderPage']/div[1]/div[4]/form/div[1]/div/div[1]/div[2]/div[1]/div[1]/div/div/span";
	public static String FIRST_NAME_TEXT_FIELD = "//*[@id='first-name']";
	public static String LOGIN_MESSAGE = "//*[@id='toast-container']/div/div";
	public static String MENU_HOVER = "//*[@id='personlist']";
	public static String LOGOUT_LINK = "//*[@id='logout-list']";
	public static String LAB_ACCOUNT = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div/div/input";
	public static String SELECT_LAB_ACCOUNT_PAML = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div/div/ngui-auto-complete/div/ul/li[5]";
	public static String ADD_BUTTON_DRUG_TEST= "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/div/div[3]/button[2]";
	public static String TEST_TO_BE_PERFORMED_TEXT_FIELD = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/input";
	public static String BLOOD_TEST_TO_BE_PERFORMED = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/ngui-auto-complete/div/ul/li[1]";
	public static String ADD_BUTTON_ALCOHOL_TEST = "//*[@id='orderPage']/div[1]/div[3]/form/div[1]/div[2]/div[2]/div/div[3]/button[2]";
	public static String LAST_NAME_TEXT_FIELD = "//*[@id='last-name']";
	public static String EVENING_PHONE_TEXT_FIELD = "//*[@id='evening-phone']";
	public static String DAYTIME_PHONE_TEXT_FIELD = "//*[@id='daytime-phone']";
	public static String BIRTHDATE_TEXT_FIELD = "//*[@id='my-date-picker']/div/div/input";
	public static String MOBILE_TEXT_FIELD = "//*[@id='mobile']";
	public static String FIND_A_COLLECTION_SITE_BUTTON = "//*[@id='orderPage']/div[1]/div[4]/form/div[2]/div[2]/div/div[2]/button";
	public static String TIME_ZONE_TEXT_FIELD = "//*[@id='orderPage']/div[1]/div[4]/form/div[3]/div[1]/div[2]/div/div/div/input";
	public static String SELECT_TIME_ZONE = "//*[@id='orderPage']/div[1]/div[4]/form/div[3]/div[1]/div[2]/div/div/div/ngui-auto-complete/div/ul/li[5]";
	public static String ORDER_EXPIRATION_DATE_TEXT_FIELD = "//*[@id='orderPage']/div[1]/div[4]/form/div[4]/div[1]/div/my-date-picker/div/div/input";
	public static String ORDER_EXPIRATION_TIME_TEXT_FIELD = "//*[@id='time']";
	public static String PREFERRED_SCHEDULE_DATE_TEXT_FIELD = "//*[@id='orderPage']/div[1]/div[4]/form/div[5]/div[1]/div/my-date-picker/div/div/input";
	public static String PREFERRED_SCHEDULE_TIME_TEXT_FIELD = "//*[@id='time1']";
	public static String COMMENTS_TEXT_AREA = "//*[@id='comments']";
	public static String SUBMIT_BUTTON_ORDER_PAGE_2 = "//*[@id='orderPage']/div[1]/div[4]/form/div[7]/div[1]/div[3]/button";
	public static String FIND_A_LOCATION_SEARCH="//*[@id='address-input']";
	public static String SELECT_SITE = "//*[@id='findLocationModal']/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div[4]/button";
	public static String FIND_A_LOCATION_SEARCH_BUTTON = "//*[@id='findLocationModal']/div/div/div[2]/div/div[2]/div[1]/div[2]/div/span/button";
	public static String EMAIL_FORM_TEXT_FIELD_ORDER_PAGE_3 = "//*[@id='orderPage']/div[1]/form/div[2]/div/div[4]/div[1]/div/div[2]/input";
	public static String SEND_EMAIL_BUTTON_ORDER_PAGE_3 = "//*[@id='orderPage']/div[1]/form/div[2]/div/div[4]/div[2]/div[2]/button";
	public static String NEXT_BUTTON_ORDER_PAGE_3 = "//*[@id='orderPage']/div[1]/form/div[2]/div/div[6]/div/div[2]/button";
	public static String CONFIRM_BUTTON_ORDER_CONFIRMATION_POPUP = "//*[@id='pendingRecordsConfirm']";
	public static String CONTINUE_BUTTON_ORDER_PAGE_BG = "//*[@id='orderPage']/div[1]/form/div[2]/div/div[1]/div/div[2]/button";
	public static String TRACKING_PAGE = "//*[@id='headerNavBar']/ul[1]/li[3]/a";
	public static String SEARCH_DROPDOWN_TRACKING_PAGE = "//*[@id='trackPage']/div[1]/div[1]/div[2]/div/form/div[1]/dropdrown/div";
	public static String SEARCH_SSN_TRACKING_PAGE = "//*[@id='trackPage']/div[1]/div[1]/div[2]/div/form/div[1]/dropdrown/div/ul/li[5]";
	public static String SEARCH_TEXT_FIELD_TRACKING_PAGE = "//*[@id='trackPage']/div[1]/div[1]/div[2]/div/form/div[2]/input";
	public static String SEARCH_BUTTON_TRACKING_PAGE = "//*[@id='trackPage']/div[1]/div[1]/div[2]/div/form/div[2]/span";
	public static String SSN_VERIFY_TRACKING_PAGE = "//*[@id='trackPage']/div[2]/table/tbody/tr[1]/td[2]/span";
	public static String GENERAL_INFORMATION_TAB = "//*[@id='personnelDetails']/modal/div/div/div/div[2]/modal-content/div[1]/div[2]/div[1]";
	public static String EDIT_GENERAL_INFORMATION_TAB = "//*[@id='personnelDetails']/modal/div/div/div/div[2]/modal-content/div[2]/div/personnelinfo/div/form/div[1]/div[2]/img";
	public static String EMPLOYER_ID_TEXT_FIELD_TRACKING_PAGE = "//*[@id='personnelDetails']/modal/div/div/div/div[2]/modal-content/div[2]/div/personnelinfo/div/form/div[2]/div[1]/div[2]/input";
	public static String DRIVER_ID_TEXT_FIELD_TRACKING_PAGE = "//*[@id='personnelDetails']/modal/div/div/div/div[2]/modal-content/div[2]/div/personnelinfo/div/form/div[2]/div[2]/div[2]/input";
	public static String ALTERNATE_ID_TEXT_FIELD_TRACKING_PAGE = "//*[@id='personnelDetails']/modal/div/div/div/div[2]/modal-content/div[2]/div/personnelinfo/div/form/div[2]/div[4]/div[2]/input";
	public static String HIRE_DATE_TEXT_FIELD_TRACKING_PAGE = "//*[@id='hireDatePicker']/my-date-picker/div/div/input";
	public static String SAVE_BUTTON_GENERAL_INFORMATION_POPUP_TRACKING_PAGE = "//*[@id='personnelDetails']/modal/div/div/div/div[2]/modal-content/div[2]/div/personnelinfo/div/form/div[7]/div[2]/div/button";
	public static String SITE_SEARCH_PAGE = "//*[@id='headerNavBar']/ul[1]/li[1]/a";
	public static String COMPLETED_PAGE = "//*[@id='headerNavBar']/ul[1]/li[4]/a";
	public static String RANDOM_POOLS_PAGE = "//*[@id='headerNavBar']/ul[1]/li[5]/a";
	public static String POOLS_PAGE = "//*[@id='poolsPage']/div[1]/ul/li[1]";
	public static String PERSONNEL_PAGE = "//*[@id='poolsPage']/div[1]/ul/li[2]";
	public static String REPORTS_PAGE = "//*[@id='headerNavBar']/ul[1]/li[6]/a";
}
