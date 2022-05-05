public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;

    public Course(String name,String code,String prefix) {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.quiz=0;
    }
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
        }

    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
