public class Student {
    Course tarih;
    Course fizik;
    Course matematik;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course tarih, Course fizik, Course matematik) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.tarih = tarih;
        this.fizik = fizik;
        this.matematik = matematik;
        calcAvarage();
        this.isPass = false;

    }

    void addBulkExamNote(int tarih, int fizik, int matematik, int tarihQuiz, int fizikQuiz, int matQuiz) {
        if (tarih >= 0 && tarih <= 100) {
            this.tarih.note = tarih;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (matematik >= 0 && matematik <= 100) {
            this.matematik.note = matematik;
        }
        if (tarihQuiz >= 0 && tarihQuiz <= 100) {
            this.tarih.quiz = tarihQuiz;
        }
        if (fizikQuiz >= 0 && fizikQuiz <= 100) {
            this.fizik.quiz = fizikQuiz;
        }
        if (matQuiz >= 0 && matQuiz <= 100) {
            this.matematik.quiz = matQuiz;
        }

    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.matematik.note);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Tarih Sınav Notu : " + this.tarih.note);
        System.out.println("---------------------------");
        System.out.println("Matematik Sözlü Notu : " + this.matematik.quiz);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.quiz);
        System.out.println("Tarih Sözlü Notu : " + this.tarih.quiz);
    }

    public void isPass() {
        if (this.tarih.note == 0 || this.fizik.note == 0 || this.matematik.note == 0 || this.tarih.quiz == 0 || this.fizik.quiz == 0 || this.matematik.quiz == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;

    }

    public void calcAvarage() {

        double tarihDeneme = (this.tarih.quiz * 0.20) + (this.tarih.note * 0.80);
        double matDeneme = (this.matematik.quiz * 0.20) + (this.matematik.note * 0.80);
        double fizDeneme = (this.fizik.quiz * 0.20) + (this.fizik.note * 0.80);

        this.avarage = (tarihDeneme + matDeneme + fizDeneme) / 3.0;

    }
}