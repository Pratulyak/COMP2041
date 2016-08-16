#!/bin/sh

a=$1
b=0
re='^[0-9]+$'
if test $# -eq 2
then
	if  [[ $1 =~ $re ]] ;
	then
		while [ "$b" -lt "$a" ] 

	do
		echo $2
		let "b++"
	done
	exit 0
	else 
	echo "./echon.sh: argument 1 must be a non-negative integer"
	fi	
else 
	echo "Usage: ./echon.sh <number of lines> <string>"
	exit 2
fi
