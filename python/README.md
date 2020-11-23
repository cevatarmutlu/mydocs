

## Numpy

## Numpy Shape, NDIM, AXIS
Benim aklımda tutma şeklimle `shape`, `ndim`, ve `axis` ne demek daha sonra unutursam diye not alıyorum.

`arr = [ [1, 2, 3], [4, 5, 6] ]` -> Bu diziyi temel alarak belli işlemleri açıklarsak.

`arr` dizisinin `ndim`' i `2` dir. Çünkü en dışta 1 tane köşeli parantez yani bir dizi vardır. Dıştaki köşeli parantezin içinde ise 2 tane aynı boyutlu yani eleman sayılı dizi vardır. İçteki dizilerin kaç tane olduğunun `ndim` açısından bir önemi yoktur. Bir dizi içinde 1 tane dizi bile olsa bu dizi 2 boyutludur(ndim) denir. `[[[1]]]` böyle bir dizinin `ndim`' i 3 tür. Çünkü iç içe 3 tane dizi vardır.

Dizilerin içinde kaç tane elemanın olduğu `shape`' i alakadar eder. Mesela `arr` dizisinin shape' i `(2, 3)`' dür. En dışta bir tane dizi vardır ve o dizi `axis 0` olarak geçer ve içinde 2 tane eleman vardır. Bu yüzden ilk indiste 2 yazar. axis 1 ise içteki dizi veya dizilerin kaç tane eleman barındırdığını söyler. `arr` dizisinde 3 yazar. Yani `shape`' e bakıncı `arr` dizisinin içinde 2 tane dizi elemanı varmış ve bu iki dizi elemanının içinde ise 3 tane eleman varmış olarak okuyorum ben.

`arr.sum(axis=0)` işlemi axis 0' daki bütün dizileri toplamaya yarar. En dıştaki dizi axis 0 olduğu için ve axis 0' ın içinde de 2 tane eleman olduğu için bu işlem o iki elemanı toplamaya yarar ve çıktı olarak bu işlem `[5, 7, 9]` çıktısını verir. Yani aslında bu işlem __en dıştaki dizinin içinde bulunan bütün dizileri element-wise (eleman bazlı)  olarak topla demektir__

`arr.sum(axis=1)` işlemi ise axis 1' deki elemanları toplamaya yarar. Mesela axis 1' de bulunan 2 diziden biri `[1, 2, 3]`' dür ve bu işlem bu dizideki bütün elemanları toplamaya yarar. Çıktı olarak bu işlem şöyle bir şey verir. `[ 6, 15 ]` -> __6 değeri 1+2+3, 15 değeri ise 4+5+6__

```python
import numpy as np
arr = np.array([[1, 2, 3], [4, 5, 6]])
print('shape: ', arr.shape, 'ndim: ', arr.ndim) # shape: (2, 3) ndim: 2

print('axis 0 sum: ', arr.sum(axis=0)) # [5, 7, 9]

print('axis 1 sum:', arr.sum(axis=1)) # [6, 15]
```

### Random sayi üretme:

```python
    import numpy as np
    low, high, size, dtype = (0, 10, (3, 5), int)
    arr = np.random.randint(low=low, high=high, size=size, dtype=dtype)
    print(arr)
```

### Numpy diziler üzerinden kısa işlem yapma.

```python
    seq = np.random.randint(0, 10, size=(10, 5))
    arr = np.zeros((len(seq), 15))
    for i, seq in enumerate(seq): # keşke daha önce bilseydim enumerate' i. Bir dizinin ilk index sayısını ikinci olarak değerini veriyor.
        arr[i, seq] = 1 # Bu işlem ile arr dizisinin i. satırında seq dizisindeki değerleri 1 yapıyor.
        # Mesela seq = [0, 1, 2] olsun. arr dizisinin i. satırının 0, 1, 2. satırlarını 1 yapıyor
    print(arr)
```

### Seed

```python
import numpy as np
np.random.seed(42) # random sayı üretmek için bir değer kullanılıyor ve buna
# seed deniyor. Bu değere belli bir şey atıyorsun sanırım. Çünkü her çalıştırmada aynı netice çıkıyor
# aşağıdaki değerlerden

print(np.random.randint(12))
print(np.random.randint(12))
print(np.random.randint(12))
```

## String Formatting

```python
var = "merhaba"
print(f"{var}")
print(f"{var:50} nasılsın") # 50 birimlik yere basıyor @var değişkenini. Eğer @var değeri 50 birim değilse değişkeni
# en soldan itibaren basıp kalan kısmı boş bırakıyor.
```
<br />
<br />

Eğer ekrana basacağın şeylerin uzunluğu sabit değilse ve sen hepsinin aynı hızda olmasını istiyorsan aşağıdaki gibi yapabilirsin.

```python
arr = ['merhaba', 'ali', 'nasılsın', 'çok uzun bir yazı yazmak istiyorum'] # 

# Bu for' da "@i Deneme" şeklinde basıcak
for i in arr:
    print(f"{i} Deneme")


# Bu for' da ise Mesela
# ali     Deneme
# veli    Deneme
# Ayşe    Deneme
# şeklinde basacaktır.
for i in arr:
    print(f"{i:{len(max(arr))}} Deneme") # {len(max(arr))} böyle bir kullanım ile bir işlemden yapıp değer belirliyebiliyoruz
```
<br/>
<br/>

Numpy Dizilerinde yapılan şeyler

```python
print("ah" * 3) # buda ilginç
```

<br/>
<br/>

Terminal ekranında bir toolbar oluşturyor aşağıdaki kod parçası. [====     ] şekinde. Mesela bir şeyi indirirken ne kadar indirdiğine bakabilirsin.

```python
import time

for i in range(20):
    sys.stdout.write(f'\r[{"=" * i}{" " * (20 - i)}]')
    time.sleep(0.5)
    sys.stdout.flush()
sys.stdout.write("\n")
```

## Kullanışlı bir if

```python
den = 1 if 0 == 0 else 4 
print(den) # Şart sağlanırsa 1 sağlanmazsa 4

# Yukarıdaki gibi if ifadesini fonksiyonlara bile verebiliyorsun.
def dene(var, var2):
    print(var)
    print(var2)

dene(var="merhaba" if 0 == 1 else "deneme tamamlandı", var2="merhaba" if 0 == 0 else "deneme tamamlandı")
```

<br/>
<br/>

## Dictionary

get ile dict' ten eleman çekme. Neden kullanmalıyım. Olmayan elemanda `None` döndürüyor.

```python
deneme = {
    "a": 1,
    "b": 2
}

print(deneme["a"], deneme.get("a"), deneme.get("c")) 
```