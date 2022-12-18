import java.util.Scanner;

public class PatikaOdev1 {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner oku=new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat=oku.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik=oku.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya=oku.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce=oku.nextInt();

        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih=oku.nextInt();

        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik=oku.nextInt();

        int toplam=(mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama=toplam/6;
        System.out.println("Ortalamanız: "+ortalama);

        String str =(ortalama>=60 )?"GEÇTİ":"KALDI";
        System.out.println("DURUM : " + str);
    }
}
