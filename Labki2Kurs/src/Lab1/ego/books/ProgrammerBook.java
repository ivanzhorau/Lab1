package Lab1.ego.books;

public class ProgrammerBook extends Book{
	private String language;
	private int level;
	public ProgrammerBook(String title, String autor, int price,String language,int level) {
		super(title, autor, price);
		this.language = language;
		this.level = level;
		// TODO Auto-generated constructor stub
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return super.toString()+" "+language+" "+level;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	} 
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}

}
