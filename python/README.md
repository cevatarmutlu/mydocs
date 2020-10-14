

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