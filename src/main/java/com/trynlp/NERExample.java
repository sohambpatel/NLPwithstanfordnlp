package com.trynlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class NERExample {
    public static void main(String args[]){
        StanfordCoreNLP stanfordCoreNLP=NLPPipeline.getStanfordCoreNLP();
        String text="my name is bhatiya and I have a friend whose name is Robert. we both are living in Maharastra";
        CoreDocument document=new CoreDocument(text);
        stanfordCoreNLP.annotate(document);
        List<CoreLabel> list=document.tokens();
        for (CoreLabel label:list){
            String ner=label.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println(label.originalText() +"------------------"+ner);
        }
    }
}
