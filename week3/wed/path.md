# Unix/Linux: Relative and Absolute Paths

## Absolute Path
An **absolute path** is defined as specifying the location of a file 
or directory from the root directory(`/`). In other words,we can say 
that an **absolute path** is a complete path from start of actual 
file system from `/` directory.

## Relative Path
**Relative path** is defined as the path related to the present 
working directly(`pwd`). It starts at your current directory and 
never starts with a `/`.

## Using `.` and `..` in Relative Path-names

UNIX offers a shortcut in the relative pathname that uses either 
the current or parent directory as reference and specifies the path 
relative to it. A relative path-name uses one of these cryptic symbols:


* `.`(**a single dot**) - this represents the current directory.
* `..`(**two dots**) - this represents the parent directory.
