import time
def func_1(n=0, s=""):
    one = list(("", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ","Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "))
    ten = list(("", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "))
    str = ""
    if n > 19:
        str += ten[int(n / 10)] + one[int(n % 10)]
    else:
        str += one[int(n)]
    if int(n) != 0:
        str += s
    return str
def func_2(n):
    out = ""
    out += func_1(int((n / 10000000)), "Crore ")
    out += func_1(int((n / 100000) % 100), "Lakh ")
    out += func_1(int((n / 1000) % 100), "Thousand ")
    out += func_1(int((n / 100) % 10), "Hundred ")
    if n > 100 and (n % 100) > 0:
        out += "and "
    out += func_1(int(n % 100), "")
    return out + "Rupees Only"
n = int(input("Enter num: "))
if(n>999999999):
    print("Error!!!")
elif(n == 0):
    print("Zero Rupees Only")
elif(n < 0):
    print("Error!!!")
else:
    print(func_2(n))
time.sleep(10)
