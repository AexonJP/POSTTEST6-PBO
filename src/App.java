
// import java.util.Scanner;
import java.util.ArrayList;

public class App {
    /**
     * // * @param args
     * //* @throws Exception
     */
    static void kosong() {
        final String x = "\nTekan enter untuk melanjutkan...";
        System.out.print(x);
        System.console().readPassword();
    }

    static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            System.out.println("\033\143");
        }
    }

    public static void main(String[] args) {
        ArrayList<animeKosong> anime = new ArrayList<animeKosong>();
        ArrayList<anime_mangas> anime_manga = new ArrayList<anime_mangas>();
        ArrayList<anime_light_novels> anime_light_novel = new ArrayList<anime_light_novels>();

        while (true) {
            clear();

            System.out.println("--------- Menu Utama ----------");
            System.out.println("1. menambahkan anime");
            System.out.println("2. melihat anime");
            System.out.println("3. hapus anime");
            System.out.println("4. ubah anime");
            System.out.println("0. berhenti");
            System.out.print("nomor berapa : ");
            int nomor = (new error()).cek_int();
            clear();
            if (nomor == 1) {
                System.out.println("1. menambahkan anime original");
                System.out.println("2. menambahkan anime dari manga");
                System.out.println("3. menambahkan anime dari LN");
                System.out.print("ingin menambahkan yang mana : ");
                nomor = (new error()).cek_int();
                if (nomor == 1) {
                    anime.add(new animeKosong("","",0,Float.valueOf(0),"","","").tambah());

                } else if (nomor == 2) {
                    anime_manga.add(new anime_mangas("","",0,Float.valueOf(0),"","","").tambah());
                } else if (nomor == 3) {
                    anime_light_novel.add(new anime_light_novels("","",0,Float.valueOf(0),"","","").tambah());
                }
            } else if (nomor == 2) {
                System.out.println("Daftar anime yang ada :");
                for (int i = 0; i < anime.size(); i++) {
                    System.out.println((i + 1) + ". " + anime.get(i).get_nama());
                }
                
                System.out.println("");
                System.out.println("Daftar anime yang berasal dari manga :");
                for (int i = anime.size(); i < anime.size() + anime_manga.size(); i++) {
                    System.out.println((i + 1) + ". " + anime_manga.get(i - anime.size()).get_nama());
                }
                
                System.out.println("");
                System.out.println("Daftar anime yang berasal dari light novel :");
                
                for (int i = anime.size() + anime_manga.size(); i < anime.size() + anime_manga.size()
                        + anime_light_novel.size(); i++) {
                    System.out.println(
                            (i + 1) + ". " + anime_light_novel.get(i - anime.size() - anime_manga.size()).get_nama());
                }
                System.out.println("");
                System.out.print("ingin melihat detail anime nomor : ");
                int detail = (new error()).cek_int();
                clear();
                if (detail - 1 < anime.size()) {
                    anime.get(detail - 1).display();
                } else if (detail - 1 < anime_manga.size()) {
                    anime_manga.get(detail - 1 - anime.size()).display();
                } else if (detail - 1 < anime_light_novel.size()) {
                    anime_light_novel.get(detail - 1 - anime.size() - anime_manga.size()).display();
                } else {
                    continue;
                }
                kosong();
            } else if (nomor == 3) {
                System.out.println("Daftar anime yang ada :");
                for (int i = 0; i < anime.size(); i++) {
                    System.out.println((i + 1) + ". " + anime.get(i).get_nama());
                }

                System.out.println("Daftar anime yang berasal dari manga :");
                for (int i = anime.size(); i < anime.size() + anime_manga.size(); i++) {
                    System.out.println((i + 1) + ". " + anime_manga.get(i - anime.size()).get_nama());
                }

                System.out.println("Daftar anime yang berasal dari light novel :");
                for (int i = anime.size() + anime_manga.size(); i < anime.size() + anime_manga.size()
                        + anime_light_novel.size(); i++) {
                    System.out.println(
                            (i + 1) + ". " + anime_light_novel.get(i - anime.size() - anime_manga.size()).get_nama());
                }
                System.out.print("ingin menhapus anime nomor : ");
                int detail = (new error()).cek_int();
                clear();
                if (detail - 1 < anime.size()) {
                    anime.get(detail - 1).display();
                } else if (detail - 1 < anime_manga.size()) {
                    anime_manga.get(detail - 1 - anime.size()).display();
                } else if (detail - 1 < anime_light_novel.size()) {
                    anime_light_novel.get(detail - 1 - anime.size() - anime_manga.size()).display();
                } else {
                    continue;
                }

                System.out.print("yakin ingin menghapus anime (y / n): ");
                String yakin = (new error()).cek_string();
                if (yakin.toUpperCase().equals("Y")) {
                    if (detail - 1 < anime.size()) {
                        anime.remove(detail - 1);
                    } else if (detail - 1 < anime_manga.size()) {
                        anime_manga.remove(detail - 1 - anime.size());
                    } else if (detail - 1 < anime_light_novel.size()) {
                        anime_light_novel.remove(detail - 1 - anime.size() - anime_manga.size());
                    } else {
                        continue;
                    }
                    System.out.println("anime berhasil di hapus");
                    kosong();
                } else {
                    System.out.println("anime tidak jadi di hapus");
                    kosong();
                }
            } else if (nomor == 4) {
                System.out.println("Daftar anime yang ada :");
                for (int i = 0; i < anime.size(); i++) {
                    System.out.println((i + 1) + ". " + anime.get(i).get_nama());
                }

                System.out.println("Daftar anime yang berasal dari manga :");
                for (int i = anime.size(); i < anime.size() + anime_manga.size(); i++) {
                    System.out.println((i + 1) + ". " + anime_manga.get(i - anime.size()).get_nama());
                }

                System.out.println("Daftar anime yang berasal dari light novel :");
                for (int i = anime.size() + anime_manga.size(); i < anime.size() + anime_manga.size()
                        + anime_light_novel.size(); i++) {
                    System.out.println(
                            (i + 1) + ". " + anime_light_novel.get(i - anime.size() - anime_manga.size()).get_nama());
                }
                System.out.print("ingin mengubah anime nomor : ");
                int detail = (new error()).cek_int();
                clear();
                if (detail - 1 < anime.size()) {
                    anime.get(detail - 1).ubah();
                    ;
                } else if (detail - 1 < anime_manga.size()) {
                    anime_manga.get(detail - 1 - anime.size()).ubah();
                    ;
                } else if (detail - 1 < anime_light_novel.size()) {
                    anime_light_novel.get(detail - 1 - anime.size() - anime_manga.size()).ubah();
                    ;
                } else {
                    continue;
                }
                kosong();
            } else if (nomor == 0) {
                System.exit(0);
            }
        }
    }
}