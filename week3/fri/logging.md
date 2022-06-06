# Logging

Logging is the process of writing log messages during the execution of a program to 
a central place. This logging allows you to report and persist error and warning 
messages as well as info messages (e.g., runtime statistics) so that the messages 
can later be retrieved and analyzed.

The object which performs the logging in applications is typically just called Logger.

## Logging in Java

Java contains the Java Logging API. This logging API allows you to configure which 
message types are written. Individual classes can use this logger to write messages 
to the configured log files.

The `java.util.logging` package provides the logging capabilities via the Logger class.

### Create a Logger

```
import java.util.logging.Logger;

// assumes the current clas is called MyLogger
private final static Logger LOGGER = Logger.getLogger(MyLogger.class.getName());
```

The Logger you create is actually a hierarchy of Loggers, and a `.` (dot) in the 
hierarchy indicates a level in the hierarchy. So if you get a Logger for the 
`com.example` key, this Logger is a child of the `com` Logger and the `com` Logger is 
child of the Logger for the empty `String`. You can configure the main logger and 
this affects all its children.

### Level

The log levels define the severity of a message. The `Level` class is used to define 
which messages should be written to the log.

The following lists the Log Levels in descending order:

* `SEVERE` (highest)

* `WARNING`

* `INFO`

* `CONFIG`

* `FINE`

* `FINER`

* `FINEST`

In addition to that you also have the levels `OFF` and `ALL` to turn the logging off 
or to log everything.

For example, the following code sets the logger to the info level, which means all 
messages with severe, warning and info will be logged.

`LOGGER.setLevel(Level.INFO);`

### Handler
Each logger can have access to several handlers.

The handler receives the log message from the logger and exports it to a certain target.

A handler can be turned off with the `setLevel(Level.OFF)` method and turned on with 
`setLevel()` method.

You have several standard handlers. The following list gives some examples.

* `ConsoleHandler`: Write the log message to console

* `FileHandler`: Writes the log message to file

Log levels `INFO` and higher will be automatically written to the console.

### Formatter
Each handler’s output can be configured with a formatter

Available formatters:

* `SimpleFormatter`: Generate all messages as text

* `XMLFormatter`: Generates XML output for the log messages

You can also build your own formatter. The following is an example of a formatter 
which will create `HTML` output.

```
package com.vogella.logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

// this custom formatter formats parts of a log record to a single line
class MyHtmlFormatter extends Formatter {
    // this method is called for every log records
    public String format(LogRecord rec) {
        StringBuffer buf = new StringBuffer(1000);
        buf.append("<tr>\n");

        // colorize any levels >= WARNING in red
        if (rec.getLevel().intValue() >= Level.WARNING.intValue()) {
            buf.append("\t<td style=\"color:red\">");
            buf.append("<b>");
            buf.append(rec.getLevel());
            buf.append("</b>");
        } else {
            buf.append("\t<td>");
            buf.append(rec.getLevel());
        }

        buf.append("</td>\n");
        buf.append("\t<td>");
        buf.append(calcDate(rec.getMillis()));
        buf.append("</td>\n");
        buf.append("\t<td>");
        buf.append(formatMessage(rec));
        buf.append("</td>\n");
        buf.append("</tr>\n");

        return buf.toString();
    }

    private String calcDate(long millisecs) {
        SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        Date resultdate = new Date(millisecs);
        return date_format.format(resultdate);
    }

    // this method is called just after the handler using this
    // formatter is created
    public String getHead(Handler h) {
        return "<!DOCTYPE html>\n<head>\n<style>\n"
            + "table { width: 100% }\n"
            + "th { font:bold 10pt Tahoma; }\n"
            + "td { font:normal 10pt Tahoma; }\n"
            + "h1 {font:normal 11pt Tahoma;}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<h1>" + (new Date()) + "</h1>\n"
            + "<table border=\"0\" cellpadding=\"5\" cellspacing=\"3\">\n"
            + "<tr align=\"left\">\n"
            + "\t<th style=\"width:10%\">Loglevel</th>\n"
            + "\t<th style=\"width:15%\">Time</th>\n"
            + "\t<th style=\"width:75%\">Log Message</th>\n"
            + "</tr>\n";
      }

    // this method is called just after the handler using this
    // formatter is closed
    public String getTail(Handler h) {
        return "</table>\n</body>\n</html>";
    }
}
```

### Log Manager

The log manager is responsible for creating and managing the logger and the 
maintenance of the configuration.

