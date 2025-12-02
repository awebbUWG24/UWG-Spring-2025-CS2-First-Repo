package testMainWindowViewModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.contact_manager.viewmodel.MainWindowViewModel;

class TestFindContact {

	@Test
	void testWhenFoundContactIsFirstInListWithNameSearch() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleTwo");
		testViewModel.getPhoneNumber().set("222-3333");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleThree");
		testViewModel.getPhoneNumber().set("333-4444");
		testViewModel.addContact();
		
		testViewModel.getSearchCriteria().set("Example");
		String foundContact = testViewModel.findContact();
		
		assertEquals("Example, 111-2222", foundContact);
	}
	
	@Test
	void testWhenFoundContactIsMiddleInListWithNameSearch() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleTwo");
		testViewModel.getPhoneNumber().set("222-3333");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleThree");
		testViewModel.getPhoneNumber().set("333-4444");
		testViewModel.addContact();
		
		testViewModel.getSearchCriteria().set("ExampleTwo");
		String foundContact = testViewModel.findContact();
		
		assertEquals("ExampleTwo, 222-3333", foundContact);
	}
	
	@Test
	void testWhenFoundContactIsLastInListWithNameSearch() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleTwo");
		testViewModel.getPhoneNumber().set("222-3333");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleThree");
		testViewModel.getPhoneNumber().set("333-4444");
		testViewModel.addContact();
		
		testViewModel.getSearchCriteria().set("ExampleThree");
		String foundContact = testViewModel.findContact();
		
		assertEquals("ExampleThree, 333-4444", foundContact);
	}
	
	@Test
	void testWhenFoundContactIsFirstInListWithNumberSearch() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleTwo");
		testViewModel.getPhoneNumber().set("222-3333");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleThree");
		testViewModel.getPhoneNumber().set("333-4444");
		testViewModel.addContact();
		
		testViewModel.getSearchCriteria().set("111-2222");
		String foundContact = testViewModel.findContact();
		
		assertEquals("Example, 111-2222", foundContact);
	}
	
	@Test
	void testWhenFoundContactIsMiddleInListWithNumberSearch() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleTwo");
		testViewModel.getPhoneNumber().set("222-3333");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleThree");
		testViewModel.getPhoneNumber().set("333-4444");
		testViewModel.addContact();
		
		testViewModel.getSearchCriteria().set("222-3333");
		String foundContact = testViewModel.findContact();
		
		assertEquals("ExampleTwo, 222-3333", foundContact);
	}
	
	@Test
	void testWhenFoundContactIsLastInListWithNumberSearch() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleTwo");
		testViewModel.getPhoneNumber().set("222-3333");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleThree");
		testViewModel.getPhoneNumber().set("333-4444");
		testViewModel.addContact();
		
		testViewModel.getSearchCriteria().set("333-4444");
		String foundContact = testViewModel.findContact();
		
		assertEquals("ExampleThree, 333-4444", foundContact);
	}

}
