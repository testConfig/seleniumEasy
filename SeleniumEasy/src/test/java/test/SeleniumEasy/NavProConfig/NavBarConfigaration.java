package test.SeleniumEasy.NavProConfig;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import test.SeleniumEasy.BaseTest.TestBase;

public class NavBarConfigaration extends TestBase{

/*	private	enum NavBar
		{
			 Input_Forms,Date_pickers,Table,Progress_Bars,Alerts_Modals,List_Box,Others;
		}*/
	private static String Input_Forms;
	 private static String Date_pickers;
	 private static String Table;   
	 private static String Progress_Bars;
	 private static String Alerts_Modals;
	 private static String List_Box;
	 private static String Others;

		private static String Simple_Form_Demo ;
		private static String  Checkbox_Demo ; 
		private static String Radio_Buttons_Demo ; 
		private static String Select_Dropdown_List ; 
		private static String Input_Form_Submit ; 
		private static String Ajax_Form_Submit ; 
		private static String JQuery_Select_dropdown; 
		private static String Bootstrap_Date_Picker; 
		private static String JQuery_Date_Picker ; 
		private static String Table_Pagination ; 
		private static String Table_Data_Search ; 
		private static String Table_Filter ; 
		private static String Table_Sort_Search ; 
		private static String Table_Data_Download ; 


	
	static Properties property;
	
	private static void lodNavPro() {
		property =new Properties();
		File naFile = new File(System.getProperty("user.dir")+"//Properties//Navigation.Properties");
		try {
			FileReader nevRead = new FileReader(naFile);
			property.load(nevRead);
		} catch (Exception e) {
			logger.info("===== Navigation File Connection Have Problem =====");
			e.printStackTrace();
		}
		
	}
	
	public static final String getNevInput_Forms() {
		 setInput_Forms();
		return Input_Forms;
	}

	private final static void setInput_Forms() {
		lodNavPro();
		Input_Forms = property.getProperty("NavInput_Forms");
	}

	public static final String getNavDate_pickers() {
		setDate_pickers();
		return Date_pickers;
	}

	private final static void setDate_pickers() {
		lodNavPro();
		Date_pickers = property.getProperty("NavDate_pickers");
	}

	public static final String getNavTable() {
		setTable();
		return Table;
	}

	private final static void setTable() {
		lodNavPro();
		Table = property.getProperty("NavTable");
	}

	public static final String getNavProgress_Bars() {
		setProgress_Bars();
		return Progress_Bars;
	}

	private final static void setProgress_Bars() {
		lodNavPro();
		Progress_Bars = property.getProperty("NavProgress_Bars");
	}

	private static final String getNavAlerts_Modals() {
		setAlerts_Modals();
		return Alerts_Modals;
	}

	private final static void setAlerts_Modals() {
		lodNavPro();
		Alerts_Modals = property.getProperty("NavAlerts_Modals");
	}

	public static final String getNavList_Box() {
		setList_Box() ;
		return List_Box;
	}

	private final static void setList_Box() {
		lodNavPro();
		List_Box = property.getProperty("NavList_Box");
	}

	public static final String getNavOthers() {
		setOthers();
		return Others;
	}

	private final static void setOthers() {
		lodNavPro();
		Others = property.getProperty("NavOthers");
	}

		public static final String getSimple_Form_Demon() {
		setSimple_Form_Demo();
		return Simple_Form_Demo;
	}
		private static final void setSimple_Form_Demo() {
			lodNavPro();
			Simple_Form_Demo = property.getProperty("Simple_Form_Demo") ;
		}
		
		public static final String getCheckbox_Demo() {
			setCheckbox_Demo();
			return Checkbox_Demo;
		}
		
		private static final void setCheckbox_Demo() {
			lodNavPro();
			Checkbox_Demo = property.getProperty("Checkbox_Demo");
		}
		
		public static final String getRadio_Buttons_Demo() {
			setRadio_Buttons_Demo();
			return Radio_Buttons_Demo;
		}
		
		private static final void setRadio_Buttons_Demo() {
			lodNavPro();
			Radio_Buttons_Demo = property.getProperty("Radio_Buttons_Demo");
		}
		
		public static final String getSelect_Dropdown_List() {
			setSelect_Dropdown_List();
			return Select_Dropdown_List;
		}
		
		private static final void setSelect_Dropdown_List() {
			lodNavPro();
			Select_Dropdown_List = property.getProperty("Select_Dropdown_List");
		}
		
		public static final String getInput_Form_Submit() {
			setInput_Form_Submit();
			return Input_Form_Submit;
		}
		
		private static final void setInput_Form_Submit() {
			lodNavPro();
			Input_Form_Submit = property.getProperty("Input_Form_Submit");
		}
		
		public static final String getAjax_Form_Submit() {
			setAjax_Form_Submit();
			return Ajax_Form_Submit;
		}
		
		private static final void setAjax_Form_Submit() {
			lodNavPro();
			Ajax_Form_Submit = property.getProperty("Ajax_Form_Submit");
		}
		
		public static final String getJQuery_Select_dropdown() {
			setJQuery_Select_dropdown();
			return JQuery_Select_dropdown;
		}
		
		private static final void setJQuery_Select_dropdown() {
			lodNavPro();
			JQuery_Select_dropdown = property.getProperty("JQuery_Select_dropdown");
		}
		
		public static final String getBootstrap_Date_Picker() {
			setBootstrap_Date_Picker();
			return Bootstrap_Date_Picker;
		}
		
		private static final void setBootstrap_Date_Picker() {
			lodNavPro();
			Bootstrap_Date_Picker = property.getProperty("Bootstrap_Date_Picker");
		}
		
		public static final String getJQuery_Date_Picker() {
			lodNavPro();
			setJQuery_Date_Picker();
			return JQuery_Date_Picker;
		}
		
		private static final void setJQuery_Date_Picker() {
			JQuery_Date_Picker = property.getProperty("JQuery_Date_Picker");
		}
		
		public static final String getTable_Pagination() {
			setTable_Pagination() ;
			return Table_Pagination;
		}
		
		private static final void setTable_Pagination() {
			Table_Pagination = property.getProperty("Table_Pagination");
		}
		
		public static final String getTable_Data_Search() {
			setTable_Data_Search();
			return Table_Data_Search;
		}
		
		private static final void setTable_Data_Search() {
			Table_Data_Search = property.getProperty("Table_Data_Search");
		}
		
		public static final String getTable_Filter() {
			setTable_Filter() ;
			return Table_Filter;
		}
		
		public static final void setTable_Filter() {
			Table_Filter = property.getProperty("Table_Filter");
		}
		
		public static final String getTable_Sort_Search() {
			setTable_Sort_Search();
			return Table_Sort_Search;
		}
		
		private static final void setTable_Sort_Search() {
			Table_Sort_Search = property.getProperty("Table_Sort_Search");
		}
		
		public static final String getTable_Data_Download() {
			setTable_Data_Download();
			return Table_Data_Download;
		}
		
		private static final void setTable_Data_Download() {
			Table_Data_Download = property.getProperty("Table_Data_Download");
		}
		
		}
