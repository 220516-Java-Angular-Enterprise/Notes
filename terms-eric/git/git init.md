The `git init` command creates a new Git repository.

Executing `git init` creates a `.git` subdirectory in the current working directory, which contains all of the necessary Git metadata for the new repository.

his metadata includes subdirectories for objects, refs, and template files. A `HEAD` file is also created which points to the currently checked out commit.

```
git init
```

Transform the current directory into a Git repository. This adds a `.git` subdirectory to the current directory and makes it possible to start recording revisions of the project.

```
git init <directory>
```

Create an empty Git repository in the specified directory. Running this command will create a new subdirectory called containing nothing but the `.git` subdirectory.

If you've already run `git init` on a project directory and it contains a `.git` subdirectory, you can safely run `git init` again on the same project directory. It will not override an existing `.git` configuration.


### git init vs. git clone

A quick note: `git init` and `git clone` can be easily confused. At a high level, they can both be used to "initialize a new git repository." However, `git clone` is dependent on `git init`. `git clone` is used to create a copy of an existing repository. Internally, `git clone` first calls `git init` to create a new repository. It then copies the data from the existing repository, and checks out a new set of working files.


### Bare repositories --- git init --bare

```
git init --bare <directory>
```

Create a repository that you cannot commit to

This is primary used to create a central repository to pull from.

## Configuration

All configurations of `git init` take a  argument. If you provide the , the command is run inside it. If this directory does not exist, it will be created. In addition to the options and configuration already discussed, `Git init` has a few other command line options. A full list of them follows:

`-Q`

`--QUIET`

Only prints "critical level" messages, Errors, and Warnings. All other output is silenced.

`--BARE`

Creates a bare repository. (See the "Bare Repositories" section above.)

`--TEMPLATE=`

Specifies the directory from which templates will be used. (See the "Git Init Templates" section above.)

`--SEPARATE-GIT-DIR=`

Creates a text file containing the path to . This file acts as a link to the `.git` directory. This is useful if you would like to store your `.git` directory on a separate location or drive from your project's working files. Some common use cases for `--separate-git-dir` are:

-   To keep your system configuration "dotfiles" (`.bashrc, .vimrc`, etc.) in the home directory while keeping the `.git` folder elsewhere
-   Your Git history has grown very large in disk size and you need to move it elsewhere to a separate high-capacity drive
-   You want to have a Git project in a publicly accessible directory like `` `www:root` ``  
     

You can call `git init --separate-git-dir` on an existing repository and the `.git dir` will be moved to the specified  path.

`--SHARED[=(FALSE|TRUE|UMASK|GROUP|ALL|WORLD|EVERYBODY|0XXX)]` 

Set access permissions for the new repository. This specifies which users and groups using Unix-level permissions are allowed to push/pull to the repository.

## Examples

### Create a new git repository for an existing code base

```
cd /path/to/code \ git init \ git add . \ git commit
```

### Create a new bare repository

```
git init --bare /path/to/repo.git
```

### Create a git init template and initialize a new git repository from the template

```
mkdir -p /path/to/template \ echo "Hello World" >> /absolute/path/to/template/README \git init /new/repo/path --template=/absolute/path/to/template \ cd /new/repo/path \ cat /new/repo/path/README
```