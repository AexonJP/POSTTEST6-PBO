import java.util.Scanner;

interface class animes{
    protected String nama;
    protected String hari;
    protected int episode;
    protected Float rating;
    protected String studio;
    protected String genre;
    protected String sipnosis;
    String get_nama();
    void display();
    void ubah();

}

class animeKosong extends animes {
    // protected String nama;
    // protected String hari;
    // protected int episode;
    // protected Float rating;
    // protected String studio;
    // protected String genre;
    // protected String sipnosis;

    public animeKosong (String nama, String hari, int episode, Float rating, String studio, String genre, String sipnosis){
        this.nama=nama;
        this.hari = hari;
        this.episode = episode;
        this.rating = rating;
        this.studio = studio;
        this.genre = genre;
        this.sipnosis = sipnosis;
    }

    public animeKosong (String nama, String hari, int episode, Float rating, String studio, String genre){
        this.nama=nama;
        this.hari = hari;
        this.episode = episode;
        this.rating = rating;
        this.studio = studio;
        this.genre = genre;
        this.sipnosis = "";
    }


    public String get_nama(){
        return this.nama;
    }

    public animeKosong tambah() {
        Scanner inputan = new Scanner(System.in);
        System.out.println("--------Menambahkan anime terbaru ke dalam array-------");
        System.out.print("masukkan nama : ");
        this.nama = inputan.nextLine();
        System.out.print("pada hari : ");
        this.hari = (new hari()).minta_hari();
        System.out.print("berapa episode : ");
        this.episode = (new error()).cek_int();
        System.out.print("masukkan rating : ");
        this.rating = (new error().cek_float());
        System.out.print("masukkan studio : ");
        this.studio = inputan.nextLine();
        System.out.print("masukkan genre : ");
        this.genre = inputan.nextLine();
        System.out.print("masukkan sipnosis : ");
        this.sipnosis = inputan.nextLine();
        return this;
    }

    public void display() {
        System.out.println("========== berikut rincian anime yang di pilih ==========");
        System.out.println("nama anime adalah : " + this.nama);
        System.out.println("tayang pada hari : " + this.hari);
        System.out.println("banyak episode : " + this.episode);
        System.out.println("dengan rating : " + this.rating);
        System.out.println("studio pembuat : " + this.studio);
        System.out.println("dengan genre : " + this.genre);
        System.out.println("sipnosis : " + this.sipnosis);
    }

    public void ubah() {
        Scanner inputan = new Scanner(System.in);
        System.out.println("========== berikut rincian anime yang di pilih ==========");
        System.out.println("1. nama anime adalah : " + this.nama);
        System.out.println("2. tayang pada hari : " + this.hari);
        System.out.println("3. banyak episode : " + this.episode);
        System.out.println("4. dengan rating : " + this.rating);
        System.out.println("5. studio pembuat : " + this.studio);
        System.out.println("6. dengan genre : " + this.genre);
        System.out.println("7. sipnosis : " + this.sipnosis);
        System.out.print("ingin mengubah nomor : ");
        int nomor = (new error()).cek_int();
        if (nomor == 1) {
            System.out.print("masukkan nama : ");
            this.nama = inputan.nextLine();
        } else if (nomor == 2) {
            System.out.print("masukkan hari : ");
            this.hari = (new hari()).minta_hari();

        } else if (nomor == 3) {
            System.out.print("masukkan episode : ");
            this.episode = (new error()).cek_int();

        } else if (nomor == 4) {

            System.out.print("masukkan rating : ");
            this.rating = (new error().cek_float());
        } else if (nomor == 5) {

            System.out.print("masukkan studio : ");
            this.studio = inputan.nextLine();
        } else if (nomor == 6) {
            System.out.print("masukkan genre : ");
            this.genre = inputan.nextLine();

        } else if (nomor == 7) {
            System.out.print("masukkan sipnosis : ");
            this.sipnosis = inputan.nextLine();

        } else {
            System.out.println("gagal mengubah");
            return;
        }
        System.out.println("berhasil mengubah");
        return;
    }
}

class anime_mangas extends animeKosong {
    public anime_mangas(String nama, String hari, int episode, Float rating, String studio, String genre,
            String sipnosis) {
        super(nama, hari, episode, rating, studio, genre, sipnosis);
    }
    public anime_mangas(String nama, String hari, int episode, Float rating, String studio, String genre) {
        super(nama, hari, episode, rating, studio, genre);
    }

    String manga;
    

    public anime_mangas tambah(){
        Scanner inputan = new Scanner(System.in);
        super.tambah();
        System.out.print("masukkan dari manga mana : ");
        this.manga = inputan.nextLine();
        return this;
    }
    public void display() {
        super.display();
        System.out.println("berdasarkan manga : " + this.manga);
    }

