package com.trynlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentAnalyse {
    public static void main(String args[]){
        StanfordCoreNLP stanfordCoreNLP=NLPPipeline.getStanfordCoreNLP();
        String text="i hate this place";

        CoreDocument document=new CoreDocument(text);
        stanfordCoreNLP.annotate(document);
        List<CoreSentence> labelLists=document.sentences();
        for (CoreSentence sentence:labelLists){
            String sent=sentence.sentiment();
            System.out.println(sent);
        }
    }
}
