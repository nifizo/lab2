package com.example;

import com.example.parser.DOMParser;
import com.example.parser.SAXParser;
import com.example.parser.StAXParser;

public class Main {

    public static void main(String[] args) throws Exception {
        {
            System.out.println("DOM");
            var papers = DOMParser.apply(Strings.KNIFES_PATH);
            System.out.println(papers);
            System.out.println();
        }

        {
            System.out.println("StAX");
            var papers = StAXParser.apply(Strings.KNIFES_PATH);
            System.out.println(papers);
            System.out.println();
        }

        {
            System.out.println("SAX");
            var papers = SAXParser.apply(Strings.KNIFES_PATH);
            System.out.println(papers);
            System.out.println();
        }
    }
}
