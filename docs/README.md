# JPL 7.4+ - Java - SWI Prolog Interface

JPL is a "library using the SWI-Prolog foreign interface and the Java jni interface providing a _bidirectional interface between Java and Prolog_ that can be used to embed Prolog in Java _as well_ as for embedding Java in Prolog. In both setups it provides a reentrant bidirectional interface."

The objectives of JPL are to:

* enable Prolog applications to exploit any Java classes, instances, methods etc. (without requiring any wrappers, metadata etc. to be set up first);
* enable Java applications to manipulate any Standard Prolog libraries, predicates, etc. (without requiring any wrappers, metadata etc. to be set up first);
* enable hybrid Prolog+Java applications to be designed and implemented so as to take best advantage of both language systems, and to be testable, debuggable, maintainable.

## Wiki Outline

1. Setup and Install
    * [JPL-Under-Linux-and-Windows](JPL-Under-Linux-and-Windows).
    * [JPL-under-Mac-OS](JPL-under-Mac-OS): how to set it up under Mac OS.
    * [Developing-JPL](Developing-JPL): how to set-up a development install for JPL.
2. [Getting-Started:-An-Example-Tutorial](https://github.com/ssardina-research/packages-jpl/wiki/Getting-Started:-An-Example-Tutorial/Getting-Started:-An-Example-Tutorial): a walkthrough how one would use JPL from Java.
3. Specific Information:
    * [Types-of-Queries:-One-shot-vs-Iterative](https://github.com/ssardina-research/packages-jpl/wiki/Getting-Started:-An-Example-Tutorial/Types-of-Queries:-One-shot-vs-Iterative): reference of the main high-level interface offered to access Prolog from Java.
4. Subtle/Advanced Aspects:
    * [Multi-Threaded-Queries](Multi-Threaded-Queries): how to use JPL with iterative queries and multi-threaded applications.
   

## Important Links

* The main current JPL 7 site: <https://jpl7.org/)
  * It includes the [Java API](https://jpl7.org/JavaApiOverview.jsp) (to access Prolog from Java) and the [Prolog API](https://jpl7.org/PrologApiOverview.jsp) (to access Java from Prolog).
* The main Github repository for JPL 7 (which this one is a fork of): <https://github.com/SWI-Prolog/packages-jpl> 
* The documentation of SWI `library(jpl)`: <http://www.swi-prolog.org/pldoc/man?section=jpl>
* The old JPL 3.x documentation: <http://www.swi-prolog.org/packages/jpl/>