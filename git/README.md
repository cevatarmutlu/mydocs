# Git

## Yerel Repolar üzerinde çalışma komutları

### ``git init``
    Bu komutla belirli bir dizini boş bir git reposuna dönüştürüyoruz.

### ``git add <file or directory>``
    Bu komut dosyaları ``Git Index`` diğer adıyla ``staging area`` bölgesine eklemizi sağlar. ``Staging area`` bölgesine ekleme yapmadan dosyalar repoya ``commit`` edilemez.

### ``git commit -m "commit mesajı"``
    Local repodaki değişiklikleri kaydetmemizi sağlar. Her ``commit`` ' in uniqe bir ID' si bulunmaktadır. ``commit`` ' lere mesaj eklemek ``commit`` ' lerin bulunmasını kolaylaştırır.

### ``git branch``
    Local reponun üzerinde çalıştığı branch' ı gösteren komut.

    branch oluşturmak için: ``git branch <branch_name>``

    remote ya da local branch' leri listelemek için: ``git brach -a``

    branch silmek için: ``git bracnh -d <branch_name>``