    public void ubah(){
        Scanner inputan = new Scanner(System.in);
        System.out.println("========== berikut rincian anime yang di pilih ==========");
        System.out.println("1. nama anime adalah : " + this.nama);
        System.out.println("2. tayang pada hari : " + this.hari);
        System.out.println("3. banyak episode : " + this.episode);
        System.out.println("4. dengan rating : " + this.rating);
        System.out.println("5. studio pembuat : " + this.studio);
        System.out.println("6. dengan genre : " + this.genre);
        System.out.println("7. sipnosis : " + this.sipnosis);
        System.out.println("8. berdasarkan manga : " + this.manga);
        System.out.print("ingin mengubah nomor : ");
        int nomor = (new error()).cek_int();
        if (nomor == 1) {
            System.out.print("masukkan nama : ");
            this.nama = inputan.nextLine();
        } else if (nomor == 2) {
            System.out.print("masukkan hari : ");
            this.hari = (new hari()).minta_hari();

        } else if (nomor == 3) {
            System.out.print("masukkan episode : ");
            this.episode = (new error()).cek_int();

        } else if (nomor == 4) {

            System.out.print("masukkan rating : ");
            this.rating = (new error().cek_float());
        } else if (nomor == 5) {

            System.out.print("masukkan studio : ");
            this.studio = inputan.nextLine();
        } else if (nomor == 6) {
            System.out.print("masukkan genre : ");
            this.genre = inputan.nextLine();

        } else if (nomor == 7) {
            System.out.print("masukkan sipnosis : ");
            this.sipnosis = inputan.nextLine();

        }
        else if(nomor == 8){
            System.out.print("berdasarkan manga : ");
            this.manga = inputan.nextLine();
        }
        else {
            System.out.println("gagal mengubah");
            return;
        }
        System.out.println("berhasil mengubah");
        return;
    }
}

final class anime_light_novels extends animeKosong {
    public anime_light_novels(String nama, String hari, int episode, Float rating, String studio, String genre, String sipnosis) {
        super(nama, hari, episode, rating, studio, genre, sipnosis);
    }
    public anime_light_novels(String nama, String hari, int episode, Float rating, String studio, String genre) {
        super(nama, hari, episode, rating, studio, genre);
    }

    String light_novel;
    public anime_light_novels tambah(){
        Scanner inputan = new Scanner(System.in);
        super.tambah();
        System.out.print("masukkan dari Light Novel mana : ");
        this.light_novel = inputan.nextLine();
        return this;
    }
    final public void display() {
        super.display();
        System.out.println("berdasarkan light_novel : " + this.light_novel);
    }

    public void ubah(){
        Scanner inputan = new Scanner(System.in);
        System.out.println("========== berikut rincian anime yang di pilih ==========");
        System.out.println("1. nama anime adalah : " + this.nama);
        System.out.println("2. tayang pada hari : " + this.hari);
        System.out.println("3. banyak episode : " + this.episode);
        System.out.println("4. dengan rating : " + this.rating);
        System.out.println("5. studio pembuat : " + this.studio);
        System.out.println("6. dengan genre : " + this.genre);
        System.out.println("7. sipnosis : " + this.sipnosis);
        System.out.println("8. berdasarkan light_novel : " + this.light_novel);
        System.out.print("ingin mengubah nomor : ");
        int nomor = (new error()).cek_int();
        if (nomor == 1) {
            System.out.print("masukkan nama : ");
            this.nama = inputan.nextLine();
        } else if (nomor == 2) {
            System.out.print("masukkan hari : ");
            this.hari = (new hari()).minta_hari();

        } else if (nomor == 3) {
            System.out.print("masukkan episode : ");
            this.episode = (new error()).cek_int();

        } else if (nomor == 4) {

            System.out.print("masukkan rating : ");
            this.rating = (new error().cek_float());
        } else if (nomor == 5) {

            System.out.print("masukkan studio : ");
            this.studio = inputan.nextLine();
        } else if (nomor == 6) {
            System.out.print("masukkan genre : ");
            this.genre = inputan.nextLine();

        } else if (nomor == 7) {
            System.out.print("masukkan sipnosis : ");
            this.sipnosis = inputan.nextLine();

        }else if(nomor == 8){
            System.out.print("berdasarkan loght novel : ");
            this.light_novel = inputan.nextLine();
        } else {
            System.out.println("gagal mengubah");
            return;
        }
        System.out.println("berhasil mengubah");
        return;
    }
}