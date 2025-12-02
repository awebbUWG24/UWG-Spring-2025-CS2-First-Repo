package testMainWindowViewModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.contact_manager.viewmodel.MainWindowViewModel;

class TestAddContact {

	@Test
	void TestAddNameWithNormalInput() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		assertEquals("Example, 111-2222", testViewModel.getContacts().get(0).toString());
	}
	
	@Test
	void TestAddNameWhenNameIsInvalid() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("1");
		testViewModel.getPhoneNumber().set("111-2222");
		
		assertThrows(IllegalArgumentException.class, () -> {
			testViewModel.addContact();
		});
	}
	
	@Test
	void TestAddNameWhenNumberIsInvalid() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("2");
		
		assertThrows(IllegalArgumentException.class, () -> {
			testViewModel.addContact();
		});
	}
	
	@Test
	void TestAddNameWhenThereIsADuplicateName() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("222-3333");
		
		assertThrows(IllegalArgumentException.class, () -> {
			testViewModel.addContact();
		});
	}
	
	@Test
	void TestAddNameWhenThereIsADuplicateNumber() {
		MainWindowViewModel testViewModel = new MainWindowViewModel();
		
		testViewModel.getName().set("Example");
		testViewModel.getPhoneNumber().set("111-2222");
		testViewModel.addContact();
		
		testViewModel.getName().set("ExampleTwo");
		testViewModel.getPhoneNumber().set("111-2222");
		
		assertThrows(IllegalArgumentException.class, () -> {
			testViewModel.addContact();
		});
	}

}
