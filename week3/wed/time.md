# New Date-Time API in Java 8

New date-time API is introduced in Java 8 to overcome the 
following drawbacks of old date-time API:

* Not thread safe : Unlike old `java.util.Date` which is not thread safe 
the new date-time API is immutable and doesn’t have setter methods.


* Less operations : In old API there are only few date operations but 
the new API provides us with many date operations.

Java 8 under the package `java.time` introduced a new date-time API, 
most important classes among them are :

`Local` : Simplified date-time API with no complexity of timezone 
handling.

`Zoned` : Specialized date-time API to deal with various timezones.

## LocalDate/LocatTime and LocalDateTime API

### Import
```
1. java.time.*
   // To include all classes

2. java.time.LocalDate
   // for LocalDate

3. java.time.LocalDateTime
   // for LocalDateTime

4. java.time.time
   // for LocalTime
   ```

| Class           | 	Description                                      |
|-----------------|---------------------------------------------------|
| `LocalDate`     | 	LocalDate class can hold the Date only.          |
| `LocalTime`     | 	LocalTime class can hold the Time only.          |
| `LocalDateTime` | LocalDateTime class holds both the Date and Time. |

### Methods

**Method**: `now()` method

The `now()` method of a `LocalDate` class used to obtain the current 
date from the system clock in the default time-zone. This method 
will return `LocalDate` based on the system clock with the default 
time-zone to obtain the current date.

**Syntax**:

`public static LocalDate now()`

**Return value**: This method returns the current date using 
the system clock and default time-zone.

| Methods                               | 	Description                                                               |
|---------------------------------------|----------------------------------------------------------------------------|
| `getDayOfMonth()`                     | 	Returns the day of the month. For example, say it be 28                   |
| `getDayOfWeek()`                      | 	Returns the weekday. For example, say it be SUNDAY                        |
| `getDayOfYear()`                      | 	Returns the day w.r.t. the year. For example, say it be 59                |
| `getMonth()`                          | 	Returns the name of the month. For example, say it be FEBRUARY            |
| `getMonthValue()`                     | 	Returns the numeric value of the month. For example, say it be 2          |
| `isLeapYear()`                        | 	Returns boolean value (true/false). For example, say it be false.         |
| `lengthOfYear()`                      | 	Returns the number of days in that year. For example, say it be 365.      |
| `lengthOfMonth()`                     | 	Returns the number of days in that year. For example, say ut be 28.       |
| `plusDays(numberOfDaysToBeAdded)`     | 	Returns a new date after adding the number of days to the current date.   |
| `plusMonths(numberOfMonthsToBeAdded)` | 	Returns a new date after adding the number of months to the current date. |
| `plusYears(numberOfYearsToBeAdded)`   | 	Returns a new date after adding the number of years to the current date.  |

Similar methods are available of subtracting date. `minusDays()`, 
`minusMonths()`, `minusYears()`. These functions are also available 
for the `LocalDateTime` class, adding some more related to time. 
Such as `plusHours()`, `plusMinutes()`, `plusSeconds(`), `plusNanos()` 
and many more.

## Zoned date-time API

### Import

```
import java.time.ZoneId;
import java.time.ZonedDateTime;
```

### Methods

```
// to get the current zone
    ZonedDateTime currentZone = ZonedDateTime.now();
```

```
// getting time zone of specific place
    ZoneId tokyo = ZoneId.of("Asia/Tokyo");
```
`withZoneSameInstant()`: it is used to return a copy of 
this date-time with a different time-zone, retaining the instant.

```
ZonedDateTime tokyoZone =
    currentZone.withZoneSameInstant(tokyo);
```

## Formatting Date and Time

You can use the `DateTimeFormatter` class with the `ofPattern()` 
method in the same package to format or parse date-time objects. 

### Example
```
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
```

The `ofPattern()` method accepts all sorts of values, if you 
want to display the date and time in a different format. For example:

| Value	         | Example             |
|----------------|---------------------|
| yyyy-MM-dd     | 	"1988-09-29"       |
| dd/MM/yyyy     | 	"29/09/1988"       |
| dd-MMM-yyyy    | 	"29-Sep-1988"      |
| E, MMM dd yyyy | 	"Thu, Sep 29 1988" |


