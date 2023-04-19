package posTest;

import java.math.BigDecimal;
import java.time.LocalDate;

import POSDM.StoreDM;
import posPD.CashDrawer;
import posPD.Cashier;
import posPD.Item;
import posPD.Person;
import posPD.Price;
import posPD.Register;
import posPD.Sale;
import posPD.SaleLineItem;
import posPD.Session;
import posPD.Store;
import posPD.TaxCategory;
import posPD.TaxRate;
import posUI.POSFrame;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store store= new Store(); 
		StoreDM storeData = new StoreDM();
		System.out.println("Ready to Open Store");
		storeData.loadData(store);
		storeData.printStoreinfo();
		System.out.println("Store Open: David's QuickMart");
		POSFrame.open(storeData.getAllStore());
		System.out.println(store);
	}
}
