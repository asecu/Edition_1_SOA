Consider a text file with a list of words (1 word per line) (attached).

Using Input/Output streams, create a method that, given a word on input, will count how many times that word appears in that file. Write the result in another file named "results.txt" in following format:
"word" was found [number] times.

- Task to be done with java.io classes
- Bonus: same task with java.nio classes

// to count
- int countWordInFile(String word, File file)

// to write
- void writeToFile(File file, String text)

Bonus: extract results as a Map<String, Long>, where key is the given word and values are the numbers of the line where word was found and write the results in the following format:
"word" was found [number] times on lines: lineNumber, lineNumber, ... lineNumber 

Example:    
    Input file contents:
- Word1
- Word2
- Word1
- Word2
- Word1
- Word3
- Word1
- Word2
  
Output file contents: "Word1" was found 4 times

To check your task, you may use the following words, or any words you like:
- abstracted – 1 occurrence
- wrapper – 1 occurrence
- shelve – 3 occurrences
- lime – 0 occurrences, but 11 other words contain it (example: complimented), these words should not be included in your results