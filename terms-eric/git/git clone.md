is a Git command line utility which is used to target an existing repository and create a clone, or copy of the target repository.

If a project has already been set up in a central repository, the `git clone` command is the most common way for users to obtain a development copy. Like `git init`, cloning is generally a one-time operation. Once a developer has obtained a working copy, all version control operations and collaborations are managed through their local repository.

Git’s collaboration model is based on repository-to-repository interaction. Instead of checking a working copy into SVN’s central repository, you [push](https://www.atlassian.com/git/tutorials/syncing/git-push) or [pull](https://www.atlassian.com/git/tutorials/syncing/git-pull) commits from one repository to another.

`git clone` is primarily used to point to an existing repo and make a clone or copy of that repo at in a new directory, at another location.

As a convenience, cloning automatically creates a remote connection called "origin" pointing back to the original repository.

This makes it very easy to interact with a central repository. This automatic connection is established by creating Git refs to the remote branch heads under `refs/remotes/origin` and by initializing `remote.origin.url` and `remote.origin.fetch` configuration variables.


## Configuration options

### git clone -branch

The `-branch` argument lets you specify a specific branch to clone instead of the branch the remote `HEAD` is pointing to, usually the main branch. In addition you can pass a tag instead of branch for the same effect.

```
git clone -branch new_feature git://remoterepository.git
```

This above example would clone only the `new_feature` branch from the remote Git repository. This is purely a convenience utility to save you time from downloading the `HEAD` ref of the repository and then having to additionally fetch the ref you need.

### git clone -mirror vs. git clone -bare

#### git clone --bare

Similar to `git init --bare,` when the `-bare` argument is passed to `git clone,` a copy of the remote repository will be made with an omitted working directory. This means that a repository will be set up with the history of the project that can be pushed and pulled from, but cannot be edited directly. In addition, no remote branches for the repo will be configured with the `-bare` repository. Like `git init --bare,` this is used to create a hosted repository that developers will not edit directly.

#### git clone --mirror

Passing the `--mirror` argument implicitly passes the `--bare` argument as well. This means the behavior of `--bare` is inherited by `--mirror`. Resulting in a bare repo with no editable working files. In addition, `--mirror` will clone all the extended refs of the remote repository, and maintain remote branch tracking configuration. You can then run `git remote` update on the mirror and it will overwrite all refs from the origin repo. Giving you exact 'mirrored' functionality.

### Other configuration options

For a comprehensive list of other git clone options visit the [official Git documentation](https://git-scm.com/docs/git-clone). In this document, we'll touch on some other common options.

#### git clone --template

```
git clone --template=<template_directory> <repo location>
```

Clones the repo at `＜repo location＞` and applies the template from `＜template directory＞` to the newly created local branch. A thorough refrence on Git templates can be found on our [git init page](https://www.atlassian.com/git/tutorials/setting-up-a-repository/git-init).  
 

## Git URLs

Git has its own URL syntax which is used to pass remote repository locations to Git commands. Because `git clone` is most commonly used on remote repositories we will examine Git URL syntax here.  
 

### Git URL protocols

**-SSH**

Secure Shell (SSH) is a ubiquitous authenticated network protocol that is commonly configured by default on most servers. Because SSH is an authenticated protocol, you'll need to establish credentials with the hosting server before connecting. `ssh://[user@]host.xz[:port]/path/to/repo.git/`  
 

**- GIT**  
 

A protocol unique to git. Git comes with a daemon that runs on port (9418). The protocol is similar to SSH however it has NO AUTHENTICATION. `git://host.xz[:port]/path/to/repo.git/`  
 

**- HTTP**  
 

Hyper text transfer protocol. The protocol of the web, most commonly used for transferring web page HTML data over the Internet. Git can be configured to communicate over HTTP `http[s]://host.xz[:port]/path/to/repo.git/`  
 

## Summary

In this document we took a deep look at `git clone`. The most important takeaways are:  
  
1. `git clone` is used to create a copy of a target repo

2. The target repo can be local or remote

3. Git supports a few network protocols to connect to remote repos

4. There are many different configuration options available that change the content of the clone  
 

For further, deeper reference on `git clone` functionality, consult the [official Git documentation](https://git-scm.com/docs/git-clone). We also cover practical examples of git clone in our [setting up a repository guide](https://www.atlassian.com/git/tutorials/setting-up-a-repository).