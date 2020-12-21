package library;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook[]programmingBooks=new ProgrammingBook[5];
        programmingBooks[0]= new ProgrammingBook(1234,"java",50.000,"Hiếu","java","hhhh");
        programmingBooks[1]= new ProgrammingBook(5678,"hướng đối tượng",60.000,"Mừng","C++","mmm");
        programmingBooks[2]= new ProgrammingBook(3243,"java srcipt",70.000,"Thanh","java","ttt");
        programmingBooks[3]= new ProgrammingBook(7592,"php",80.000,"Khải","php","kkk");
        programmingBooks[4]= new ProgrammingBook(9344,"web",90.000,"Toàn","java","tttt");
        System.out.println(Arrays.deepToString(programmingBooks));
        FictionBook[]fictionBooks=new FictionBook[5];
        fictionBooks[0]=new FictionBook(123,"Hoàn",45,"Hoàn béo","kinh dị",40);
        fictionBooks[1]=new FictionBook(123,"Bách",55,"Bách phô","tình cảm",30);
        fictionBooks[2]=new FictionBook(123,"Việt",75,"Việt zin","Chiến tranh",55);
        fictionBooks[3]=new FictionBook(123,"Mạnh",80,"Mạnh vằn thắn","Ăn uống",40);
        fictionBooks[4]=new FictionBook(123,"Kiều Anh",85,"Anh híp","Hài",50);
        System.out.println(Arrays.deepToString(fictionBooks));
        int sum1=0;
        for (ProgrammingBook p:
             programmingBooks) {
            sum1+=p.getPrice();
        }
        System.out.println("tổng giá của 5 cuốn sách ProgrammingBook là :"+sum1);
        int sum2=0;
        for (FictionBook f:
             fictionBooks) {
            sum2 +=f.getPrice();
        }
        System.out.println("tổng giá của 5 cuốn sách FictionBook là:    "+sum2);
        int sum=sum1+sum2;
        System.out.println("tổng giá 10 cuốn sách là:"+sum);
        int count=0;
        for (ProgrammingBook b:
             programmingBooks) {
            if (b.getLanguage()=="java")
                count++;
        }
        double total=0;
        System.out.println(count);
        for (FictionBook f:
             fictionBooks) {
           total+= f.setDiscount(5);

        }
        System.out.println("tổng giá sau khi đã giảm 5% của FictionBook là:"+total);

    }

}
