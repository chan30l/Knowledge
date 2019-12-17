package bookmanage1;

/**

*Description:

*Author:cl

*Date:2019-11-9

*/

public class Book1 {

    public int pages;

    public int price;

    public Book1(int pages,int price){

        this.pages=pages;

        this.price=price;

    }

    public int getPrice() {

        return price;

    }



    public void setPrice(int price) {

        this.price = price;

    }



    public int getPages() {

        return pages;

    }



    public void setPages(int pages) {

        this.pages = pages;

    }

}
public class Keben extends Book1 {

    private String duixiang;

    public Keben(int pages,int price,String duixiang){

        super(pages,price);

        this.duixiang =duixiang;

    }

    public void Info(){

        System.out.println("这是一本课本，"+pages+"页，"+price+"元,"+"使用者群体:"+duixiang);

    }

}
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
public class Zazhi1 extends Book1 {

    private String zdate;

    public Zazhi1(int pages,int price,String zdate){

        super(pages,price);

        this.pages = pages;

        this.price = price;

        this.zdate = zdate;

    }

    public void Info(){

        System.out.println("这是一本杂志，"+pages+"页，"+price+"元,"+"出版日期"+zdate );

    }

}
public class Zong {

    public static void main(String[] args){

        String jame="jame";

        String Sixmonth ="2019-06-03";

        String  fk="Students";

        Xiaoshuo1 xiaoshuo1 = new Xiaoshuo1(100,46,jame, 5689);

        xiaoshuo1.Info() ;

        Zazhi1 zazhi = new Zazhi1(56,32,Sixmonth);

        zazhi.Info() ;

        Qikan qikan = new Qikan(66,55,Sixmonth );

        qikan.Info() ;

        Keben keben = new Keben(263,58,fk);

        keben.Info() ;

    }

}
