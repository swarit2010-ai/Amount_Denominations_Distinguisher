@echo off
title Amount Denominations Distinguisher
echo Compiling and running application...
echo.

javac Code.java
if %errorlevel% equ 0 (
    java Code
) else (
    echo Compilation failed. Please check your Java code.
)

echo.
pause