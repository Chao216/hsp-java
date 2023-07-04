def fibonacci(num):
	if num == 0 or num == 1:
		return 1
	else:
		return fibonacci(num-1) + fibonacci(num-2)

for i in range(100):
	print(fibonacci(i))