#!/bin/sh

lines=0

sml=""
mdma=""
lrg=""

sizeSmall=10
sizeMedium=100

for x in `ls`
	
	do
	lines=`wc -l $x | cut -d " " -f1`

	if test $lines -lt $sizeSmall
	then  	
	sml="$sml $x"
    
    elif test $lines -lt $sizeMedium
    then
    mdma="$mdma $x"

	else 
	lrg="$lrg $x"
	fi	
	done

	echo "Small files:$sml"
	echo "Medium-sized files:$mdma"
	echo "Large files:$lrg"
exit 0