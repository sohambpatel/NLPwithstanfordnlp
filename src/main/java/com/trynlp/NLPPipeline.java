package com.trynlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class NLPPipeline {

    private static StanfordCoreNLP stanfordCoreNLP;
    private static Properties properties;
    private static String property="tokenize,ssplit,pos,lemma,ner,parse,sentiment";

    private NLPPipeline() {

    }

    static{
        properties=new Properties();
        properties.setProperty("annotators",property);
    }

    public static StanfordCoreNLP getStanfordCoreNLP(){
        if(stanfordCoreNLP==null){
            stanfordCoreNLP=new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }
}
