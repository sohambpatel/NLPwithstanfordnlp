package com.trynlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class POSExample {
    public static void main(String args[]){
        StanfordCoreNLP stanfordCoreNLP=NLPPipeline.getStanfordCoreNLP();
        String text="Hey! this is Bhatiya";
        CoreDocument document=new CoreDocument(text);
        stanfordCoreNLP.annotate(document);
        List<CoreLabel> label=document.tokens();
        for (CoreLabel labels:label){
            String pos=labels.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(labels.originalText() + "____________________"+pos);
        }

    }
}
