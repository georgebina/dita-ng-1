# Introduction #

The DITA DTDs are modular, thus there are many file to check after conversion. Visual inspection, even assisted with a text diff is not a good option... We need to define a method for automated testing.


# Details #

The method I used to test the first version of the converter is to compare (using a text diff) the results produced by the converter with the DITA 1.2 DTD, and to inspect the results of the comaprison.

However, there are non-meaningful differences, such as the amount of whitespace, or the amount of parentheses, or the interchangeable use of single or double quotes.

In addition, there are too many files to inspect.

We need to define automated tests to validate the conversion, but this is not easy as DTD use special syntax, and require specific parsers (they are not XML files). The only tool I know that performs DTD comparison is dtddiff, part of dtdparse, available on SourceForge:

http://sourceforge.net/projects/dtdparse/

http://dtdparse.sourceforge.net/SGML-DTDParse/doc/html/bin/dtddiff.html