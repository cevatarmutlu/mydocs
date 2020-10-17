

## Numpy

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

### String Formatting

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