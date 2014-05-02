Jtemplate
=========

A java project template used for all my java projects. It uses the following tools

  * Gradle 
  * [Pegdown doclet](https://github.com/Abnaxos/pegdown-doclet) for enhanced java documentation. You can now add Markdown tags to your java docs.
  * Standard logging libraries - SLF4J
  * The [Checker framework](http://types.cs.washington.edu/checker-framework/) comes pre-packaged with quite a few type systems, that verify nullability, tainting, regular expressions, physical units, immutability and more.
  * [Metrics](http://metrics.codahale.com/) - provides a powerful toolkit of ways to measure the behavior of critical components in your production environment.
  * [Jolokia](http://www.jolokia.org/index.html) - is a JMX-HTTP bridge giving an alternative to JSR-160 connectors. It is an agent based approach with support for many platforms. In addition to basic JMX operations it enhances JMX remoting with unique features like bulk requests and fine grained security policies.
  
Installation

   <pre> You will need java 1.7 or above </pre>
   <pre> Install Gradle version 1.12 </pre>
   
   Just clone this repository
   Run ```
         bash gradle run 
       ``` 
       under the project's root directory
 
   Run ```bash
         gradle javadoc 
       ```
       to generate the enhanced javadocs
  
### Screenshots 

 Here is a screenshot of a Markdown enhanced javadoc.
 
![Alt text](/resources/javadoc-demo.gif "Screenshot of Markdown Enhanced Javadoc")
