## Spring Framework
Java uygulamalarını kolay ve pratik bir şekilde geliştirmeye yarayan bir Framework' tür.

Java EE(Enterprise Edition)' in ilk çıktığı zamanlarda kullanımının zor olmasından ötürü ortaya çıkmıştır.

Başlangıçta Dependency Injecktion (bağımlılık enjoksiyonu) gibi problemlere çözüm getiren Framework günümüzde bir çok alt kütüphaneden oluşmaktadır: Spring MVC, Spring Security, Spring Data vb.

### docker
mongo-docker repo: https://hub.docker.com/_/mongo
Docker üzerinden mongoDB çalıştırıp onu veritabanı olarak kullanıldığı bir proje.
docker' da bir image nasıl ayağı kalkıyor. Mongo' nun ayağa kalmaksı

    docker run --name some-mongo -d mongo:latest

``run`` komutu ile image çalıştırıyoruz.

``--name`` ile image' e isim veriyoruz.

``-d`` ile ile arka planda çalışmasını sağlıyoruz.

``mongo:latest`` ile mongo' nun en son sürümünü belirtiyoruz.

Spring projemizde ``resources`` klasörünün altına ``docker-compose.yaml`` dosyası sayesinde belli başlı configürasyonlar yapabilmemeizi sağlıyor.

compose dosyasını çalıştırmak için:

    docker-compose -f compose_dosya_yolu up -d

``docker-compose`` ile compose dosyası ayağı kaldırıyorlar. docker-compose ben de yokmuş kurmak için ``sudo apt install docker-compose``

``-f`` ile bir file olduğu belli ediliyor ve dosya yolu veriliyor.

``up`` ile ayağa kaldırılıyor.

``-d`` ile arka planda çalışması sağlanıyor.

``docker ps`` komutu ile çalışan image' ler görebiliyoruz.

``docker stop`` ile belirli çalışan imageleri duruduruyoruz.

``docker stop $(docker ps -qa)`` ile çalışan bütün image' leri durduruyoruz.

# mongodb db oluşturma
https://stackoverflow.com/questions/42912755/how-to-create-a-db-for-mongodb-container-on-start-up
ya da robo3

### Mongoya bağlantı sağlamak için resources klasörünün içindeki application.properties içine
bir şeyler yazdı. Mongodb içinde bir tanede db oluşturdu.