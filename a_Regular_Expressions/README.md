# Regular Expression
- If you want to represent a group of Strings according to a particular pattern
then you should go for Regular expression

Example - I want to represent all mobile numbers,
every mobile no. contains 10 digit, compulsory first chracter should contains 7 to 9

- write regular expression to represent mobile numbers
- write regular expression to represent every mail Id

*** Pattern Class

- A Pattern object represents "compiled version of Regular Expression"
- We can create a pattern object by using compile() method of Pattern class

````java
public static Pattern compile(String regEx);

Pattern p = Pattern.compile("ab");
```` 
*** Matcher Class

- A Matcher object can be used to match character sequences against a Regular Expression.
- We can create a Matcher object by using matcher() method of Pattern class

````java
public Matcher matcher(String target);
Matcher m = p.matcher("abbbabbaba");
````

Important methods of Matcher class:

1. boolean find();
- It attempts to find next match and returns true if it is available otherwise returns false

2. int start()
- Returns the start index of the match

3. int end()
- Returns the offset(equalize) after the last character matched

4. String group()
- Returns the matched pattern

# Character Classes

1. [abc] -> Either 'a' or 'b' or 'c'
2. [^abc] -> Except 'a', 'b' and 'c'
3. [a-z] -> Any lowercase alphabet symbol
4. [A-Z] -> Any uppercase alphabet symbol
5. [a-zA-Z] -> Any alphabet symbol
6. [0-9] -> Any digit from 0 to 9
7. [a-zA-Z0-9] -> Any alphanumeric character
8. [^a-zA-Z0-9] -> Any special character

# Predefined character class

1. \s -> Space character
2. \d -> any digit from 0 to 9
3. \w -> any word character[a-zA-Z0-9]
4. . -> any character including special characters.

5. \S -> any character except space character
6. \D -> any character except digit
7. \W -> any character except word character(Special character)


















