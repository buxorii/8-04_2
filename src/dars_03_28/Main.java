package dars_03_28;
public class Main {
    public static void main(String[] args) {

//        Card[] maktabList = new Card[20];
//        int count=0;
//
//        Card c1 = new Card("45628902",1111);
//        maktabList[count]=c1;
//        maktabList[count].cardNumber = c1.cardNumber;
//        count++;
//
//        for (int i = 0; i < count; i++) {
//            System.out.println(maktabList[i].holder+"\n"+maktabList[i].password);
//        }

        Group g1 = new Group("8-04");
        Student s1 = new Student("Aliyev A.",15,"Toshkent");
        Student s2 = new Student("Hasanov H.",14,"Buxoro");
        g1.add(s1);
        g1.add(s2);
        g1.showGroup("8-04");


    }
}