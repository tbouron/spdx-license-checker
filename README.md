# SPDX License Checker
A small Java library that provides an easy way to check whether or not an ID / name is a valid SPDX license.

## Introduction
The Software Package Data Exchange (SPDX) specification is a standard format for communicating the components, licenses and copyrights associated with a software package.
It comes with [an exhaustive list of licenses](http://spdx.org/licenses/) that have standarised names and unique identifier. 

I was looking for a quick way to check whether or not a particular ID or name was a valid SPDX license but couldn't find any library to do it, therefore I created my own :)

## Usage
The library packages an `enum` that contains all functions needed. For instance:

```java
// Check if a given ID is a valid SPDX license ID
SpdxLicense.isValidId("Apache-2.0"); // return true
SpdxLicense.isValidId("Test"); // return false

// Check if a given name is a valid SPDX license name
SpdxLicense.isValidName("Apache License 2.0"); // return true
SpdxLicense.isValidName("My private license"); // return false
```

You can get an `SpdxLicense` instance by passing an ID / name

```java
// Get SPDX license instance from a given ID
SpdxLicense.fromId("Apache-2.0"); // Return SpdxLicense.APACHE_2_0
SpdxLicense.fromId("Test"); // Return null

// Get SPDX license instance from a given name
SpdxLicense.fromName("Apache License 2.0"); // Return SpdxLicense.APACHE_2_0
SpdxLicense.fromName("My private license"); // Return null
```
