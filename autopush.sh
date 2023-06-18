#!/bin/bash

time=`date`

git add *
git commit -m "this is a normal regular commit $time"
git push origin main

echo "$time"