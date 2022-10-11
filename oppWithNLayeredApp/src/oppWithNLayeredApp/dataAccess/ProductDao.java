package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entities.Product;

public interface ProductDao {
	// interface'ler sadece metod imzasını barındırabilir.
	void add(Product product);
	// ProductDao ile ilgili olan alternatifler
	// add gibi bir operasyonlar içerebilir.
	// parametreler dahil aynı olmalı
	// jdbc içersindeki add metodunu silersem bunu yaptıktan sonra
	// artık programdan hata almam hibernate'in add'ini kullanacaktır.
	
}
