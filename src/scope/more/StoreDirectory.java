package scope.more;

public class StoreDirectory {
	Bookstore bookstore;
	Market market;
	public StoreDirectory(String custId){
		bookstore = new Bookstore(custId);
		market = new Market();
	}
	
	
	
	//books
	public int getNumberOfBooks() {
		return bookstore.getNumBooks();
	}
	
	public int getNumberOfBookstoreEmployees() {
		return bookstore.getNumEmployees();
	}
	
	public boolean addNewEmployee(String employeeId){
		return bookstore.addNewEmployee(employeeId); 
	}
	
	public boolean bookIsInStock(String bookId){
		return bookstore.bookIsInStock(bookId);
	}

	//Implemented
	public int getNumCDsInBookstore(){
		return bookstore.getNumCds();
	}

	//Implemented
	public boolean addNewCD(int cdId){
		return bookstore.addCd(cdId);
	}

	//Implemented
	public boolean addNewBook(String bookId){
		return bookstore.addNewBook(bookId);
	}

	//market
	//Implemented
	public boolean marketCarriesFoodItem(String foodItem){
		return market.carriesFoodItem(foodItem);
	}

}
