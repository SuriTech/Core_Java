package config;

public class Reading_XLS_Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xls_Reader datatable = new Xls_Reader("D:\\Suren\\Workspace\\Morning_Batch\\Data.xlsx");
		int r=datatable.getRowCount("Records");
		System.out.println(r);
	String d=datatable.getCellData("Records", "City", 2);
	System.out.println(d);
	String d1=datatable.getCellData("Records", "Name", 3);
	System.out.println(d1);
	
	System.out.println(datatable.getColumnCount("Records"));
	
	// To write in excel file
	
	datatable.setCellData("Records", "Name", 5, "SoaUI");
	
	}
	

}
