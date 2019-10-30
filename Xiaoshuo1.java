package bookmanage1;

public class Xiaoshuo1 extends Book1 {
    private String XAuthor;
    private int topiao;
    public Xiaoshuo1(int pages,int price,String XAuthor,int topiao){
        super(pages,price);
        this.XAuthor =XAuthor;
        this.topiao =topiao;
    }

    public int getToupiao() {
        return topiao;
    }

    public void setToupiao(int toupiao) {
        topiao = toupiao;
    }

    public String getXAuthor() {
        return XAuthor;
    }

    public void setXAuthor(String XAuthor) {
        this.XAuthor = XAuthor;
    }
    public void Info(){
        System.out.println("这是一本小说，"+pages+"页，"+price+"元,"+"作者是"+XAuthor+",得票数"+topiao);
    }
}
