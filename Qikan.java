package bookmanage1;

public class Qikan extends Book1 {
    private String qdate;
    public Qikan(int pages,int price,String qdate ){
        super(pages,price);
        this.qdate = qdate;
    }
    public void Info(){
        System.out.println("这是一本期刊，"+pages+"页，"+price+"元,"+"出版日期"+qdate);
    }
}
