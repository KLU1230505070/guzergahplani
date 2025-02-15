# Toplu Taşıma Planı ve Softmax Hesaplaması

Proje, Kırklareli şehir merkezine bir toplu taşıma hattı önerisi planıyla çalışmaktadır. Proje, mahallelerin farklı parametrelerine göre (nüfus yoğunluğu, ulaşım altyapısı, maliyet, çevresel etki, sosyal fayda) Softmax algoritması ile en uygun toplu taşıma hattını seçmeyi amaçlamaktadır.

## Proje Özeti

Projede, toplu taşıma hattı önerilerinin karşılanacak çeşitli kriterlere göre değerlendirilmesi yapılır. Softmax algoritmasıyla her bir mahalleye bir ağırlık verilmiş ve en uygun mahalle sıralanmıştır. Kullanıcıya, en uygun mahalleyi ve bu mahalleyi OpenStreetMap üzerinden görmek için bir bağlantı önerisi sunulmaktadır.

### Kullanıcı Girdisi

Mahalleler ve ilgili veriler manuel olarak belirlenmiştir. Bu veriler aşağıdaki parametreleri içerir:

- **Nüfus Yoğunluğu**: Mahalledeki kişi başına düşen alan yoğunluğu (örneğin: km² başına kişi sayısı)
- **Ulaşım Altyapısı**: Toplu taşıma altyapısının kalitesi (örneğin: otobüs hatları, metro istasyonları, vb.)
- **Maliyet**: Toplu taşıma hattının inşaat maliyeti
- **Çevresel Etki**: Toplu taşıma hattının çevreye olan olumsuz etkisi
- **Sosyal Fayda**: Mahalle sakinlerine toplu taşıma hattı tarafından sağlanacak sosyal fayda

### Softmax Hesaplaması

Softmax fonksiyonu, verilen puanları normalize eder ve en uygun mahalleyi seçer. Puanlar, her bir kriterin belirli ağırlıklarla çarpılarak hesaplanır.

### Sonuçlar

Softmax algoritması, verilen kriterlere göre en uygun mahalleyi belirler. Kullanıcıya, bu mahalleyi OpenStreetMap üzerinden görmek için bir bağlantı önerisi sunulur.

## Kullanım

### Gereksinimler

- Java 8 veya daha yeni bir sürüm
- IntelliJ IDEA ya da Eclipse gibi bir IDE (isteğe bağlı)

### Kurulum

1. Aşağıdaki repository'yi klonlayın:
    ```bash
    git clone https://github.com/kullanici_adiniz/toplu-tasima-plani.git
    ```

2. Proje dosyasını bir Java IDE'sine yükleyin.

3. Programı çalıştırın:
    ```bash
    java TopluTasimaPlani
    ```

4. Çıktıyı terminalde görebilirsiniz.

### Çıktı Örneği

