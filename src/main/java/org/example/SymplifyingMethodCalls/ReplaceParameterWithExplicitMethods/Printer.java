package org.example.SymplifyingMethodCalls.ReplaceParameterWithExplicitMethods;

public class Printer {
    public void printTextDocument(String content){
        System.out.println("Printing text document: " + content);
    }

    public void printImageDocument(String content){
        System.out.println("Printing image "+ content);
    }
}