We could set the logging level for a package, or even a set of packages, by calling 
the `LogManager.setLevel(String name, Level level)` method. So, for example, we 
could set the logging level of all loggers to `Level.FINE` by making this call:

```
LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).setLevel(Level.FINE);
```

### Best Practices
It is common practice to use the fully qualified name of each class whose activity 
is being logged as a message category, because this allows developers to fine-tune 
log settings for each class.

Using the fully qualified class name of your class as the name of your Logger is 
the approach recommended by the Logging API documentation.

## Example

### Create the Logger

This example is stored in the project called `com.vogella.logger`.

Create your own formatter class.
```
package com.vogella.logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

// this custom formatter formats parts of a log record to a single line
class MyHtmlFormatter extends Formatter {
// this method is called for every log records
public String format(LogRecord rec) {
StringBuffer buf = new StringBuffer(1000);
buf.append("<tr>\n");

        // colorize any levels >= WARNING in red
        if (rec.getLevel().intValue() >= Level.WARNING.intValue()) {
            buf.append("\t<td style=\"color:red\">");
            buf.append("<b>");
            buf.append(rec.getLevel());
            buf.append("</b>");
        } else {
            buf.append("\t<td>");
            buf.append(rec.getLevel());
        }

        buf.append("</td>\n");
        buf.append("\t<td>");
        buf.append(calcDate(rec.getMillis()));
        buf.append("</td>\n");
        buf.append("\t<td>");
        buf.append(formatMessage(rec));
        buf.append("</td>\n");
        buf.append("</tr>\n");

        return buf.toString();
    }

    private String calcDate(long millisecs) {
        SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        Date resultdate = new Date(millisecs);
        return date_format.format(resultdate);
    }

    // this method is called just after the handler using this
    // formatter is created
    public String getHead(Handler h) {
        return "<!DOCTYPE html>\n<head>\n<style>\n"
            + "table { width: 100% }\n"
            + "th { font:bold 10pt Tahoma; }\n"
            + "td { font:normal 10pt Tahoma; }\n"
            + "h1 {font:normal 11pt Tahoma;}\n"
            + "</style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<h1>" + (new Date()) + "</h1>\n"
            + "<table border=\"0\" cellpadding=\"5\" cellspacing=\"3\">\n"
            + "<tr align=\"left\">\n"
            + "\t<th style=\"width:10%\">Loglevel</th>\n"
            + "\t<th style=\"width:15%\">Time</th>\n"
            + "\t<th style=\"width:75%\">Log Message</th>\n"
            + "</tr>\n";
      }

    // this method is called just after the handler using this
    // formatter is closed
    public String getTail(Handler h) {
        return "</table>\n</body>\n</html>";
    }
}
```

Initialize the logger via the following code. This `Logger` class 
uses the new `HTML` formatter you created.

```
package com.vogella.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    static private FileHandler fileTxt;
    static private SimpleFormatter formatterTxt;

    static private FileHandler fileHTML;
    static private Formatter formatterHTML;

    static public void setup() throws IOException {

        // get the global logger to configure it
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // suppress the logging output to the console
        Logger rootLogger = Logger.*getLogger*("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }

        logger.setLevel(Level.INFO);
        fileTxt = new FileHandler("Logging.txt");
        fileHTML = new FileHandler("Logging.html");

        // create a TXT formatter
        formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        logger.addHandler(fileTxt);

        // create an HTML formatter
        formatterHTML = new MyHtmlFormatter();
        fileHTML.setFormatter(formatterHTML);
        logger.addHandler(fileHTML);
    }
}
```

### Use the Logger

The following example class demonstrates how you can use your `MyLogger` class to 
create log messages.

```
package com.vogella.logger.test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.vogella.logger.MyLogger;

public class UseLogger {
    // use the classname for the logger, this way you can refactor
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    public void doSomeThingAndLog() {
        // ... more code

        // now we demo the logging

        // set the LogLevel to Severe, only severe Messages will be written
        LOGGER.setLevel(Level.SEVERE);
        LOGGER.severe("Info Log");
        LOGGER.warning("Info Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");

        // set the LogLevel to Info, severe, warning and info will be written
        // finest is still not written
        LOGGER.setLevel(Level.INFO);
        LOGGER.severe("Info Log");
        LOGGER.warning("Info Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");
    }

    public static void main(String[] args) {
        UseLogger tester = new UseLogger();
        try {
            MyLogger.setup();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
        }
        tester.doSomeThingAndLog();
    }
}
```
