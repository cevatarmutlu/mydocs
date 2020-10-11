# Git

## Git komutları hakkında yardım alma komutu
``sdfsdf sdfsfd sdfsdf ``

    git <command> --help

## Yerel Repolar üzerinde çalışma komutları

### <span style="color: pink"> INIT </span>
Bu komutla belirli bir dizini boş bir git reposuna dönüştürüyoruz.

    git init

### ``git add <file or directory>``
Bu komut dosyaları ``Git Index`` diğer adıyla ``staging area`` bölgesine eklemizi sağlar. ``Staging area`` bölgesine ekleme yapmadan dosyalar repoya ``commit`` edilemez.

### ``git commit -m "commit mesajı"``
Local repodaki değişiklikleri kaydetmemizi sağlar. Her ``commit`` ' in uniqe bir ID' si bulunmaktadır. ``commit`` ' lere mesaj eklemek ``commit`` ' lerin bulunmasını kolaylaştırır.

### ``git branch``
Local reponun üzerinde çalıştığı branch' ı gösteren komut.

branch oluşturmak için: ``git branch <branch_name>``

remote ya da local branch' leri listelemek için: ``git brach -a``

branch silmek için: ``git bracnh -d <branch_name>``

### ``git checkout``
Local repodaki çalışılan branch' in değişmesini sağlayan kod.

Çalışılan branch' ı daha önce oluşturulmuş bir branch ile değiştirme: ``git checkout <branch_name>``

``git checkout -b <branch_name>`` : Bu komut ile yeni bir branch oluşturup çalıştığımız branch' ı oluşturulan branch ile değiştirmiş oluyoruz.

### ``git merge <branch_name>``
Bu komut var olan bir branch ile bir ya da daha fazla branch' ı birleştirmeye yarayan komut. Birden fazla branch adı yazarsanır bütün branch' leri birleştirir.

## Remote repo komutları

### ``git remote <komut> <remote repo adı> <remote repo url>``
Yerel bir repo ile uzak bir repoyu birbirine bağlayan komut. Uzak reponun url' ini hatırlama yerine ``remote repo adı`` ile url' e bir isim veriyoruz.

Remote repoları listemek: ``git remote -v``

Başka alternetif komutlar : 

    git remote remove <name>
    git remote rename <old> <new>
    git remote get-url name
    git remote set-url <name> <newurl>
    git remote set-url --add <name> <newurl>

### ``git pull <branch_name> <remote_name/remote_url>``
Remote repodaki değişiklikleri Local repoya ekler.


### push
    git push origin --delete <remote_branch_name>