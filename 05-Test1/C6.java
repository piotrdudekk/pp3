public class C6 {
    private int pages;
    private String title;
    /* 
    public C6(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    */
    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setPages(int pages){
        if (pages>0){
            this.pages=pages;
        }
    }

    public static void main (String[] args){
        C6 o = new C6();
        o.setPages(3);
        o.setPages(-4);
        System.out.println(o.getPages()); 

    }

}
