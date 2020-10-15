## Bash
<br />

### Parametre alabilen kısayol ekleme
<br />

env generate => `virtualenv -p python3 path + name`

env active => `source viras/bin/activate`

env deactive => `deactivate`

> viras benim env' leri tuttuğum klasör

Belli işlemleri kısayol ile hızlıca açmak için araştırma yaparken. Aklıma 'nasıl yaptığım `alias`' a parametre verebilirim' diye bir şey geldi. İnternette araştırırken bir tane adam `alias` yerine bir tane `function` yazıp onu kullanabilirsin yazmış.

Benim `env` oluşturmak, aktif ve deaktif etmek için kullandığım fonksiyon (daha gelişmişleride bulunmakta):

```bash
#*****************************************************
# my alias
venv() {
	if [[ $1 == "-c" ]]; then # -c create
		virtualenv -p python3 "/home/cevat/Documents/evns/$2"
		source "/home/cevat/Documents/evns/$2/bin/activate"
	elif [[ $1 == "-a" ]]; then # -a active
		source "/home/cevat/Documents/evns/$2/bin/activate"
	elif [[ $1 == "-d" ]]; then # -d deactive
		deactivate
	elif [[ $1 == "-l" ]]; then # -l list
		l "/home/cevat/Documents/evns/"
		
	fi
}
# my alias end
# ***************************************************
```

Bu fonksiyonu `.bashrc` dosyasının içine yapıştırdıktan sonra aşağıdaki komutu çalıştırmamız gerekiyor ki yazdığımız fonksiyon' u kullanabilelim.

    source .bashrc 

> .bashrc dosyası home dizininde bulunan gizli bir dosya. Eğer dosyaların başında nokta varsa o gizli dosyadır.

Terminalde venv ile istediğim komutu kullanabiliyorum. 

Teşekkürler Linux :) (Büyük ihtimalle Windows' un kendisinde de vardır.)