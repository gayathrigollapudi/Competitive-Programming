def binarygap(n):
    z = "{0:b}".format(n)
    # print(z)
    k = [i for i, e in enumerate(list(z)) if e == "1"]
    m = 0

    for i in range(len(k)-1):
        if (k[i+1] - k[i]) >0:
            if m < k[i+1] - k[i]:
                m = k[i+1] - k[i]
    return m


print(binary_gap(0))
print(binary_gap(55))
print(binary_gap(-5))
print(binary_gap(12354))
print(binary_gap(6))
print(binary_gap(256))