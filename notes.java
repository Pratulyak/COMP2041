/*
Notes for 2041 in java for formatting kek
 */


-l = Long in bash;

//what is a file: Array of bytes. 0 or more bytes in a sequence
//

< = take the input from that file

> = redirect the output to a file

| = pipe symbol, standard output o a goes into b a|b

strace = run this program and tell me what requests its making to the OS

andrew is obsessed with cat

egrep = passes by default only some lines through. By default it is case sensitive;

cat: the simmplest filter

the cat command copies its input to output unchanged.

Cat filters:
  -n nummber output lines(starting from 1)
  -s squeeze consecutive blank lines into single blank lines
  -v display control-charactersin visible form(eg. ^c or ctrl c);
  tac command copies files, but reverses the order of lines;
/************************/
wc: word counter
  -c countrs the number of characters in
  -w counts the number of words(non white spaces)
  -
/************************/
tr: transliterate characters

  the tr command coverts the text char-bychar according to a mapping;
  eg of tr:
  tr a-z to A-Z <- allows to convert say lowercase to uppercase "-" specifies range
  tr a-z to A-Z < filename.text
  -c -s -d
/************************/
head/tail : select lines
  head- first n(10 by default) lines of file
  tail- last n()lines of file
  tail -n 100 allows to select the number of lines to see.
  ^ can be shortened to tail -100 etc.
/************************/
egrep: select lines matching a pattern
  -i ignore upper lower case
  -v only display lines that do not match the apttern
  -w only match pattern if it makes a complete word
/************************/
regex: regular expressions
 -defines a set of expressions, ussually thought of as a pattern





/************************/
cut: vertical slice
  -can select parts of lines
  -
