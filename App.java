package PemLan.LatInheritance;

public class App{
    public static void main(String[] args) {
        bujurSangkar bujurSangkar = new bujurSangkar(15,"Bujur Sangkar");
        bujurSangkar.info();
        bujurSangkar.luas();
        
        Lingkaran Lingkaran = new Lingkaran(10, "Lingkaran");
        Lingkaran.info();
        Lingkaran.luas();
    }
}

class bidangDuaDimensi { //superClass
    protected String nama;
    public bidangDuaDimensi(String nama){
        this.nama = nama;
    }

    public void info(){
        System.out.println("Nama: " + nama);
    }

    public void luas(){

    }
}

class bujurSangkar extends bidangDuaDimensi{ //subClass
    int sisi;
    public bujurSangkar(int sisi, String nama){
        super(nama);
        this.sisi = sisi;
    }
    public void luas(){
        System.out.println(sisi*sisi);
    }
}

class Lingkaran extends bidangDuaDimensi{ //subClass
    int jari;
    public Lingkaran(int jari, String nama){
        super(nama);
        this.jari=jari;
    }
    public void luas(){
        System.out.println((22/7)*jari*jari);
    }
}
