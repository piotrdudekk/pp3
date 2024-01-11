public class Chapter {
    private String title;
    private int pages;
    private int startPage;

    public Chapter (String title, int pages, int startPage){
        this.title=title;
        this.pages=pages;
        this.startPage=startPage;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getStartPage() {
        return this.startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

}
