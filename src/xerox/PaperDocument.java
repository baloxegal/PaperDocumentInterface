package xerox;

public class PaperDocument implements PaperDocumentInterface{

	String type;
	String title;
	String content;
	
	private PaperDocument(String type, String title, String content) {
		super();
		this.type = type;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "PaperDocument [" + (type != null ? "type=" + type + ", " : "")
				+ (title != null ? "title=" + title + ", " : "") + (content != null ? "content=" + content : "") + "]";
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
	public PaperDocumentInterface clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (PaperDocumentInterface)super.clone();
	}
	
	
	
}
