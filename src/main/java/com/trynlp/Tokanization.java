package com.trynlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Tokanization {

    public static void main(String args[]){
        StanfordCoreNLP stanfordCoreNLP=NLPPipeline.getStanfordCoreNLP();
        String text="Hello there! this is tokanization demo, bare with me :)";

        CoreDocument coreDocument=new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreDocumentList=coreDocument.tokens();

        for (CoreLabel item : coreDocumentList){
            System.out.println(item.originalText());
        }
    }
}
