# SPDX License Checker
A small Java library that provides an easy way to check whether or not an ID / name is a valid SPDX license.

## Introduction
The Software Package Data Exchange (SPDX) specification is a standard format for communicating the components, licenses and copyrights associated with a software package.
It comes with [an exhaustive list of licenses](http://spdx.org/licenses/) that have standarised names and unique identifier. 

I was looking for a quick way to check whether or not a particular ID or name was a valid SPDX license but couldn't find any library to do it, therefore I created my own :)

## Download
Download [the latest JAR](https://search.maven.org/remote_content?g=com.github.tbouron&a=spdx-license-checker&v=LATEST) or grab via Maven:
```xml
<dependency>
  <groupId>com.github.tbouron</groupId>
  <artifactId>spdx-license-checker</artifactId>
  <version>1.0.0</version>
</dependency>
```
or Gradle:
```groovy
compile 'com.github.tbouron:spdx-license-checker:1.0.0'
```

Snapshots of the development version are available in [Sonatype's `snapshots` repository](https://oss.sonatype.org/content/repositories/snapshots/).

License
=======

    Copyright 2016 Thomas Bouron.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

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
