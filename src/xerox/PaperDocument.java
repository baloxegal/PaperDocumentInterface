package xerox;

public class PaperDocument implements PaperDocumentInterface, Cloneable{

	String type;
	String title;
	String content;
	
	protected PaperDocument(String type, String title, String content) {
		super();
		this.type = type;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Type: " + type + "\nTitle: " + title + "\nContent:" + content;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		this.type = type;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public void setContent(String content) {
		// TODO Auto-generated method stub
		this.content = content;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}

	@Override
	protected PaperDocumentInterface clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (PaperDocumentInterface) super.clone();
	}
}
