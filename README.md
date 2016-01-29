# solr-analyzer-ik

solr | description|download
---------|------------|------------
 5.4.0+ | supported|[solr-analyzer-ik-5.4.0.jar](https://github.com/elancom/solr-analyzer-ik/releases/download/5.4.0/solr-analyzer-ik-5.4.0.jar)
 
##config
```xml
 <fieldType name="text_ik" class="solr.TextField">
    <analyzer type="index">
      <tokenizer class="org.wltea.analyzer.solr.IKTokenizerFactory" useSmart="false"/>
    </analyzer>
 </fieldType>   
```
