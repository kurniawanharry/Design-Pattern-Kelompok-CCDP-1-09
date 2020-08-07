public class StudioPatternDemo {

    public static Studio getNamaStudio(){
        Studio utama = new TStudio("Utama");
        Studio standar = new TStudio("Standar");
        return new OrStudio(utama, standar);
    }

    public static Studio getNamaPegawai(){
        Studio tama = new TStudio("Tama");
        Studio hanhan = new TStudio("Hanhan");
        return new AndStudio(tama, hanhan);
    }

    public static void main(String[] args) {
        Studio isNamaStudio = getNamaStudio();
        Studio isNamaPegawai = getNamaPegawai();

        System.out.println("Utama adalah Studio premier ? " + isNamaStudio.interpret("Utama"));
        System.out.println("Tama adalah nama pegawai ? " + isNamaPegawai.interpret("Tama"));

    }
}