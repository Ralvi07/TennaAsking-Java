# TennaAsking (Java)

The original JavaFX Valentine app, recovered from the Windows installation's `Project_Test.jar`. This repository includes the decompiled source and all eight files from the JAR's `resources` directory.

## Download

Download [TennaAsking-Java-Windows-x64.zip](https://github.com/Ralvi07/TennaAsking-Java/releases/latest/download/TennaAsking-Java-Windows-x64.zip) and extract the entire ZIP. Open the extracted folder and run `TennaAsking-Java.exe`. The folder includes the Java and JavaFX runtime.

## Build and run on Windows

Install JDK 21 and unpack the JavaFX 21 SDK for Windows. In PowerShell, set the path to the SDK's `lib` directory, then run these commands from this repository.

```powershell
$javafx = 'C:\path\to\javafx-sdk-21\lib'
New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 --module-path $javafx --add-modules javafx.controls,javafx.media -d out ValentineApp.java
Copy-Item -Path resources -Destination out -Recurse -Force
java --module-path $javafx --add-modules javafx.controls,javafx.media -cp out ValentineApp
```

The app retains the original text, animations, and music. The bundled media includes DELTARUNE material and music by Toby Fox. The Java source was decompiled with CFR 0.152.
