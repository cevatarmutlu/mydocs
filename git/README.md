# Git

<br />

## Git komutları hakkında ayrıntılı bilgi almak için
    git <command> --help

<br />

## Yerel Repolar üzerinde çalışma komutları

### init
Bu komutla belirli bir dizini boş bir git reposuna dönüştürüyoruz.

    git init

<br />

### add
Bu komut dosyaları ``Git Index`` diğer adıyla ``staging area`` bölgesine eklemizi sağlar. ``Staging area`` bölgesine ekleme yapmadan dosyalar repoya ``commit`` edilemez.

    git add <files>

<br />

### commit 
Local repodaki değişiklikleri kaydetmemizi sağlar. Her ``commit`` ' in uniqe bir ID' si bulunmaktadır. ``commit``' lere mesaj eklemek ``commit``' lerin bulunmasını kolaylaştırır.

    git commit -m "commit mesajı"

<br />

### branch
Local reponun üzerinde çalıştığı branch' ı gösteren komut.


    git branch <branch_name> # Branch oluşturur

    git brach -a # Bütün branch' leri listeler

    git bracnh -d <branch_name> # Bir branch' ı kaldırır

<br />

### checkout
Local repodaki çalışılan branch' i değiştirmeyi sağlayan kod.

Çalışılan branch' ı daha önce oluşturulmuş bir branch ile değiştirme: 

    git checkout <branch_name>

<br />

Yeni bir branch oluşturup çalıştığımız branch' ı oluşturulan branch ile değiştirme:

    git checkout -b <branch_name>

<br />

### merge
Bu komut var olan bir branch ile bir ya da daha fazla branch' ı birleştirmeye yarayan komut. Birden fazla branch adı yazarsanız bütün branch' leri birleştirir.

    git merge <branch_name>

<br />
<br />
<br />

## Remote repo komutları

### remote
Yerel bir repo ile uzak bir repoyu birbirine bağlayan komut. Uzak reponun url' ini hatırlama yerine url' e bir isim verebiliyoruz.

    git remote <komut> <remote_repo_adı> <remote_repo_url>

Başka alternatif komutlar:

    git remote -v # remote repoları göreüntüler

    git remote remove <name>

    git remote rename <old> <new>

    git remote get-url name

    git remote set-url <name> <newurl>

    git remote set-url --add <name> <newurl>

<br />

### pull
Remote repodaki değişiklikleri Local repoya ekler. Ekleme sırasında eğer üst üste binen kodlar varsa ne yapmasını gerektiğini sorar. En azından bende öyle yaptı.

    git pull <branch_name> <remote_name/remote_url>

<br />

### push
Remote repo üzerinden işlemler yapabilmemizi sağlar.

Remote repo' ya yazdıklarımızı push' lamak için:

    git push

    git push origin --delete <remote_branch_name>