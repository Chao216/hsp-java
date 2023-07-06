def sum(start,end):
	if start == end:
		return end
	else:
		return end + sum(start, end-1)
		