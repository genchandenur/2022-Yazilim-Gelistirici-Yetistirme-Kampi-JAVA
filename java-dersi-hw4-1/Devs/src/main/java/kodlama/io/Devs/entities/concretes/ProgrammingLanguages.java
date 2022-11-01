package kodlama.io.Devs.entities.concretes;
// Veritabanı nesnelerimizi bu kısımda belirtiriz.
public class ProgrammingLanguages {
	private int id;
	private String programmingLanguageName;
	
	public ProgrammingLanguages() {
		super();
	}

	public ProgrammingLanguages(int id, String programmingLanguageName) {
		super();
		this.id = id;
		this.programmingLanguageName = programmingLanguageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgrammingLanguageName() {
		return programmingLanguageName;
	}

	public void setProgrammingLanguageName(String programmingLanguageName) {
		this.programmingLanguageName = programmingLanguageName;
	}
	
	
}
