# Introduction to Git

## GIT

Git is a version control system used for tracking changes in computer files. It is generally used for source code
management in software development.

- Git is used to tracking changes in the source code
- The distributed version control tool is used for source code management
- It allows multiple developers to work together
- It supports non-linear development through its thousands of parallel branches

## Features of Git

Features of Git

- Tracks history
- Free and open source
- Supports non-linear development
- Creates backups
- Scalable
- Supports collaboration
- Branching is easier
- Distributed development

<img src="https://www.simplilearn.com/ice9/free_resources_article_thumb/business-org.JPG">

## Branch

In Git, a branch is a pointer to a specific commit. The branch pointer moves along with each new commit you make, and
only diverges in the graph if a commit is made on a common ancestor commit. There are various commands you can take in
Git to work with your branches.

<img src="https://www.simplilearn.com/ice9/free_resources_article_thumb/small-feature.JPG">

The diagram above visualizes a repository with two isolated lines of development, one for a little feature, and one for
a longer-running feature. By developing them in branches, it’s not only possible to work on both of them in parallel,
but it also keeps the main branch free from questionable code.

## Main Commands For GIT

### Cloning GitHub Repository

- `git clone <url>`

### Pushing To GitHub Repository

The git status command displays the state of the working directory and the staging area. It lets you see which changes
have been staged, which haven't, and which files aren't being tracked by Git.

- `git status`

git add to stage the file

- `git add -A`

git commit takes everything from the staging area and makes a permanent snapshot of the current state of your repository
that is associated with a unique identifier.

- `git commit -m "YOUR MESSAGE"`

The git push command is used to upload local repository content to a remote repository.

- `git push origin <branch name>`

### Pulling From GitHub Repository

The git pull command is used to fetch and download content from a remote repository and immediately update the local repository to match that content.

- `git pull <url>`

### Creating a Branch

To know what branch you are currently in

- `git branch`

To create a branch

- `git checkout -b <branch name>`

To switch between branches

- `git checkout <existing branch name>`
