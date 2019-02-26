# StupidLib

[![](https://jitpack.io/v/addyi/StupidLib.svg)](https://jitpack.io/#addyi/StupidLib)
[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)

[![forthebadge](https://forthebadge.com/images/badges/built-for-android.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/built-by-developers.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/uses-badges.svg)](https://forthebadge.com)

This is a stupid Android Library. It was created for test purposes. StupidLib provides an interface to request the word `stupid` for different locals.

## Usage

```kotlin
Stupid.forLocal(Locale.ENGLISH) // stupid
Stupid.forLocal(Locale.GERMAN) // blöd
Stupid.forLocal() // device local
Stupid.forLocal(null) // device local
Stupid.forLocal(Locale.ROOT) // default value (stupid)
Stupid.forLocal(Locale.JAPANESE) // unsupported local => default value (stupid)
```

More examples can be found in [StupidTest](stupid/src/androidTest/java/de/eosn/stupid/StupidTest.kt)

This project can also be build as example Android App

## Local

Supported Locals:

- `Locale.UK`
- `Locale.ENGLISH`
- `Locale.CANADA`
- `Locale.US`
- `Locale.GERMANY`
- `Locale.GERMAN`
- `Locale.ITALIAN`
- `Locale.ITALY`
- `Locale.FRANCE`
- `Locale.FRENCH`
- `Locale.CANADA_FRENCH`
- `Locale.KOREA`
- `Locale.KOREAN`

## Including in your project

StupidLib is available via [JitPack](https://jitpack.io/#addyi/StupidLib), so getting it is simple:

**Step 1.** Add the JitPack repository to your root build file

```groovy
    allprojects {
        repositories {
            // ...
            maven { url 'https://jitpack.io' }
        }
    }
```

**Step 2.** Add the dependency

```groovy
    dependencies {
        implementation 'com.github.addyi:StupidLib:Tag'
    }
```


## Licence

    This is free and unencumbered software released into the public domain.
    
    Anyone is free to copy, modify, publish, use, compile, sell, or
    distribute this software, either in source code form or as a compiled
    binary, for any purpose, commercial or non-commercial, and by any
    means.