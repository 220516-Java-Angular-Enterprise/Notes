# Code Coverage

Code coverage is performed to verify the extent to which the code has been executed. 
Code coverage tools use static instrumentation in which statements monitoring code 
execution are inserted at necessary junctures in the code.

Now, adding instrumentation code does result in increased execution time and code 
length. But the increase is more than justified in light of the information that 
the tester gets because of the extra code.

Code coverage scripts generate a report that details how much of the application 
code has been executed. This is a white-box testing technique.

## Why perform Code Coverage?
Code coverage is primarily performed at the unit testing level. Unit tests are 
created by developers, thus giving them the best vantage from which to decide what 
tests to include in unit testing. At this point, a number of questions arise:

* Are there enough tests in the unit test suite?
* Do more tests need to be added?

Code coverage answers these questions.

As development progresses, new features and fixes are added to the codebase. 
Obviously, the test code must be changed to stay updated with these changes. 
Testing standards established at the beginning of the project must also be maintained 
throughout subsequent release cycles. Code coverage can ensure that these standards 
are maintained so that only the optimal quality code is pushed to production.

A high percentage of code coverage results in lower chances of unidentified bugs. 
It is best to set a minimum percentage of code coverage that must be achieved before 
going to production. This helps reduce the chances of bugs being detected at a later 
stage of development.

## Levels of Code Coverage

### Branch Coverage
This is used to ensure that every branch in a decision-making process is executed. 
Let’s say a tester is including a fallback for cross browser compatibility using an 
If…Else conditional statement or a Do…While statement in the code. Branch coverage 
will ensure that all branches (If, Else, Do, While) are tested with appropriate input.
### Function Coverage
This ensures that all necessary functions are tested. It also includes testing 
functions with different input parameters to test the logic in the functions.
### Statement Coverage
In this, the code is created in a way that every executable statement in the source 
code is executed at least once. This includes corner cases or boundary cases.
### Loop Coverage
This ensures that every loop in the source code is executed at least once. 
Certain loops may be executed based on results achieved at runtime. 
One must be careful to test such loops to fortify the code completely.
### Condition Coverage
This reveals how variables in the conditional statements are evaluated. It helps to 
provide proper coverage to the control flow.
### Finite State Machine Coverage
These work based on the frequency of visits from static states and other transactions. 
Finite state machine coverage is the most complicated form of code coverage as it 
functions on the design of the software structure.
Code coverage verifies with instrumentation. Instrumentation monitors performance 
inserts trace information and detects errors in the source code. The types of 
instrumentation are discussed below.

## Instrumentation Types
### Code Instrumentation
Source code is compiled after inserting instrumentation statements. 
The compilation is best done using the normal toolchain. Successful compilation 
creates instrumented assembly.
### Runtime Instrumentation
Instrumentation statements gather information from the runtime environment i.e. 
when the code is running.
### Intermediate Code Instrumentation
An instrumented class is creating by adding byte codes to the compiled class files.

## Advantages of Code Coverage
### Quantitative
Code coverage offers results in quantitative metrics which helps 
developers gauge the nature and health of their code.
### Allows introduction of test cases
If already available test cases do not test the software extensively enough, 
one can introduce their own test cases to establish robust coverage.
### Easy elimination of dead code and errors
Let’s say some parts of the entire codebase were not touched during code coverage, 
or there are sections of dead or useless code. Code coverage allows easy removal 
of such code, thus improving the efficiency of the entire code base.

# Test Coverage
Unlike code coverage, test coverage is a black-box testing technique. It monitors 
the number of tests that have been executed. Test cases are written to ensure 
maximum coverage of requirements outlined in multiple documents – 
FRS (Functional Requirements Specification), SRS (Software Requirements Specification),
URS (User Requirement Specification), etc.

The test coverage report provides information about parts of the software where 
test coverage is being implemented. Essentially, it provides information about the 
tests executed on an application or website.

## How To Perform Test Coverage?
Test coverage can also be evaluated through different types of testing. However, 
the type of tests that must be run depends on the business priorities of the 
testing team and the organization behind them. For example, user-centric web apps 
prioritize UI/UX tests over functional tests. Conversely, financial apps will 
prioritize usability and security testing over all other tests.

Some test coverage mechanisms:

### Unit Testing
Performed at a unit level or module level. Bugs at this level are widely different 
from issues encountered at the integration stage.

### Functional Testing
Functions or features are tested against requirements mentioned in the Functional 
Requirement Specification (FRS) documents.

### Acceptance Testing
Determines whether a product is suitable to be released for 
customer use. At this stage, developers will have to receive approval from testers 
and SMEs to push code changes from Staging to Production.

### Integration Testing
Also called system testing, since testing occurs on the system level. These tests 
are performed once all software modules are integrated. 

The purpose of test coverage varies depending on the level at which tests are 
performed. It also depends on the type of software being tested. Additionally, 
test coverage metrics for mobile phones would differ from those for website testing. 
Some test coverage types are:

### Features Coverage
Test cases are developed to implement maximum coverage of product features. 
For example, to test a phone dialer application the tester must ensure that the 
number being dialed is of proper length. If the number is American, it should 
have 10 digits. Otherwise, an error must occur. All mandatory & optional features 
must be tested according to priorities set by the product team.


### Risk Coverage
Every product requirement document mentions the risks associated 
with the project, as well as how to mitigate them. They are addressed in this stage 
of test coverage. However, certain risks such as changes in market conditions, 
cannot be predicted or handled by this stage. For example, while developing a 
business website, server infrastructure must be set up to ensure high-speed page 
access. Depending on the location from where the website is accessed, the closest 
server must be chosen for loading the website. If not, the user gets a low speed 
and their experience becomes sub-par. This needs to be tested.

### Requirements Coverage
Tests are defined to provide maximum coverage of the product requirements mentioned 
in Requirement documents. For example, to test a pre-installed SMS application, the 
tester must ensure that the default language is set according to location. That means 
if the mobile is being used in a country where English is not widely used 
(such as Japan) the default SMS language should be Japanese.

## Advantages of Test Coverage
* It reports on portions of the codebase that have not been covered by necessary test 
cases.


* It helps to detect the areas of test cases that are useless for the current project. 
These cases are reported and can be eliminated to make the code lighter.


* It helps developers create additional test cases as required. These additional test 
cases help ensure that test coverage is maximum.


* It is useful for preventing defect leakage.