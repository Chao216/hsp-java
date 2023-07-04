#!/usr/bin/env python3
def a():
	print("a() is being called!")
	b()
	print("a() is returning!")

def b():
	print("b() is being called!")
	c()
	print("b() is returning!")

def c():
	print("c() is being called!")
	print("c() is returning!")

a()