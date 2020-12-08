## Giriş

Apache Spark ile ilgili tuttuğum notlar.

Eğer bir yanlışım varsa lütfen düzeltmeme yardım edin. Yanlış bildiğim şeyler ne kadar erken ortaya çıkarsa o kadar iyi olur. Teşekkür ederim.

## Spark

Spark büyük veri işleme motoru olarak bilinir. Hadoop' dan farklı hızlı olmasıymış. SQL, Machine Learning, Streaming (akan veri üzerinde çalışma)[sanırım real time olarak gelen veriler üzerinde işlem yapma], grafik işleme(?) modülleri varmış. Spark' ı temelde veri mühendisleri kullansa da veri bilimcileri keşif amaçlı veri analizi, özellik çıkarımı ve ML yapmak için Spark' tan faydalanabilirler.

Apache Spark büyük veri üzerinde paralel işlem yapmaya yarayan bir kütüphanedir. Açık kaynak kodludur. Scala ile geliştirilmiştir.


### Ne zaman Spark’ı kullanırız?

__Data entegrasyonu ve ETL__: Farklı kaynaklardan gelen verilerin görselleştirilmesi, işlenmesi ve analizi için temizlenmesi ve birleştirilmesi. [Kendi kelimelerimle: Farklı kaynaklardan veriler geliyor. Gelen verilerin görselleştirilmesi için, işlenebilmesi için, analizlerinin yapılabilmesi için temizlenmesi ve birleştirilmesi işleminde kullanılabiliyor]

__Makine öğrenmesi ve İleri Seviye Analitikler__: Karmaşık algoritmalar kullanılarak çıktı tahmini, hata tesbiti, saklı bilgilerin ortaya çıkarılması ve girdi verilerine dayanarak karar verilmesi.

__Interaktif Analitikler (veya İş Zekası)__: Şirketlerin kararlarında kullanılıyor. Ürün ile ilgili ya da şirketin düzeni ile ilgili. Şu saatlerde verim olamıyuz. Çalışanlarımızın enerjileri çok düşüyor. Bu duruma karşı bir şey yapalım, Ürünümüzü şöyle yaparsak daha çok satış elde ederiz gibi.

__Gerçek zamanlı veri işleme (veya streaming)__: Sana veril sağlayan aletlerden verileri Real-Time olarak toplayıp o verilerden bir şeyler çıkarma.

### Apache Spark Ekosistemi

__Spark Core__: Spark' ın sunduğu işlerle var. Bu işlevler için temel altyapıdır. Spark' ın işlevleri yazılım dili Spark Core ile makine kodu olarak düşünüyorum. In-memory işlem kapasitedine sahipmiş (ne demekse). Sanırım R, SQL(?), Python, Scala, Java, MySQL' e destek veriyor. 

__Spark SQL + Dataframes__: Birçok veri bilimcisi, veri analisti ve iş zekası kullanıcıları, veri keşfi(sanırım verilerden bir şeyler çıkarma) için interaktif SQL sorgularına güvenir. Structured data processing işleminde kullanılır. [Structured data' lardan bir şeyler çıkarma sanırım.] DataFrames olarak adlandırılan bir soyutlama sağlar(?). Ayrıca dağıtık SQL sorgu motoru olarak da davranabilir [Sanırım üzerinde SQL sorguları yaparak veri çekebiliriz diyor]. Değiştirilmemiş Hadoop Hive sorgularının mevcut dağıtımlarda ve verilerde 100 kata daha kadar hızlı çalışmasını sağlar(?). Spark SQL, aynı zamanda Spark ekosisteminin geri kalanıyla güçlü bir entegrasyon sağlar. (Örneğin: SQL sorgu işleminin makine öğrenmesiyle entegre edilmesi)

__Streaming__: Birçok uygulama sadece batch verileri değil, aynı zamanda gerçek zamanlı olarak akan yeni verileri işleme ve analiz etme yeteneğine de ihtiyaç duyar. Spark’in zirvesinde çalışan(?) Spark Streaming, Spark’ın kullanım kolaylığını ve hata tolerans özelliklerini birleştirirken, hem akan veriler hem de geçmiş veriler üzerinde güçlü etkileşimli ve analitik uygulamalar sağlar. HDFS, Flume, Kafka ve Twitter dahil olmak üzere çok çeşitli popüler veri kaynakları ile kolayca entegre olur. [Olay kısaca şu sanırım. Bazı kaynaklardan veriler geliyor. Bu modül o veriler üzerinden işlem yapabilmeyi sağlıyor.]

__MLlib(Machine Learning)__: Aksiyon almaya yarayan öngörüler(?) elde etmek için, makine öğrenmesi, büyük verinin işlenmesinde kritik bir aşama olarak ortaya çıkmıştır. Ölçeklenebilir makine öğrenmesi kütüphanesi olan MLLib, hem yüksek kalitede algoritmalar( başarıyı artırmak için birden fazla iterasyon yapan) sunar hem de hız( MapReduce’den 100 kat fazla). Kütüphane Java, Scala ve Python’da Spark uygulamalarının bir parçası olarak kullanılabilir.

__Grafik Hesaplama (GraphX)__: GraphX Spark’ın üzerinde bulunan grafik hesaplama motorudur. Kullanıcılara etkileşimli graf yapısında çıktı oluşturmasına olanak sağlar. [Pythondaki Scikit Learn gibi sanırım]
 

Spark' ın rakipleri Hadoop, Kafka, Apex, Cloudera.

Kaynak: https://medium.com/@amine.yesilyurt/apache-spark-nedir-sparka-giri%C5%9F-582d2e0059af

Hanımefendinin yazıklarına kendim anladığım şekilde bir şeyler ekledim.