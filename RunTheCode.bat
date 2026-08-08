@echo off
title Amount Denominations Distinguisher
echo Compiling and running application...
echo.

javac Main.java
if %errorlevel% equ 0 (
    java Main
) else (
    echo Compilation failed. Please check your Java code.
)

echo.
pause