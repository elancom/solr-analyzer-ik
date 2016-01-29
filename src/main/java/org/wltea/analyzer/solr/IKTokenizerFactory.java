package org.wltea.analyzer.solr;

import java.util.Map;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.TokenizerFactory;
import org.apache.lucene.util.AttributeFactory;
import org.wltea.analyzer.lucene.IKTokenizer;

// 支持solr5.4 
public class IKTokenizerFactory extends TokenizerFactory {

	private boolean useSmart;

	public IKTokenizerFactory(Map<String, String> args) {
		super(args);
		useSmart = getBoolean(args, "useSmart", false);
	}

	@Override
	public Tokenizer create(AttributeFactory factory) {
		return new IKTokenizer(factory, useSmart);
	}

}
