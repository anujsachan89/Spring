package dependencyWithCollection;

import java.util.List;

public class Resturant {

	private List resturantWaiterList;
	public void setResturantWaiterList(List resturantWaiterList) {
		this.resturantWaiterList = resturantWaiterList;
	}
	public void displayWaiterNames(){
		System.out.println("All Waiter working in Resturant :"+resturantWaiterList);
	}
}
