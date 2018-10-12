# INSTALLING & COMPILING  JPL 

Updated: October 12, 2018 9


* Information on how to [use JPL in Windows and Linux](https://github.com/ssardina-research/packages-jpl/wiki/JPL-Under-Linux-and-Windows)
* Information how to [set-up JPL in MacOS](https://github.com/ssardina-research/packages-jpl/wiki/JPL-under-Mac-OS)


# General 

To use JPL, three libraries need to be placed where each can be found:

 * `jpl.dll/.so/.dylib` must be found by the Windows/Linux/MacOS kernel:
    * In Windows, can go in any folder on your `PATH`; perhaps `%SWI_HOME_DIR%\bin` or your Windows system folder.
    * In Linux, it generally in `/usr/lib/swi-prolog/lib/amd64/libjpl.so`
    * In MacOS, it can install in `/usr/local/lib/swipl-7.7.19/lib/x86_64-darwin17.7.0/libswipl.dylib`
 * `jpl.jar` must be found by any Java VMs (and compilers) used with JPL; one possibility is to put it on your global `CLASSPATH`.
 * `jpl.pl` is a Prolog source module, and must be found by any SWI-Prolog engines used with JPL
    * Would generally be in `%SWI_HOME_DIR%\library`
     

# MacOS

# Using Oracle's SDK

Download from

  - http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html

which installs

  - /Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Home

Set $JAVAPREFIX to

  - /Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Home/bin

 .dylib