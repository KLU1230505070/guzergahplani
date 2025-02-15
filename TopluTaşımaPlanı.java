import java.util.*;

class Mahalle {
    String ad;
    double nufusYogunlugu;
    double ulasimAltyapisi;
    double maliyet;
    double cevreselEtki;
    double sosyalFayda;

    public Mahalle(String ad, double nufusYogunlugu, double ulasimAltyapisi, double maliyet, double cevreselEtki, double sosyalFayda) {
        this.ad = ad;
        this.nufusYogunlugu = nufusYogunlugu;
        this.ulasimAltyapisi = ulasimAltyapisi;
        this.maliyet = maliyet;
        this.cevreselEtki = cevreselEtki;
        this.sosyalFayda = sosyalFayda;
    }
}

class TopluTasimaPlani {

    public static double[] softmax(double[] scores) {
        double sum = 0.0;
        double[] expScores = new double[scores.length];

        for (int i = 0; i < scores.length; i++) {
            expScores[i] = Math.exp(scores[i]);
            sum += expScores[i];
        }

        for (int i = 0; i < scores.length; i++) {
            expScores[i] /= sum;
        }
        return expScores;
    }

    public static void main(String[] args) {
        List<Mahalle> mahalleler = new ArrayList<>();
        mahalleler.add(new Mahalle("Merkez", 80, 60, 50, 40, 90));
        mahalleler.add(new Mahalle("Yenimahalle", 60, 70, 40, 50, 80));
        mahalleler.add(new Mahalle("Cumhuriyet", 70, 50, 60, 30, 85));

        double[] kriterler = new double[mahalleler.size()];

        for (int i = 0; i < mahalleler.size(); i++) {
            Mahalle m = mahalleler.get(i);
            kriterler[i] = (m.nufusYogunlugu * 0.3) + (m.ulasimAltyapisi * 0.2) - (m.maliyet * 0.2) - (m.cevreselEtki * 0.1) + (m.sosyalFayda * 0.3);
        }

        double[] agirliklar = softmax(kriterler);

        System.out.println("Mahalleler Icin Softmax Sonuclari:");
        for (int i = 0; i < mahalleler.size(); i++) {
            System.out.printf("%s: %.4f\n", mahalleler.get(i).ad, agirliklar[i]);
        }

        int enUygunIndex = 0;
        for (int i = 1; i < agirliklar.length; i++) {
            if (agirliklar[i] > agirliklar[enUygunIndex]) {
                enUygunIndex = i;
            }
        }

        System.out.println("\nEn uygun toplu tasima hatti onerisi: " + mahalleler.get(enUygunIndex).ad);

        // OpenStreetMap baglantisi
        System.out.println("Onerilen guzergahi gormek icin OpenStreetMap uzerinden kontrol edebilirsiniz: ");
        System.out.println("https://www.openstreetmap.org/search?query=" + mahalleler.get(enUygunIndex).ad.replace(" ", "%20"));
    }
}
