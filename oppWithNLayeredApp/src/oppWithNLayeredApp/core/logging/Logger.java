package oppWithNLayeredApp.core.logging;

public interface Logger {
	// loglama yapıcak olan sistemde 
	// metne yazıcak olsak da db'ye elastic search'e yazıcaksak da
	// bir data yolluyoruz. İmzamın bu olduğunu söylüyorum.
	// Bunu uyun diyorum hepsine
	void log(String data);
}
