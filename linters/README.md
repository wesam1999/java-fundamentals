# linter
## describe the behavior of the linter
**craete a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.**
## explain what users should expect to see when it runs :
Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.<br />
1. Don’t show an error if the line is empty.<br />
2. Don’t show an error if the line ends with an opening curly brace {<br />
3. Don’t show an error if the line ends with an closing curly brace }<br />
4. Don’t show an error if the line contains if or else<br />