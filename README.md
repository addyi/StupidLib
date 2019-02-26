# StupidLib

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

More examples can be found in [StupidTest](stupid/src/androidTest/java/de/eosn/stupid/StupidTest)

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


## Licence

    This is free and unencumbered software released into the public domain.
    
    Anyone is free to copy, modify, publish, use, compile, sell, or
    distribute this software, either in source code form or as a compiled
    binary, for any purpose, commercial or non-commercial, and by any
    means.