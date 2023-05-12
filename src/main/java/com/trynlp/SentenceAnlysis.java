package com.trynlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceAnlysis {
    public static void main(String args[]){
        StanfordCoreNLP stanfordCoreNLP=NLPPipeline.getStanfordCoreNLP();
        String text="This is sence demo and hence adding more sentences, this is comma test. this is fullstop text; and this is another sentence";
        CoreDocument document=new CoreDocument(text);
        stanfordCoreNLP.annotate(document);
        List<CoreSentence> sentences=document.sentences();

        for(CoreSentence sentence:sentences){
            System.out.println(sentence.text());
        }
    }
}
