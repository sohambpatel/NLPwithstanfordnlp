package com.trynlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class Lemmatization {

    public static void main(String args[]){
        StanfordCoreNLP stanfordCoreNLP=NLPPipeline.getStanfordCoreNLP();
        String text="this is very good and I am liking it";
        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelLists=coreDocument.tokens();
        for (CoreLabel coreLabelList : coreLabelLists){
            String lemma=coreLabelList.lemma();
            System.out.println(coreLabelList.originalText() +"-----------------------------"+lemma);
        }
    }
}
