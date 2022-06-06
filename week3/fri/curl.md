# Use `curl` to interact with an API

`curl` is commonly referred to as a non-interactive web browser for the Linux terminal. 
Its developers, however, describe it more accurately as a tool to transfer data to 
or from a server, with access to a huge variety of protocols, including `HTTP`, `FTP`, 
`SFTP`, `SCP`, `IMAP`, `POP3`, `LDAP`, `SMB`, `SMTP`, and many more.

It's a useful tool for the average sysadmin, whether you use it as a quick way to 
download a file you need from the Internet, or to script automated updates. `curl` is 
also an important tool for testing remote APIs. If a service you rely on or provide 
is unresponsive, you can use the curl command to test it.

## Installing `curl`
It's quite likely that you already have `curl` installed. If you don't have it 
installed, it's probably in your software repository.

On Fedora, CentOS, or RHEL, enter:

`$ sudo dnf install curl`

## `curl` Basics
You can download a file with `curl` by providing a link to a specific URL. Whatever 
exists at the URL you provide is, by default, downloaded and printed in your 
terminal. `HTML` is relatively verbose, so that's often a lot of text.

You can pipe the output to `less` or `tail` or any other command you find useful.

```
$ curl "http://example.com" | tail -n 4
    <h1>Example Domain</h1>
    <p>This domain is for use in illustrative examples in documents. You may use this domain in literature without prior coordination or asking for permission.</p>
    <p><a href="https://www.iana.org/domains/example">More information...</a></p>
</div></body></html>
```

Some URLs contain special characters that your shell interprets as part of a 
command. To avoid unexpected behavior, surround your URL with quotation marks.

Sometimes, you don't want to read a file in your terminal. Use the `--remote-name` 
option to save a file according to what it's called on the server:

```
$ curl --remote-name "https://example.com/linux-distro.iso"
[...]
$ ls 
linux-distro.iso
```

Alternatively, use the `--output` option to rename your downloaded file:

`curl "http://example.com/index.html" --output example-index.html`

## Get `HTML` Headers

`HTTP` headers are components of the initial data sent over `HTTP`. Headers often contain 
important information, including the server response code (such as 200, 301, 404, 
and so on), but are not visible through everyday web interactions.

You can see it all with `curl`:

```
$ curl --head --show-error "https://example.com"
HTTP/2 200 
accept-ranges: bytes
age: 485487
cache-control: max-age=604800
content-type: text/html; charset=UTF-8
date: Sun, 26 Apr 2020 09:02:09 GMT
etag: "3147526947"
expires: Sun, 03 May 2020 09:02:09 GMT
last-modified: Thu, 17 Oct 2019 07:18:26 GMT
server: ECS (sjc/4E76)
x-cache: HIT
content-length: 1256
```

If you need faster response times, you can use `--fail-early` to cause `curl` to fail 
instead of spending cycles trying to resolve unresponsive servers.

## Query an API endpoint

A query to an API endpoint is technically as simple as the most basic `curl` command. 
You point `curl` at the API gateway URL, and ideally, get the default response from 
the API. Not all APIs provide a response, but here's a good example:

`$ curl "https://gitlab.com/api/v4/projects" | less`

This query fetches a `JSON` data dump of a list of recent projects on `Gitlab.com`, 
which you can pipe through `less` or `jq` or some other pager or parser.

## Send form data (emulates a form and submit button)

You can also send commands with curl. For example, for an API behind a login 
screen, you can use the `--form` option to pass your credentials before accessing 
the data you need. This example isn't advisable, because your password would 
appear in your Bash history. However, you can configure your shell history to 
ignore commands preceded by a space to safeguard against this (as long as you do 
indeed precede the command with a blank space).

`$  curl --form "username=seth" --form "password=12345678" "https://example.com/api/v4/endpoint"`

## Send contents of a file as form data

Another way to pass authorization is with `curl`'s special `<` notation, which takes 
data from inside an existing file that you have access to:

`$ curl --form "description=<auth.txt" "https://example.com/api/v4/endpoint"`
## Send a file as form data

If you need to send a file as data rather than read from a file, use the `@` 
notation instead:

`$ curl --form "avatar=@me.jpg" "https://example.com/api/v4/endpoint"`
## Send a file

You can also just send binary data using the `--data` flag:

`$ curl --data "Some data" "https://example.com/api/v4/endpoint"`
## Specify HTTP method

If an API responds to specific types of `HTTP` requests, you can specify how 
you send your data with the `--request` option:

`$ curl --request POST --data "Foo: bar" "https://example.com/api/endpoint"`
## Send HTTP header

More often than not, an API doesn't require a username and password for everyday 
use and instead provides you with an authorization token. In that case, you are 
to identify your token when sending requests, but because there's no `HTML` frontend 
to your interaction, you must do so without `HTML` forms. Often, an API looks for 
authorization as part of the header data of what you send:

`$ curl --header "Authorization: Bearer F66eE5faXEp2Y" \
"https://example.com/api/v4/endpoint"`
## Make an API call to a service

Because web API interactions are often structured as URLs, you can send complex 
requests either as a long URL or by appending the target URL with strings passed 
as raw data. This usually means that instead of using the `?` delimiter common in 
complex URLs, you place the phrase in quotes after a --data flag. You can use as 
many `--data` flags as necessary.
```
$ curl --request PUT \
--header "PRIVATE-TOKEN: your_access_token_here" \
--data "long=true" \
--data "per_page=10" \
"https://example.com/api/v4/namespaces"
```