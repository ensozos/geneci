## GeneCI

<p align="center">
   <img src="images/geneci_logo.png" width="300" alt="geneci_logo">
</p>

[![Build Status](https://travis-ci.org/ensozos/geneci.svg?branch=master)](https://travis-ci.org/ensozos/geneci)
![GitHub](https://img.shields.io/github/license/ensozos/geneci.svg)
![GitHub issues](https://img.shields.io/github/issues-raw/ensozos/geneci.svg)

GeneCI allows developers to generate class information for object oriented programming languages. It uses
[Antlr](https://github.com/antlr/antlr4) to generate lexers parsers and tree parsers for grammar specification of your language.

GeneCI is a way of extracting structural information of your source code that can be used to generate UML and static Call Graph representations. 
These types of representations have important applications in software development, maintenance, security  and other technical domains. Unlike other
UML or Call Graph tools, GeneCI is free, open source and you can use it with any programming language you like.


## Quick Start

Dowload 'geneci-tool.jar' from github releases. Start with 'java' command:

```bash
wget https://github.com/ensozos/geneci/releases/tag/v0.0.1-alpha
java -jar geneci-tool.jar <your-src-folder> <language>
```

Note that you need to define both input parameters, full path of the source folder and the programming language in this order.
The current version of 'geneci-tool' produces a JSON output in the following format:

###### Entities

An entity can be a Class, Interface, Enum etc. The example below means that in our source folder we have a Class
called Foo that extends RandomAbstractClass implements the interface RandomInterface and has an InnerEntity
called Bar. In this example there are no methods or attributes in the class. 


```json
[
  {
      "EntityName": "Foo",
      "EntityType": "CLASS",
      "ExtendClass": ["RandomAbstractClass"],
      "ImplementClass": ["RandomInterface"],
      "InnerEntity": ["Bar"],
      "Methods": [],
      "Attributes": []
  }
]
```

###### Methods

Lets see an entity with one simple method in it (we are going to present only the method value of the entity). The class of our example has a single method with name getDistance (which is not a constructor) with no parameters, and
returns a Double. Also this method calls other methods like singlePad and compute.

```json
[
  {
     
      "Methods": [
            {
              "Name": "getDistance",
              "ReturnType": "Double",
              "Parameters": [  ],
              "IsConstructor": false,
              "Calls": [
                "singlePad",
                "compute"
              ]
            }
      ],
      "Attributes": []
  }
]
```

###### Attributes

The attributes of the class in the format presented below. More precisely we have one attribute in our class called threshold which is private and double. 

```json
[
  {
     
      "Attributes": [ {
                             "Name": "threshold",
                             "Visibility": "private",
                             "Type": "double"
                      }]
  }
]
```

## Supported Languages

Currently GeneCI supports only Java programming language. More languages coming soon.

* Java
* C++ (coming soon)
* C#  (coming soon)


## Contributing

If you want to contribute to CeneCI and make it better with more supported languages or new features, your help is more than welcome. The steps to extend GeneCI with new 
programming language described here:

1. Before you start to work, file an issue describing your proposed change (to avoid duplicate effort).
2. Define the grammar for the language you want to add. This [repository](https://github.com/antlr/grammars-v4) is a collections of many grammars.
3. Generate lexer, parser and listener for your selected grammar with [antlr](https://www.antlr.org/download.html) tool. There are many ways do that,
 a simple tutorial describing the process can be found [here](https://riptutorial.com/antlr) 
4. Place generated classes in proper packages.
5. Your generated lexer, parser and listener needs to implement ILexer, IParser and ILanguageListener, respectively. You will also need to overload constructors
 in your lexer and parser so that can constructs objects without parameters (see the Java version). This step is important in order to limit coupling with other classes.
6. Once you get the abstract syntax tree from the parser you want to process it using a listener. In this step you create listener
 (for example SimpleJavaClassInfoListener that is already implemented) and ensure that you fill entities with all valid information.
7. Open a pull request and update your open issue (step 1).

> 👉 If you find something missing from README file, feel free to contribute and update it or make some new one.

## License

Distributed under the GPL-3 license. See LICENSE for more information.