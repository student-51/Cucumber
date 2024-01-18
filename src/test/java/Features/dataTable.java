package Features;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class dataTable {
	
	@Given("dataTable Example")
	public void given(DataTable table) {
		System.out.println(table.toString());
		System.out.println(table.height());
		System.out.println(table.width());
		System.out.println(table.getClass());
		List<List<String>> asLists = table.asLists();
		for (List<String> list:asLists) {
			System.out.println();
		}
		System.out.println(table.asLists());
		
//		System.out.println(table.cell(0, 0));
//		System.out.println(table.cell(0, 1));
		
//		System.out.println(table.cell(1, 0));
//		System.out.println(table.cell(1, 1));
		
//		System.out.println(table.cell(2, 0));
//		System.out.println(table.cell(2, 1));
		
	}
	
	@Given("^User enters (.*) and (.*)$")
	public void unPwd(String username,String password) {
		System.out.println("["+username+","+password+"]");
	}
	
	@Given("^username is \"(.*)\" and password is \"(.*)\"$")
	public void unPwd2(String username,String password) {
		System.out.println("["+username+","+password+"]");
	}
	
}
