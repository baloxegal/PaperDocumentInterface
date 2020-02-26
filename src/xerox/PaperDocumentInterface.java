package xerox;

public interface PaperDocumentInterface {
	public void setType(String type);
    public String getType();
    public void setTitle(String title);
    public String getTitle();
    public void setContent(String content);
    public String getContent();
	PaperDocumentInterface clone() throws CloneNotSupportedException;
}
