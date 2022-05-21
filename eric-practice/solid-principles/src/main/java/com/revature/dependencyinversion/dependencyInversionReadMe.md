# What is Dependency Inversion

- Depend on abstraction not concretion
- Design software in a way that various modules can be separated from each other using abstract layer to  bind them together

# Why

- It allows programmer to remove hardcoded dependencies, so application becomes loosely coupled and extandable.
- It allows for better testing, you want to seperate the object a class depends on and the fuctions of that class.
  - Example say we have a laptop, we want to test the features of the laptop without worrying about the hardrive (using mock object).