package dars_03_28;

public class Group {
    Student[] studentList = new Student[5];
    String nomi;
    String sinfRahbari;

    int count;
    public void add(Student student){
        if (studentList.length>5)
            System.out.println("Guruh to'la");
        else
            studentList[count++]=student;
    }

    public Group(String nomi) {
        this.nomi = nomi;
    }

    public void showGroup(String nomi){
        if (this.nomi.contains(nomi)){
            this.nomi=nomi;
            System.out.println(nomi+" guruhining o'quvchilari: ");
            for (int i = 0; i < count; i++) {
                System.out.println((i+1)+". "+studentList[i].fullName);
            }
        }
        else {
            System.out.println("Bunday guruh yo'q");
        }
    }

}
