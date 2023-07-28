import math
thirdLine = lambda x,y: math.sqrt((x**2+y**2))
print(thirdLine(3,4))

list1 = map(lambda x: x**2,range(1,101))
for i in list1:
	print(i)