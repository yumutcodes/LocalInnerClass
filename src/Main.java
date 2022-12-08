public class Main {
    public static void main(String[] args) {
        class Selamlar {
            public void selamTurkce() {
                System.out.println("turkçe");
            }

            public void selamIngilizce() {
                System.out.println("Ingilizce");
            }
        }
        Selamlar selamlar = new Selamlar();
        selamlar.selamIngilizce();
        selamlar.selamTurkce();
    }


}