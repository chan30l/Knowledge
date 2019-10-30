package bookmanage1;

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
