package j18_Constructor;

public class C04_Student {
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;

    @Override
    public String toString() {
        return "C04_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }

    public void mezuniyet(){
        if (ortalama>=50){
            System.out.println("agam diploman hayırlı olsung");
        }
        else System.out.println("agam seneyede bekliyıh");

    }

}
