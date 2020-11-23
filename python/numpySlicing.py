import numpy as np

arr = np.array([1, 2, 3])

#slicing işlemlerinde sondaki dahil değildir.

print('arr: ', arr, '| type(arr): ', type(arr), '| arr.shape: ', arr.shape, '| arr.ndim: ', arr.ndim)

temp = arr[0]
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)

temp = arr[0:1] # Bu işleme slicing denir ve hep dizi döner
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)
print(np.squeeze(temp)) # return 1. slicing' in verdiği dizi durumundan kurtarıyor

arr = np.array([
  [0, 1, 2],
  [3, 4, 5]
])
print('arr: ', arr, '| type(arr): ', type(arr), '| arr.shape: ', arr.shape, '| arr.ndim: ', arr.ndim)

temp = arr[0:1]
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)
print(np.squeeze(temp))

temp = arr[:, 0]
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)
print(np.squeeze(temp))

temp = arr[:, 0:1] # dizi içinde dizi olursa her diziyi satır olarak görüyor
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)
print(np.squeeze(temp))

arr = np.array([
  [
    [0, 1, 2],
    [3, 4, 5]
  ],
  [
    [4, 7, 8],
    [9, 10, 11]
  ]
])
print('arr: ', arr, '| type(arr): ', type(arr), '| arr.shape: ', arr.shape, '| arr.ndim: ', arr.ndim)

temp = arr[0:1]
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)
print(np.squeeze(temp))

temp = arr[:, 0]
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)
print(np.squeeze(temp))

temp = arr[:, 0:1] # dizi içinde dizi olursa her diziyi satır olarak görüyor
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)
print(np.squeeze(temp))

temp = arr[:, :, 0:1]
print('temp: ', temp, '| type(temp): ', type(temp), '| temp.shape: ', temp.shape, '| temp.ndim: ', temp.ndim)
print(np.squeeze(temp))