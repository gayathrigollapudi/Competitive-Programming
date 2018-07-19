import random

d = {}


def shortLink(slug, destination):
    if (slug == None):
        slug = generateRandomSlug()
    else:
        if slug  in d:
            print( "slug already exists")
    d[slug] = destination


def generateRandomSlug():
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    numChars = 7
    while 1:
        result = ""

        for i in range(numChars):
            randomIndex = random.randrange(len(alphabet) - 1)
            result += alphabet[randomIndex]

        if result not in d:
            return result

shortLink(None, "www.gmail.com")

print(d)