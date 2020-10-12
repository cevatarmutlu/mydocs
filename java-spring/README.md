## Spring Framework
Java uygulamalarını kolay ve pratik bir şekilde geliştirmeye yarayan bir Framework' tür.

Java EE(Enterprise Edition)' in ilk çıktığı zamanlarda kullanımının zor olmasından ötürü ortaya çıkmıştır.

Başlangıçta Dependency Injecktion (bağımlılık enjoksiyonu) gibi problemlere çözüm getiren Framework günümüzde bir çok alt kütüphaneden oluşmaktadır: Spring MVC, Spring Security, Spring Data vb.

### docker
Docker üzerinden mongoDB çalıştırıp onu veritabanı olarak kullanmak için: https://hub.docker.com/_/mongo

`Linux` ile `docker` komutlarını terminal üzerinden yazdığımda `sudo` ifadesi ile çalıştırmam gerekiyor yoksa izin hatası veriyor. `sudo` ifadesi kullanmadan da `docker`' ı kullanbilmenin yolu varmış ama bazı düzenlemeler gerekiyor sanırım.

> Peki neden docker üzerinden mongodb kullanmalıyım? <br/>
> Çünkü mongodb' yi bilgisayarına kurmakla uğraşmıyorsun.

`Docker`' da bir image nasıl ayağı kalkıyor. Mongo' nun ayağa kalmak

    sudo docker run --name some-mongo -d mongo:latest

`run` komutu ile `Docker image`' i çalıştırıyoruz.

`--name` ile image' e isim veriyoruz.

`-d` ile ile arka planda çalışmasını sağlıyoruz.

`mongo:latest` ile `mongo`' nun en son sürümünü kullanmak istediğimizi belirtiyoruz.

Spring projemizde `resources` klasörünün altına `docker-compose.yaml` dosyası belli başlı configürasyonlar yapabilmemeizi sağlıyor.

`compose` dosyasını çalıştırmak için:

    sudo docker-compose -f compose_dosya_yolu up -d

`docker-compose` ile `compose` dosyası ayağı kaldırılıyor. 

`docker-compose`' u linux bilgisayarlara kurmak için: `sudo apt install docker-compose`

`-f` ile bir file olduğu belli ediliyor ve dosya yolu veriliyor.

`up` ile ayağa kaldırılıyor.

`-d` ile arka planda çalışması sağlanıyor.

`sudo docker ps` komutu ile çalışan image' ler görebiliyoruz.

`sudo docker stop` ile belirli çalışan imageleri duruduruyoruz.

`sudo docker stop $(docker ps -qa)` ile çalışan bütün image' leri durduruyoruz.

# Docker' da çalışan mongodb' de database oluşturma
Tahmin ettiğim kadarıyla docker üzerinden bir sistemi çalıştırmak demek docker' ın bir tane ortam hazırlayıp çalıştırdığın yapıyı o ortamın belli bir portundan kullanıcının bilgisayarına aktarmak. Bu sebeble doğrudan mongodb' ye erişemiyorsun sanırım. Mongodb üzerinde belli başla işlemler yapmak için ya bir program ya da compose dosyası üzerinden bir şeyler yapabilirsin.

Program: `robo3`

Compose dosyası ile: https://stackoverflow.com/questions/42912755/how-to-create-a-db-for-mongodb-container-on-start-up
ya da robo3


### Mongoya bağlantı sağlamak için resources klasörünün içindeki application.properties içine bir şeyler yazdı

Böyle bir şey yapmasının sebebi sisteme, bu sistem dışarıya bağlanıcak hatta mongodb' ye bağlanıcak diye kodlarla belirtmişti ve spring' in bağlanacağı database' i ve bu database' e hangi port üzerinden bağlanacağını bu dosyasının içinden belirtiyoruz.