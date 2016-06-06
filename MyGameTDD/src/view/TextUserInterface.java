package view;

public class TextUserInterface {

	private void printArea(String string){
		System.out.print(string);
	}

	public void print(String string) {
		printArea(string);
	}

	public void println(String string) {
		printArea(string + "\n");
	}

//	public void printMenu(String[] Menu) {
//		for (int i = 0; i < Menu.length; i++) {
//			println(Menu[i]);
//		}
//	}
}
