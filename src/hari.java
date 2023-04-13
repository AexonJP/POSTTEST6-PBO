public class hari {
    String minta_hari(){
        System.out.println("");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. kamis");
        System.out.println("5. Jum'at");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.print("pilih yang mana (1-7 ): ");int x = (new error()).cek_int();
        while(x<1 || x>7){
            System.out.print("input integer (1-7) : ");
            x = (new error()).cek_int();
        }
        System.out.println("");
        if(x == 1){
            return "Senin";
        }
        else if(x == 2){
            return "Selasa";
        }
        else if(x == 3){
            return "Rabu";
        }
        else if(x == 4){
            return "kamis";
        }
        else if(x == 5){
            return "Jum'at";
        }
        else if(x == 6){
            return "Sabtu";
        }
        else if(x == 7){
            return "Minggu";
        }
        return "";
    }
}
